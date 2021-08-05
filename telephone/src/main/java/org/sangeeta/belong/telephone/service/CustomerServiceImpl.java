package org.sangeeta.belong.telephone.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.sangeeta.belong.telephone.DAO.CustomerDAO;
import org.sangeeta.belong.telephone.DAO.CustomerDAOImpl;
import org.sangeeta.belong.telephone.bean.Customer;

import jakarta.inject.Inject;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	private final CustomerDAO customerDAO;
	
	/*
	 * @Inject public CustomerServiceImpl(CustomerDAO customerDAO) {
	 * this.customerDAO = customerDAO; }
	 */

	public CustomerServiceImpl() {
		customerDAO = new CustomerDAOImpl();
	}

	@Override
	public List<String> getAllPhoneNmubers() {
		List<Customer> customerList = customerDAO.getAllCustomers();
		List<String> numbersList = new ArrayList<>();
				customerList.stream().map(customer -> customer.getTeleNumbers()).
				forEach(list -> numbersList.addAll(list));
		return numbersList;
	}

	@Override
	public Optional<Customer> getCustPhoneNums(String custId) {
		return customerDAO.getCustomer(custId);
	}

	@Override
	public int activateNumber(String custId, String teleNum) {
		
		return customerDAO.activateNumber(custId, teleNum);
	}

}

