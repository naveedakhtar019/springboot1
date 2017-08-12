package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
  
  @RequestMapping(value = "/message", method = RequestMethod.GET)
  public ResponseEntity<String> message() {
     
      return new ResponseEntity<String>("hello naveed!!!!!", HttpStatus.OK);
  }

}
