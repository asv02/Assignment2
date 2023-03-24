package com.assignment.assignment.loadDao;
import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.assignment.entities.Load;

@Repository
public interface LoadDao extends JpaRepository<Load,Integer>{
    public Optional <Load> findById(int pass);
     List<Load> findByShipperId(String pass);	
}

