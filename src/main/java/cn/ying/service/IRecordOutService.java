package cn.ying.service;

import cn.ying.domain.RecordOut;
import cn.ying.exception.NullCustomerException;
import cn.ying.exception.NullStockException;
import cn.ying.exception.ShortGoodsException;

/**
 * ����ҵ���ӿ�
 */
public interface IRecordOutService {
    /**
     * ����
     * @param out
     */
    public void recordOut(RecordOut out) throws NullStockException, NullCustomerException, ShortGoodsException;
}
