package com.jacky.option.architecture.base;

import com.jacky.option.common.UIUtils;
import com.jacky.option.framework.base.BaseFragment;
import com.jacky.option.framework.mvp.IPresenter;

/**
 * <pre>
 *     author : jacks
 *     e-mail : 363525749@qq.com
 *     time   : 2019/12/04
 *     version: 1.0
 *     desc   : View层，视图层,Fragment基类
 * </pre>
 */
public abstract class BaseSupportFragment<P extends IPresenter> extends BaseFragment<P> {

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onRequestHttpError(String netErr) {
        UIUtils.showShortToast(netErr);
    }
}
