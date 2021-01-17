package com.yuvrajpatil.uv_investments.fund_house;

import java.util.List;

import com.yuvrajpatil.api.UvAPIResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UvFundHouseController {
  @Autowired
  private UvFundHouseService fundHouseService;

  @RequestMapping("/fund-houses")
  public List<UvFundHouse> getFundHouses() {
    return fundHouseService.getAll();
  }

  @RequestMapping(value="/fund-houses/{id}")
  public UvFundHouse addFundHouse(@PathVariable Integer id) {
    return fundHouseService.get(id);
  }

  @RequestMapping(value="/fund-houses", method=RequestMethod.POST)
  public UvAPIResponse addFundHouse(@RequestBody UvFundHouse fundHouse) {
    fundHouseService.add(fundHouse);
    return new UvAPIResponse(0, "Fund House " + fundHouse.getName() + " has been added successfully");
  }

  @RequestMapping(value="/fund-houses", method=RequestMethod.PUT)
  public UvAPIResponse updateFundHouse(@RequestBody UvFundHouse fundHouse) {
    fundHouseService.update(fundHouse);
    return new UvAPIResponse(0, "Fund House " + fundHouse.getName() + " has been updated successfully");
  }

  @RequestMapping(value="/fund-houses/{id}", method=RequestMethod.DELETE)
  public UvAPIResponse deleteFundHouse(@PathVariable Integer id) {
    fundHouseService.delete(id);
    return new UvAPIResponse(0, "Fund House with id " + id + " has been deleted successfully");
  }
}
