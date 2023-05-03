package com.PoSSample1.Pos.repo;

import com.PoSSample1.Pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer,Integer> {

}
