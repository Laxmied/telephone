package org.sangeeta.belong.telephone.DAO;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Contract;
import org.sangeeta.belong.telephone.bean.Customer;
@Contract
public interface CustomerDAO {
	public List<Customer> getAllCustomers();
	public Optional<Customer> getCustomer(String custId);
	public int activateNumber(String custId, String teleNum);
}
