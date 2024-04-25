package com.spring.transaction.management.repository;

import com.spring.transaction.management.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {


}
