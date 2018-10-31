package com.sebjack.onetoonepersonids.controller;

import com.sebjack.onetoonepersonids.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class JsonController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    DriverLicenseRepository driverLicenseRepository;
    @Autowired
    NationalIDRepository nationalIDRepository;
    @Autowired
    PassportRepository passportRepository;

    @RequestMapping("/")
    public Iterable<Person> movielist(){



        return personRepository.findAll();
    }

    
}
