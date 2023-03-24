package com.assignment.assignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.assignment.entities.Load;

@Service
public interface LoadServices {
  public String addLoad(Load load);
  public List<Load> listgetbyId(String id);
  public Load getbyId(int id);
  public String deleteById(int id);
  public String updatebyId(Load load, int id);
}
