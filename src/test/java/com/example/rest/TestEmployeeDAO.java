package com.example.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.rest.dao.EmployeeDAO;
import com.example.rest.dao.EmployeeManager;
import com.example.rest.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeDAO {

	@InjectMocks
	EmployeeDAO dao;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getEmployeeListTest() {
		dao.getEmployeeList();
	}

	@Test
	public void getEmployeeByIdTest() {
		dao.getEmployeeById(1);
	}

	@Test
	public void addEmployeeTest() {
		Employee employee = new Employee();
		dao.addEmployee(employee);
	}

	@Test
	public void updateEmployeeTest() {
		Employee employee = new Employee();
		dao.updateEmployee(employee);
	}
	
	@Test
	public void deleteEmployeeTest() {
		dao.deleteEmployee(0);
	}
}