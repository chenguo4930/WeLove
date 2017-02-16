package com.example.cheng.welove.service;

import com.example.cheng.welove.service.entity.Book;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by cheng on 2017/2/16.
 */
public interface RetrofitService {

    @GET("book/search")
    Observable<Book> getSearchBook(@Query("q") String name,
                                   @Query("tag") String tag,
                                   @Query("start") int start,
                                   @Query("count") int count);


}
