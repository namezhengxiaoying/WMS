package cn.ying.service;

import cn.ying.exception.DuplicateAccountException;
import cn.ying.exception.NullUserException;
import cn.ying.exception.WrongNameException;
import cn.ying.exception.WrongPasswordException;

/**
 * ��¼����service��ӿ�
 */
public interface ILoginService {
    /**
     * ��¼����
     * @param name
     * @param password
     */
    public boolean login(String name,String password) throws NullUserException, WrongNameException, WrongPasswordException;


    public boolean enroll(String name,String password) throws DuplicateAccountException;
}
