package com.shuidihuzhu.payment.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-07 23:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    public boolean ok() {
        return this.code == 0;
    }

    public boolean notOk() {
        return this.code != 0;
    }
}
