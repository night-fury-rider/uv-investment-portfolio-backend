package com.yuvrajpatil.uv_investments.fund_house;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UvFundHouse {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String name;
  Date setupDate;
  double assetValue;

  public UvFundHouse(){
    super();
  }

  public UvFundHouse(String name, Date setupDate, double assetValue) {
    this.name = name;
    this.setupDate = setupDate;
    this.assetValue = assetValue;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getSetupDate() {
    return setupDate;
  }

  public void setSetupDate(Date setupDate) {
    this.setupDate = setupDate;
  }

  public double getAssetValue() {
    return assetValue;
  }

  public void setAssetValue(double assetValue) {
    this.assetValue = assetValue;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
