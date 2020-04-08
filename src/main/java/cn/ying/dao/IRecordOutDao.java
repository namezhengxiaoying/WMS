package cn.ying.dao;

import cn.ying.domain.RecordOut;

import java.util.List;

/**
 * �����¼�־ò�ӿ�
 */
public interface IRecordOutDao {
    /**
     * ����һ�������¼
     * @param recordOut
     */
    public void insert(RecordOut recordOut);

    /**
     * ���ݳ����¼idɾ����¼
     * @param recordId
     */
    public void delete(Integer recordId);

    /**
     * ��ȡ���г����¼
     * @return
     */
    public List<RecordOut> getAll();

    /**
     * ���ݳ����¼id��ȡ�����¼
     * @param recordId
     * @return
     */
    public RecordOut getById(Integer recordId);
}
