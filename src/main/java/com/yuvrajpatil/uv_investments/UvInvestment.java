package com.yuvrajpatil.uv_investments;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.yuvrajpatil.uv_investments.fund_house.UvFundHouse;

@Entity
public class UvInvestment {

  @Id
  Integer id;
  String name;
  String shortName;
  String goal;
  double expenseRatio;
  double exitLoad;
  String fundManager;
  Date inceptionSince;
  Integer rating;
  Date firstInvestmentDate;
  Date tentetiveEndDate;
  double AUM;

  @ManyToOne(cascade = {CascadeType.ALL})
  UvFundHouse fundHouse;

  public UvInvestment(){
    super();
  }

  public UvInvestment(Integer id, String name, String shortName, double expenseRatio) {
    super();
    this.id = id;
    this.name = name;
    this.shortName = shortName;
    this.expenseRatio = expenseRatio;
  }

  public UvInvestment(Integer id, String name, String shortName, double expenseRatio, UvFundHouse fundHouse) {
    super();
    this.id = id;
    this.name = name;
    this.shortName = shortName;
    this.expenseRatio = expenseRatio;
    this.fundHouse = fundHouse;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public String getFundManager() {
    return fundManager;
  }

  public void setFundManager(String fundManager) {
    this.fundManager = fundManager;
  }

  public Date getInceptionSince() {
    return inceptionSince;
  }

  public void setInceptionSince(Date inceptionSince) {
    this.inceptionSince = inceptionSince;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Date getFirstInvestmentDate() {
    return firstInvestmentDate;
  }

  public void setFirstInvestmentDate(Date firstInvestmentDate) {
    this.firstInvestmentDate = firstInvestmentDate;
  }

  public Date getTentetiveEndDate() {
    return tentetiveEndDate;
  }

  public void setTentetiveEndDate(Date tentetiveEndDate) {
    this.tentetiveEndDate = tentetiveEndDate;
  }

  public double getAUM() {
    return AUM;
  }

  public void setAUM(double aUM) {
    AUM = aUM;
  }

  public UvFundHouse getFundHouse() {
    return fundHouse;
  }

  public void setFundHouse(UvFundHouse fundHouse) {
    this.fundHouse = fundHouse;
  }

  public double getExpenseRatio() {
    return expenseRatio;
  }
  public void setExpenseRatio(double expenseRatio) {
    this.expenseRatio = expenseRatio;
  }

  public double getExitLoad() {
    return exitLoad;
  }

  public void setExitLoad(double exitLoad) {
    this.exitLoad = exitLoad;
  }
}
