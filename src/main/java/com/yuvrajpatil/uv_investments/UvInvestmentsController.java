package com.yuvrajpatil.uv_investments;

import java.util.List;

import com.yuvrajpatil.api.UvAPIResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UvInvestmentsController {

  @Autowired
  private UvInvestmentsService investmentsService;


  @RequestMapping("/investments")
  public List<UvInvestment> getAllInvestments() {
    return investmentsService.getAll();
  }

  @RequestMapping("/investments/{id}")
  public UvInvestment getInvestment(@PathVariable int id) {
    return investmentsService.get(id);
  }

  @RequestMapping(value="/investments", method=RequestMethod.POST)
  public UvAPIResponse addInvestment(@RequestBody UvInvestment investment) {
    investmentsService.add(investment);
    return new UvAPIResponse(0, "Investment " + investment.getName() + " has been added successfully");
  }

  @RequestMapping(value="/investments", method=RequestMethod.PUT)
  public UvAPIResponse updateInvestment(@RequestBody UvInvestment investment) {
    investmentsService.update(investment);
    return new UvAPIResponse(0, "Investment " + investment.getName() + " has been updated successfully");
  }

  @RequestMapping(value="/investments/{id}", method=RequestMethod.DELETE)
  public UvAPIResponse deleteInvestment(@PathVariable int id) {
    investmentsService.delete(id);
    return new UvAPIResponse(0, "Investment with id " + id + " has been updated successfully");
  }
}
