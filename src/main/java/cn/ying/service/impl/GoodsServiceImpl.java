package cn.ying.service.impl;

import cn.ying.dao.IGoodsDao;
import cn.ying.domain.Goods;
import cn.ying.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ��Ʒҵ���ʵ����
 */
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    IGoodsDao goodsDao;

    @Override
    public List<Goods> queryAll() {
        return goodsDao.getAll();
    }
}
