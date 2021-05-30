package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobPositionService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobtitles")
public class JobPositionController {

	@Autowired
	private JobPositionService jobPositionService;
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll() {

		return this.jobPositionService.getAll();
	}

	@PostMapping("/add")
	public Result add(JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
}
