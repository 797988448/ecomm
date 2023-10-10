package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.Model.Laptop;
import com.sawnkalabihar.encompasses.handling.repo.Loptoprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopSrevice {
    @Autowired
    Loptoprepo loptoprepo;

    public String AddLaptop(Laptop newLaptop) {
        loptoprepo.save(newLaptop);
        return "Add LAPTOP";
    }

    public List<Laptop> getAllLaptop() {
        return loptoprepo.findAll();
    }

    public String UpdateLaptop(String id, String Brand) {
        Laptop laptop=loptoprepo.findById(id).orElse(null);
        if(laptop!=null){
            laptop.setBrand(Brand);
            loptoprepo.save(laptop);
            return "Update Laptop Brand";

        }
        return "NOT Match brand";
    }

    public String DeleteLaptop(String id) {
        loptoprepo.deleteById(id);
        return "Delete Laptop";
    }
}
