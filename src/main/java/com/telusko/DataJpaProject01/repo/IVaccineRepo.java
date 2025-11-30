package com.telusko.DataJpaProject01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.DataJpaProject01.entity.Vaccine;
import com.telusko.DataJpaProject01.view.ResultView;



public interface IVaccineRepo extends JpaRepository<Vaccine, Integer>
{
	//findBy-propertyname-keyword
	 public List<ResultView> findByVaccineCostLessThan(Double vaccineCost);

}
