package pizza.service;

import org.springframework.stereotype.Component;

import pizza.domain.Customer;
@Component
public class CustomerServiceImpl implements CustomerService {
  public CustomerServiceImpl() {}
  
  public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
    if("9725551234".equals(phoneNumber)) {
      Customer customer = new Customer();
      customer.setId(123);
      customer.setName("Craig Walls");
      customer.setAddress("3700 Dunlavy Rd");
      customer.setCity("Denton");
      customer.setState("TX");
      customer.setZipCode("76210");
      customer.setPhoneNumber(phoneNumber);
      return customer;
    } else {
    	System.out.println("a CustomerNotFoundException is thrown");
      throw new CustomerNotFoundException();
    }
  }
}
