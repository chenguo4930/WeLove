package com.example.cheng.welove.service.presenter;

import android.content.Context;
import android.content.Intent;

import com.example.cheng.welove.service.entity.Book;
import com.example.cheng.welove.service.manager.DataManager;
import com.example.cheng.welove.service.view.BookView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * BookPresenter实现了我们定义的基础Presenter，
 * 在onCreate中我们创建了DataManager的实体类，
 * 便于调用RetrofitService中的方法，
 * 还新建了一个CompositeSubscription对象，
 * CompositeSubscription是用来存放RxJava中的订阅关系的。
 * 注意请求完数据要及时清掉这个订阅关系，不然会发生内存泄漏。
 * 可在onStop中通过调用CompositeSubscription的unsubscribe方法来取消这个订阅关系，
 * 不过一旦调用这个方法，那么这个CompositeSubscription也就无法再用了，要想再用只能重新new一个。
 * 然后我们可以看到在attachView中，我们把BookView传进去。
 * 也就是说我们要把请求下来的实体类交给BookView来处理。
 * 接下来我们定义了一个方法getSearchBooks，名字和入参都和请求接口RetrofitService中的方法相同。
 * 这里的这个方法也就是请求的具体实现过程
 * <p>
 * Created by cheng on 2017/2/16.
 */
public class BookPresenter implements Presenter {
    private DataManager manager;
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;
    private BookView mBookView;
    private Book mBook;

    public BookPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onCreate() {
        manager = new DataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {
    }

    @Override
    public void attachView(com.example.cheng.welove.service.view.View view) {
        mBookView = (BookView) view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {
    }

    public void getSearchBooks(String name, String tag, int start, int count) {
        mCompositeSubscription.add(
                manager.getSearchBooks(name, tag, start, count)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<Book>() {
                            @Override
                            public void onCompleted() {
                                if (mBook != null) {
                                    mBookView.onSuccess(mBook);
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                e.printStackTrace();
                                mBookView.onError("请求失败！！");
                            }

                            @Override
                            public void onNext(Book book) {
                                mBook = book;
                            }
                        }));
    }
}