package com.plangenerator.service;

import java.util.List;

import com.plangenerator.dto.BorrowerPlanDTO;
import com.plangenerator.dto.LoanDetailsDTO;

public interface IPlanGeneratorService {

	List<BorrowerPlanDTO> generatePlan(LoanDetailsDTO loanDetailsDTO);

}
