package com.eshraq.business.Controller;

import java.util.List;

import com.eshraq.business.DTO.StoreDto;
import com.eshraq.business.Model.Store;
import com.eshraq.business.Service.StoreService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    StoreService storeService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/savestore")
    public Store saveStore(@RequestBody Store store) {
        return storeService.save(store);
    }

    @GetMapping("/getallstore")
    public List<Store> getAllStore() {
        return storeService.store();
    }

    @GetMapping("/getstore")
    public Store searchStore(@RequestBody StoreDto storeDto) {
        Store store = modelMapper.map(storeDto, Store.class);
        return storeService.getStore(store);
    }

    @DeleteMapping("/deletestore")
    public String deleteStore(@RequestBody StoreDto storeDto) {
        Store store = modelMapper.map(storeDto, Store.class);
        return storeService.deleteStore(store);
    }
    @PutMapping("/updatestore")
    public Store updateStore(@RequestBody StoreDto storeDto,@RequestParam String name) {
        Store store = modelMapper.map(storeDto, Store.class);
        return storeService.updateStore(store, name);
    }

}
