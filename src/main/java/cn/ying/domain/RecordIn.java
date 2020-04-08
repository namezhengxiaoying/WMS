package cn.ying.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ����¼��ʵ����
 */
public class RecordIn implements Serializable {
    //��¼Ψһ��ʶ
    private Integer id;

    //����id
    private Integer goodsId;

    //������Ŀ
    private Integer amount;

    //���ʱ��
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RecordIn{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", amount=" + amount +
                ", time=" + time +
                '}';
    }
}
