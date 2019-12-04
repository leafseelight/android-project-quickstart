package com.jacky.option.net.callback;

/**
 * Created by jacky on 2018/3/21.
 * banker developer. <br/>
 * <br/>
 */

/**
 * @param <D> 数据类型
 * @param <E> 错误类型
 */
public interface IHttpCallBack<D, E> {

    /**
     * 请求完成
     *
     * @param
     */
    void onComplete();

    /**
     * 请求网络得到model
     *
     * @param data 数据模型
     */
    void onSuccess(D data);

    /**
     * 错误信息
     *
     * @param error 异常错误信息
     */
    void onError(E error);

}