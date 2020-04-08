package cn.ying.dao;

import cn.ying.domain.RecordIn;

import java.util.List;

/**
 * ����¼�־ò�ӿ�
 */
public interface IRecordInDao {
    /**
     * ����һ������¼
     * @param recordIn
     */
    public void insert(RecordIn recordIn);

    /**
     * ��������¼idɾ����¼
     * @param recordId
     */
    public void delete(Integer recordId);

    /**
     * ��ȡ��������¼
     * @return
     */
    public List<RecordIn> getAll();

    /**
     * ��������¼id��ȡ����¼
     * @param recordId
     * @return
     */
    public RecordIn getById(Integer recordId);

}
