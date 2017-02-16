package com.example.cheng.welove.service.manager;

import android.content.Context;
import com.example.cheng.welove.service.RetrofitHelper;
import com.example.cheng.welove.service.RetrofitService;
import com.example.cheng.welove.service.entity.Book;
import rx.Observable;
/**
 * 这个类其实就是为了让你更方便的调用RetrofitService 中定义的方法
 * 以后无论在哪个要调用方法时直接在DataManager 中调用就可以了，
 * 而不是重复建立RetrofitService 的实例化，再调用其中的方法。
 *
 * Created by cheng on 2017/2/16.
 */
public class DataManager {

    private RetrofitService mRetrofitService;

    public DataManager(Context context) {
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }

    public Observable<Book> getSearchBooks(String name, String tag, int start, int count) {
        return mRetrofitService.getSearchBook(name, tag, start, count);
    }
}
