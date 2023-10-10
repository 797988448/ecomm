package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.Model.Address;
import com.sawnkalabihar.encompasses.handling.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
@PostMapping("api/address/post")
    public String addAllAddress(@RequestBody Address newAddress){
        return addressService.addAllAddress(newAddress);
    }
    @GetMapping("API/address/get")
    public List<Address> getAllAddress(){
    return addressService.getAllAddress();
    }
    @PutMapping("API/Update/ZepCode")
    public String updateAddress(@RequestParam Long id,@RequestParam String zipcode){
    return addressService.updateAddress(id,zipcode);
    }
    @DeleteMapping("API/Delete/id")
    public String DeletedId(@RequestParam Long id){
    return addressService.DeletedId(id);
    }
}
