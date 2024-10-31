package com.shrinivas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrinivas.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
