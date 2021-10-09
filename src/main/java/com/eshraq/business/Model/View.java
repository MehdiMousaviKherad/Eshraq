package com.eshraq.business.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Immutable
@Entity
public class View {
    @Id
    private long id;
    private String storeName;
    private String storePhone;
    private String storeAddress;
    private String goodsName;
    private String goodsPrice;
    private boolean isenable;
    private long goodsCount;

    public String getStoreName() {
        return storeName;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public boolean isIsenable() {
        return isenable;
    }

    public long getGoodsCount() {
        return goodsCount;
    }

    public long getId() {
        return id;
    }

}
