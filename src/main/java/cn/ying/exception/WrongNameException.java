package cn.ying.exception;

/**
 * �˻������쳣
 */
public class WrongNameException extends Exception{
    public WrongNameException(){}

    public WrongNameException(String msg){
        super(msg);
    }
}
