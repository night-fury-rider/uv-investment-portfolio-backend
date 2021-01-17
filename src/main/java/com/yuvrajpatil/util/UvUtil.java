package com.yuvrajpatil.util;

import java.util.Calendar;
import java.util.Date;

public class UvUtil {

  /**
   * @description - Since date constructor with these parameters, we will be using Calender API to get Date.
   * @param dayOfMonth  {Integer} - Day of Month
   * @param month       {Integer} - Month
   * @param year        {Integer} - Year
   * @return            {Date}    - Date object for passed parameters.
   */
  public Date getDateInstance(Integer dayOfMonth, Integer month, Integer year) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.MONTH, month);
    cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    return cal.getTime();
  }
}
