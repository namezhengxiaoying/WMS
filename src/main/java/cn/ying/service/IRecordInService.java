package cn.ying.service;

import cn.ying.domain.RecordIn;
import cn.ying.exception.NullGoodException;
import cn.ying.exception.NullRepositoryException;
import cn.ying.exception.NullSupplierException;

/**
 * ���ҵ���ӿ�
 */
public interface IRecordInService {
    /**
     * ���
     * @param in
     */
    public void recordIn(RecordIn in) throws NullSupplierException, NullRepositoryException, NullGoodException;
}
