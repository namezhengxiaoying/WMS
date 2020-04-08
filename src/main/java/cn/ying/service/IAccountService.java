package cn.ying.service;

import cn.ying.domain.User;
import cn.ying.exception.DuplicateAccountException;
import cn.ying.exception.NullUserException;
import cn.ying.exception.WrongNameException;

/**
 * �û�ҵ���ӿ�
 */
public interface IAccountService {
    /**
     * �����˻�
     * @param user
     */
    public void update(User user) throws NullUserException, WrongNameException;

    /**
     * ɾ���˻�
     * @param userName
     */
    public void delete(String userName) throws NullUserException, WrongNameException;

    /**
     * ����һ���˻�
     * @param user
     */
    public void insert(User user) throws NullUserException, DuplicateAccountException;
}
