package com.telusko.DataJpaProject01.service;

import java.util.List;

import com.telusko.DataJpaProject01.view.ResultView;

public interface IVaccineService 
{
	
      public List<ResultView> fetchByCostLessThan(Double vaccineCost);
	 
}