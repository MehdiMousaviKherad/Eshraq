package com.eshraq.business.Service;

import java.util.List;

import com.eshraq.business.Model.Goods;
import com.eshraq.business.Repository.GoodsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    @Autowired
    GoodsRepository goodsRepository;

    public Goods save(Goods goods) {
        return goodsRepository.save(goods);
    }

    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }

    public String delete(String name) {

        goodsRepository.deleteByName(name);
        return "this row was deleted";
    }
    public Goods searchGoods(Goods goods){
       return goodsRepository.findByName(goods.getName());
    }
}
