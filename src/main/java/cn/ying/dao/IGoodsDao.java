package cn.ying.dao;

import cn.ying.domain.Goods;

import java.util.List;

/**
 * ����־ò�ӿ�
 */
public interface IGoodsDao {
    /**
     * ����һ������
     * @param goods
     */
    public void insert(Goods goods);

    /**
     * ���ݻ���idɾ������
     * @param goodsId
     */
    public void delete(Integer goodsId);

    /**
     * �������л�����Ϣ
     * @return
     */
    public List<Goods> getAll();

    /**
     * ���ݻ���id��ȡ������Ϣ
     * @param goodsId
     * @return
     */
    public Goods getById(Integer goodsId);

    /**
     * ���»�����Ϣ
     * @param goods
     */
    public void update(Goods goods);
}
