package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entity.BorrowerEntity;
import org.example.service.BorrowerService;
import org.example.service.impl.BorrowerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/borrower")
@CrossOrigin
public class BorrowerController {

    final BorrowerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }
    @GetMapping("/get")
    public List<BorrowerEntity> getBorrowers(){
        return service.getBorrowers();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteBorrower(@PathVariable Long id){
        service.deleteBorrower(id);
            return ("Deleted");
    }
    @GetMapping("search/{id}")
    public Borrower searchBorrowerById(@PathVariable Long id){
         return    service.searchBorrowerById(id);
        }
    }

