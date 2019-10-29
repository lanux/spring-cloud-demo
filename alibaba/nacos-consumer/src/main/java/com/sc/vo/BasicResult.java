package com.sc.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zhenlong.zhong
 */

@Getter
@Setter
@Accessors(chain = true)
public class BasicResult<T> implements Serializable {
    private int    code      = 1;
    private String msg       = "SUCCESS";
    private String detailMsg = null;
    private T      data;

    public static <T> BasicResult<T> error(int i, String s) {
        return new BasicResult<T>().setCode(i).setMsg(s);
    }

    public static <T> BasicResult<T> error(int i, String msg, String detailMsg) {
        return new BasicResult<T>().setCode(i).setMsg(msg).setDetailMsg(detailMsg);
    }

    public static <T> BasicResult<T> error(String s) {
        return new BasicResult<T>().setCode(-1).setMsg(s);
    }


    public static <T> BasicResult<T> success(T data) {
        return new BasicResult<T>().setData(data);
    }

    public static <F, T> BasicResult<T> from(BasicResult<F> result, T data) {
        return new BasicResult<T>().setCode(result.getCode()).setMsg(result.getMsg()).setDetailMsg(result.getDetailMsg()).setData(data);
    }

    public boolean ok() {
        return code > 0;
    }
}
