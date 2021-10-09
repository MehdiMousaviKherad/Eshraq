package com.eshraq.business.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long goods_id;
    private String name;
    private String description;
    private Date date;
    private boolean isenable;
    private String price;
    private int config;
    @OneToMany(mappedBy = "goods_id",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Goods_Store> goods_store;

    public List<Goods_Store> getGoods_store() {
        return goods_store;
    }

    public void setGoods_store(List<Goods_Store> goods_store) {
        this.goods_store = goods_store;
    }

    public long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(long goods_id) {
        this.goods_id = goods_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsenable() {
        return isenable;
    }

    public void setIsenable(boolean isenable) {
        this.isenable = isenable;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getConfig() {
        return config;
    }

    public void setConfig(int config) {
        this.config = config;
    }

}
