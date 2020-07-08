package com.imooc.o2o.exceptions;

/**
 * @ClassName LocalAuthOperationException
 * @Description
 * @Author jinym
 * @Date 2020/7/7
 **/
public class LocalAuthOperationException extends RuntimeException{
    private static final long serialVersionUID = -8260236137099919700L;

    public LocalAuthOperationException(String msg) {
        super(msg);
    }
}
