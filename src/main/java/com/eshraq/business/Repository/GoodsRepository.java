package com.eshraq.business.Repository;

import java.util.List;

import com.eshraq.business.Model.Goods;

import org.springframework.data.repository.CrudRepository;
public interface GoodsRepository extends CrudRepository<Goods,Long>  {
    
    public List<Goods> findAll();
    public long deleteByName(String name);
    public Goods findByName(String name);
}
