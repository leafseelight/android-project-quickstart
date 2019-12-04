package com.jacky.option.architecture.base;

import com.jacky.option.framework.mvp.BaseModel;
import com.jacky.option.framework.mvp.IView;
import com.jacky.option.net.HttpManager;

/**
 * <pre>
 *     author : jacks
 *     e-mail : 363525749@qq.com
 *     time   : 2019/12/03
 *     version: 1.0
 *     desc   : 数据层基类
 * </pre>
 */
public class BaseSupportModel extends BaseModel {
    public BaseSupportModel(IView view) {
        super(view);
    }

    protected <S> S getService(Class<S> cls) {
        return HttpManager.getInstance().getServiceProvider().createService(cls);
    }

}
