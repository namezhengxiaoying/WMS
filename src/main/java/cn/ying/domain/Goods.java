package cn.ying.domain;

import java.io.Serializable;

/**
 * ����ʵ����
 */
public class Goods implements Serializable {
    //����Ψһ��ʶ
    private Integer id;

    //��������
    private String name;

    //��������
    private String type;

    //�����С
    private String size;

    //�������
    private String origin;

    //����۸�
    private float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}';
    }
}
