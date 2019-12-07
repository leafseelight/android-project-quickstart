package com.jacky.option.architecture;

import android.app.Application;

import com.jacky.option.NetworkInit;
import com.jacky.option.architecture.net.interceptor.AddParamInterceptor;
import com.jacky.option.net.HttpManager;
import com.jacky.option.net.interceptor.CacheControlInterceptor;
import com.jacky.option.net.provider.OkHttpProvider;

/**
 * <pre>
 *     author : jacks
 *     e-mail : 363525749@qq.com
 *     time   : 2019/12/03
 *     version: 1.0
 *     desc   :
 * </pre>
 */
public class MyApp extends Application {

    private static Application sApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        HttpManager.getInstance()
                .init(new OkHttpProvider()
                        .isDebug(true)
                        .setTimeout(6, 6, 6)
                        .addInterceptors(new AddParamInterceptor())
                        .addNetworkInterceptor(new CacheControlInterceptor()));
        NetworkInit.init(this);
    }

    public static Application getApplication() {
        return sApplication;
    }
}
