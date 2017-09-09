package com.eric.cookbook.network;

import com.eric.cookbook.bean.CookCategory;
import com.eric.cookbook.bean.MenuListBean;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/28.
 */

public interface CookApi {
    @GET("category?parentid=&dtype=&key=6f597fb6ed516489fbee2963b142f95b")
    Observable<CookCategory> getCookCategory(@Header("Cache-Control") String cacheControl);

    @GET("index")
    Observable<MenuListBean> getMenulistByTAG(@Header("Cache-Control") String cacheControl,@QueryMap Map<String,  String> paramMap);

    @GET("queryid")
    Observable<MenuListBean> getMenuListById(@Header("Cache-Control") String cacheControl,@QueryMap Map<String, String> paramMap);

    @GET("query")
    Observable<MenuListBean> getMenuListByContent(@Header("Cache-Control") String cacheControl,@QueryMap Map<String, String> paramMap);

}
