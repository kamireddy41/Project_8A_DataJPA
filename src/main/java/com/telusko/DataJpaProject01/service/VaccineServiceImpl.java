package com.telusko.DataJpaProject01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.DataJpaProject01.entity.Vaccine;
import com.telusko.DataJpaProject01.repo.IVaccineRepo;
import com.telusko.DataJpaProject01.view.ResultView;

@Service
public class VaccineServiceImpl implements IVaccineService 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<ResultView> fetchByCostLessThan(Double vaccineCost) {
		
		return repo.findByVaccineCostLessThan(vaccineCost);
		
	}

	
}
