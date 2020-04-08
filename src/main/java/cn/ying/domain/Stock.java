package cn.ying.domain;

import java.io.Serializable;

/**
 * ����ʵ����
 */
public class Stock implements Serializable {
    //����id
    private Integer goodsId;

    //��������Ŀ
    private Integer amount;

    //����洢��
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "goodsId=" + goodsId +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                '}';
    }
}
