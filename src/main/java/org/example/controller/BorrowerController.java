package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entity.BorrowerEntity;
import org.example.service.BorrowerService;
import org.example.service.impl.BorrowerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/borrower")
public class BorrowerController {

    final BorrowerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }
    @GetMapping
    public Iterable<BorrowerEntity>  getBorrowers(){
       return service.getBorrowers();
    }
    }

