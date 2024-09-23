package com.easybytes.accounts.repository;

import com.easybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //So whenever I write this method inside my repository interface, my spring data JPA framework will take
    //care of fetching the record based upon a mobileNumber
    //Note! field name mobileNumber has to match with what you have mentioned inside your pojo entity class.
    /*What if you have multiple columns inside your requirements?
    In that case, you need to write and followed by what is the second parameter and the second parameter
    also you need to pass as a method parameter to this method.*/
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
