package com.eshraq.business.Repository;

import java.util.List;

import com.eshraq.business.Model.Store;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StoreRepository extends CrudRepository<Store,Long>{

    public List<Store> findAll();
    public Store findByNameAndAddress(String name,String address);
    public Store findByName(String name);
    public Long deleteByNameAndAddress(String name,String address);
}