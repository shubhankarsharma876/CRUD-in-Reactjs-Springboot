package com.Shubhankar.CRUD.repository;

import com.Shubhankar.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



//Here from this we are using the methods like findAll,save etc which we are using in the controller 
public interface UserRepository extends JpaRepository<User,Long> {

}
