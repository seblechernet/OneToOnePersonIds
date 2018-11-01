package com.sebjack.onetoonepersonids.controller;

import com.sebjack.onetoonepersonids.model.DriverLicenseRepository;
import com.sebjack.onetoonepersonids.model.NationalIDRepository;
import com.sebjack.onetoonepersonids.model.PassportRepository;
import com.sebjack.onetoonepersonids.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class ThymeController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    DriverLicenseRepository driverLicenseRepository;
    @Autowired
    NationalIDRepository nationalIDRepository;
    @Autowired
    PassportRepository passportRepository;

    @RequestMapping("/")
    public String listPeople(Model model){

        model.addAttribute("people",personRepository.findAll());

         return "index";

    }

}
