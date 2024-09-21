package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

//create a new class which represents customer table (with the same name customer)
/*the very first annotation that I need to mention is @entity.
So this tells my Spring Data JPA framework: Please treat this Pojo class as an entity representation or
a Pojo representation for my table with the name customer. So here the table name will match with the class name.
So this is matching if it is not matching, and if you are trying to use a different class name, then
you can use the annotation which is @Table. And to this @Table annotation you can pass the name parameter,
to which you can mention whatever table name that you have inside the database.*/
@Entity
//@Table(name="customer") --> not needed
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;
}
