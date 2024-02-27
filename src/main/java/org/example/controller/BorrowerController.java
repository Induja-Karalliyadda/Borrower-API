package org.example.controller;

import org.example.dto.Borrower;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {
    @Autowired
    BorrowerService service;

    public void addBorrower(Borrower borrower){

    }
}
