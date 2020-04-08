package cn.ying.dao;

import cn.ying.domain.User;

import java.util.List;

/**
 * �û��־ò�ӿ�
 */
public interface IUserDao {
    /**
     * ����һ�����û�
     * @param user
     */
    public void insert(User user);

    /**
     * �����˻���ɾ���˻�
     * @param name
     */
    public void delete(String name);

    /**
     * ���������˻���Ϣ
     * @return
     */
    public List<User> getAll();

    /**
     * �����˻�����ȡ�˻�
     * @param name
     * @return
     */
    public User getById(String name);

    /**
     * �����˻���Ϣ
     * @param user
     */
    public void update(User user);
}
