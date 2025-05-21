package com.me.smarttaskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.smarttaskmanager.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {

}
