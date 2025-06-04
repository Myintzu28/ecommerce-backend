package com.ecommerce.ecommerce.feature.customer.domain.repository;

import com.ecommerce.ecommerce.feature.customer.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
