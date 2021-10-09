package com.eshraq.business.Controller;

import java.util.List;

import com.eshraq.business.DTO.GoodsDto;
import com.eshraq.business.Model.Goods;
import com.eshraq.business.Service.GoodsService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    GoodsService goodsService;

    @PostMapping("/savegoods")
    public Goods save(Goods goods) {
        return goodsService.save(goods);
    }

    @GetMapping("/getallgoods")
    public List<Goods> getAll() {
        return goodsService.getAll();
    }

    @DeleteMapping("/deletegoods")
    public String delete(String name) {
        return goodsService.delete(name);
    }
    public Goods searchGoods(GoodsDto goodsDto){
       Goods goods = modelMapper.map(goodsDto, Goods.class);
       return goodsService.searchGoods(goods);
       

    }
}
