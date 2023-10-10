package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.Model.Address;
import com.sawnkalabihar.encompasses.handling.repo.AddresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddresRepo addressRepo;

    public String addAllAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "Added Address";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public String updateAddress(Long id, String zipcode) {
        Address address=addressRepo.findById(id).orElse(null);
        if(address!=null){
            address.setZipcode(zipcode);
            addressRepo.save(address);
            return "Update Zipcode";
        }
        return "Does not exits";
    }

    public String DeletedId(Long id) {
        addressRepo.deleteById(id);
        return "Delete Id";
    }
}
