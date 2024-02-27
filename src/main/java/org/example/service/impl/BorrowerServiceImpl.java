package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entity.BorrowerEntity;
import org.example.repository.BorrowerRepository;
import org.example.service.BorrowerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {
    final  BorrowerRepository repository;
    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }
    ModelMapper mapper;
    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity entity = mapper.map(borrower, BorrowerEntity.class);
        repository.save(entity);
    }

    @Override
    public List<BorrowerEntity> getBorrowers() {
        return (List<BorrowerEntity>) repository.findAll();
    }

}
