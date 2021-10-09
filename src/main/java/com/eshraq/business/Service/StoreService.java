package com.eshraq.business.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.eshraq.business.Model.Store;
import com.eshraq.business.Repository.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public Store save(Store store) {
        return storeRepository.save(store);
    }

    public List<Store> store() {
        return storeRepository.findAll();
    }

    public Store getStore(Store store) {
        return storeRepository.findByNameAndAddress(store.getName(), store.getAddress());
    }

    public String deleteStore(Store store) {
        storeRepository.deleteByNameAndAddress(store.getName(),store.getName());
        return "record was deleted";
    }

    public Store updateStore(Store store, String name) {
        Store s = storeRepository.findByName(name);
        s.setAddress(store.getAddress());
        s.setName(store.getName());
        s.setPhone(store.getPhone());
        s.setLocation(store.getLocation());
        return storeRepository.save(s);
    }
}
