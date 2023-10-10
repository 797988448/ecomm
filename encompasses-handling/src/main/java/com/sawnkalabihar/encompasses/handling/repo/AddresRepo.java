package com.sawnkalabihar.encompasses.handling.repo;

import com.sawnkalabihar.encompasses.handling.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresRepo extends JpaRepository<Address,Long> {

}
