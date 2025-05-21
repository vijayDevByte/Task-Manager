package com.me.smarttaskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.smarttaskmanager.model.TaskModel;

@Repository
public interface TaskRepo extends JpaRepository<TaskModel, Integer> {

}
