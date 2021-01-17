package com.yuvrajpatil.uv_investments.fund_house;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UvFundHouseService {

  @Autowired
  private UvFundHouseRepository repository;

  public List<UvFundHouse> getAll() {

    List<UvFundHouse> investments = new ArrayList<>();

    repository.findAll()
              .forEach(investments::add);
    return investments;
  }

  public UvFundHouse get(Integer id) {
    return repository.findById(id).get();
  }

  public void add(UvFundHouse fundHouse) {
    repository.save(fundHouse);
  }
  public void update(UvFundHouse fundHouse) {
    repository.save(fundHouse);
  }

  public void delete(Integer id) {
    repository.deleteById(id);
  }
}
