package com.example.loadtestserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
  /*
  @Autowired
  private FormRepository formRepository;
   */

  // returns true -- could be changed to verify form content / construction
  public Boolean submitForm(Form form) {
    return true;
  }
}
