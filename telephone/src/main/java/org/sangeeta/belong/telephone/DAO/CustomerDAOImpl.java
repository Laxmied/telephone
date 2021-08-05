package org.sangeeta.belong.telephone.DAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.sangeeta.belong.telephone.bean.Customer;

@Service
public class CustomerDAOImpl implements CustomerDAO{
	
	private  static List<Customer> DB = new ArrayList<Customer>();
	
	static {
		DB.add(new Customer("Sangeeta", Arrays.asList("0420920310", "0420820310")));
		DB.add(new Customer("Nithya", Arrays.asList("0320920310", "0320820310")));
		DB.add(new Customer("Sangeeta1", Arrays.asList("0220920310", "0220820310")));
		DB.add(new Customer("Nithya1", Arrays.asList("0520920310", "0520820310")));
	}

	@Override
	public List<Customer> getAllCustomers() {		
		return DB;
	}

	@Override
	public Optional<Customer> getCustomer(String custId) {
		return DB.stream().filter(customer -> customer.getCustId().equals(custId))
				.findFirst();		
	}

	@Override
	public int activateNumber(String custId, String teleNum) {
		
		for(Customer customer : DB) {	
			if (customer.getCustId().equals(custId)) {
				List<String> numList  = customer.getTeleNumbers();
				List<String> tobeAddedList = new ArrayList<String>();
				tobeAddedList.addAll(numList);
				tobeAddedList.add(teleNum);
				customer.setTeleNumbers(tobeAddedList);
				return 1;
			} 
		}
		return 0;
	}
}
