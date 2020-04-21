package com.ghd.payment.utils;

import com.ghd.payment.module.Response;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 23:05
 */
public class NewResponseUtil {
    public static <T> Response<T> makeSuccess(T obj) {
        return makeResponse(0, "", obj);
    }

    public static <T> Response<T> makeSuccess(T obj, String msg) {
        return makeResponse(0, msg, obj);
    }

    public static <T> Response<T> makeFail(T obj) {
        return makeResponse(1, "", obj);
    }

    public static <T> Response<T> makeFail(String message) {
        return makeResponse(1, message, (T) null);
    }

    public static <T> Response<T> makeResponse(int code, String msg, T obj) {
        Response<T> result = new Response<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(obj);

        return result;
    }

    public static <T> boolean isOk(Response<T> response) {
        return response != null && response.getCode() == 0;
    }

    public static <T> boolean isNotOk(Response<T> response) {
        return !isOk(response);
    }
}