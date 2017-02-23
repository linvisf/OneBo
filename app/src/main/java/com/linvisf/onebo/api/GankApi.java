package com.linvisf.onebo.api;

import com.linvisf.onebo.bean.meizi.MeiziData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by linhong on 2017/1/6.
 * <p>
 * 描述：
 */

public interface GankApi {

    @GET("/api/data/福利/10/{page}")
    Observable<MeiziData> getMeizhiData(@Path("page") int page);
}
