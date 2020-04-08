package cn.ying.service.impl;

import cn.ying.dao.IUserDao;
import cn.ying.domain.User;
import cn.ying.exception.DuplicateAccountException;
import cn.ying.exception.NullUserException;
import cn.ying.exception.WrongNameException;
import cn.ying.exception.WrongPasswordException;
import cn.ying.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ��¼����serviceʵ����
 */
@Service
public class LoginServiceImpl implements ILoginService  {
    @Autowired
    IUserDao userDao;
    User user;
    public boolean login(String name, String password) throws NullUserException, WrongNameException, WrongPasswordException {
        if (name.equals("") || password.equals("")){
            throw new NullUserException("�˺Ż�����Ϊ��");
        }
        else {
            user = userDao.getById(name);
            if (user == null){
                throw new WrongNameException("�Ҳ���ָ���˺ţ������˺����Ƿ����");
            }
            else {
                if (!user.getPassword().equals(password)){
                    throw new WrongPasswordException("�������");
                }
                return true;
            }
        }
    }

    @Override
    public boolean enroll(String name, String password) throws DuplicateAccountException {
        User target = userDao.getById(name);
        //�˺���ע��
        if (target != null){
            throw new DuplicateAccountException("�˺���ע�ᣡ");
        }
        target = new User();
        target.setName(name);
        target.setPassword(password);
        userDao.insert(target);
        return true;
    }
}
