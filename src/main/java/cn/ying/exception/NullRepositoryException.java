package cn.ying.exception;

/**
 * �ղֿ��쳣
 */
public class NullRepositoryException extends Exception{
    public NullRepositoryException(){}

    public NullRepositoryException(String msg){
        super(msg);
    }
}
