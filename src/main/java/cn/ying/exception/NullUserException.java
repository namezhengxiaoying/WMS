package cn.ying.exception;

import org.springframework.stereotype.Component;

/**
 * ���˺��쳣
 */
@Component
public class NullUserException extends Exception{
    public NullUserException(){}
    public NullUserException(String msg){
        super(msg);

    }
}
