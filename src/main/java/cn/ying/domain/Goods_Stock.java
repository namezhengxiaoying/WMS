package cn.ying.domain;

/**
 * ���ݿ���ͼgoods_stock�Ķ�Ӧʵ����
 */
public class Goods_Stock {
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

    //��������Ŀ
    private Integer amount;

    //����洢��
    private String address;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        return "Goods_Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                '}';
    }

}
