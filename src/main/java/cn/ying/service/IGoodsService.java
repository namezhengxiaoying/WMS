package cn.ying.service;

import cn.ying.domain.Goods;

import java.util.List;

/**
 * ��Ʒҵ���ӿ�
 */
public interface IGoodsService {
    /**
     * ��ѯ������Ʒ��Ϣ
     * @return
     */
    public List<Goods> queryAll();
}
