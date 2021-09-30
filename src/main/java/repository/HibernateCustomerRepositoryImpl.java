package repository;

import model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUserName}")
    String dbUserName;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUserName);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Bryan");
        customer.setLastName("Hansen");
        customers.add(customer);
        return customers;
    }


    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }
}
