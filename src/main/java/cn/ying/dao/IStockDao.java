package cn.ying.dao;

import cn.ying.domain.Stock;

import java.util.List;

/**
 * ����־ò�ӿ�
 */
public interface IStockDao {
    /**
     * ����һ������¼
     * @param stock
     */
    public void insert(Stock stock);

    /**
     * ���ݲֿ�id������idɾ������¼
     * @param
     */
    public void delete(Integer goodsId);

    /**
     * ��ȡ���п����Ϣ
     * @return
     */
    public List<Stock> getAll();

    /**
     * ���ݿ���¼id��ȡ����¼
     * @param
     * @return
     */
    public Stock getById(Integer goodsId);

    /**
     * ���¿����Ϣ
     * @param stock
     */
    public void update(Stock stock);
}
