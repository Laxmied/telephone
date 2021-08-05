package org.sangeeta.belong.telephone.service;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Contract;
import org.sangeeta.belong.telephone.bean.Customer;
@Contract
public interface CustomerService {
	public List<String> getAllPhoneNmubers();
	public Optional<Customer> getCustPhoneNums(String custId);
	public int activateNumber(String custId, String teleNum);

}
