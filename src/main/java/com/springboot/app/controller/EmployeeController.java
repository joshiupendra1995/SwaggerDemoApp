package com.springboot.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	/**
	 * @param empname
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/getdata/{empname}/{areacode}")
	public ResponseEntity<List<EmployeeDto>> getEmpByName(@PathVariable("empname") String empname,
			@PathVariable("areacode") String areacode) {

		return new ResponseEntity<>(null, HttpStatus.OK);

	}

	/**
	 * @return
	 */

	@GetMapping(value = "/getAllEmp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeDto>> getAllEmp() {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	/**
	 * @param employee
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employee) {
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	/**
	 * @param employee
	 * @return
	 */
	@PostMapping(value = "/add", produces = "text/plain")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employee) {

		return new ResponseEntity<>("Success", HttpStatus.OK);

	}

	/**
	 * @param empid
	 * @return
	 */
	@DeleteMapping(value = "/delete/{empid}", produces = "text/plain")
	public ResponseEntity<String> deleteEmployee(@PathVariable("empid") Long empid) {

		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

}
