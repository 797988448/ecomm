package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.Model.Laptop;
import com.sawnkalabihar.encompasses.handling.service.LaptopSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopSrevice laptopSrevice;
    @PostMapping("Api/post/Laptop")
    public String AddLaptop(@RequestBody Laptop newLaptop){
        return laptopSrevice.AddLaptop(newLaptop);
    }
    @GetMapping("Api/get/Laptop")
    public List<Laptop> getAllLaptop(){
        return laptopSrevice.getAllLaptop();
    }
    @PutMapping("Api/update/Laptop")
    public String UpdateLaptop(@RequestParam String id,@RequestParam String Brand){
        return laptopSrevice.UpdateLaptop(id,Brand);
    }
    @DeleteMapping("Api/Delete/Laptop")
    public String DeleteLaptop(@RequestParam String id){
        return laptopSrevice.DeleteLaptop(id);
    }
}
