package com.yuvrajpatil.uv_investments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UvInvestmentsService {

  @Autowired
  private UvInvestmentRepository investmentRepository;

  public List<UvInvestment> getAll() {

    List<UvInvestment> investments = new ArrayList<>();

    investmentRepository.findAll()
                        .forEach(investments::add);
    return investments;
  }

  public UvInvestment get(int id) {
    return investmentRepository.findById(id).get();
  }

  public void add(UvInvestment investment) {
    investmentRepository.save(investment);
  }
  public void update(UvInvestment investment) {
    investmentRepository.save(investment);
  }

  public void delete(Integer id) {
    investmentRepository.deleteById(id);;
  }
}
