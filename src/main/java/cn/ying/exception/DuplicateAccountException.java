package cn.ying.exception;

/**
 * �ظ��˻��쳣
 */
public class DuplicateAccountException extends Exception{
    public DuplicateAccountException(String msg){
        super(msg);
    }
}
