package com.vijaycodes.spring_boot_demo.repositories;

import com.vijaycodes.spring_boot_demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// id field of userentity is Long (primary key)
// fo connecting with springboot wihtout using sql queries for db operations
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
