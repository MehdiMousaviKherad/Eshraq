package com.eshraq.business.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Goods_Store" )
public class Goods_Store {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    @JoinColumn(name = "goods_id",referencedColumnName = "goods_id")
    private Goods goods_id;
    @ManyToOne
    @JoinColumn(name = "store_id" ,referencedColumnName = "store_Id")
    private Store store_id;
    private long count;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Goods getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Goods goods_id) {
        this.goods_id = goods_id;
    }

    public Store getStore_id() {
        return store_id;
    }

    public void setStore_id(Store store_id) {
        this.store_id = store_id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}