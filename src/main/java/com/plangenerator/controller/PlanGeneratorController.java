package com.plangenerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plangenerator.dto.BorrowerPlanDTO;
import com.plangenerator.dto.LoanDetailsDTO;
import com.plangenerator.service.IPlanGeneratorService;

@RestController
@RequestMapping(value="/plangenerator")
public class PlanGeneratorController {
	
	@Autowired
	private IPlanGeneratorService plangeneratorService;
	
	@PostMapping
	private ResponseEntity<List<BorrowerPlanDTO>> generatePlan(@RequestBody LoanDetailsDTO loanDetailsDTO){
		List<BorrowerPlanDTO> borrowerPayments = plangeneratorService.generatePlan(loanDetailsDTO);
		return ResponseEntity.ok().body(borrowerPayments);
	}

}
