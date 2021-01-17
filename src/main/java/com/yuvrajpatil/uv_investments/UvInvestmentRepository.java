package com.yuvrajpatil.uv_investments;

import java.util.List;

import com.yuvrajpatil.uv_investments.fund_house.UvFundHouse;

import org.springframework.data.repository.CrudRepository;

public interface UvInvestmentRepository extends CrudRepository<UvInvestment, Integer>{
  public List<UvFundHouse> findByFundHouseName(String name);
}
