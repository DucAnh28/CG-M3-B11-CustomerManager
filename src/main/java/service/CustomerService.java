package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements CustomerServiceInterface{
    private static Map<Integer,Customer> customersMap;
    static {
        customersMap = new HashMap<>();
        customersMap.put(1,new Customer(1,"DucAnh","ducanh@gmail.com","HN"));
        customersMap.put(2,new Customer(2,"BatRan","batran@gmail.com","TB"));
        customersMap.put(3,new Customer(3,"Phuong","phuong@gmail.com","TN"));
        customersMap.put(4,new Customer(4,"Hieu","hieu@gmail.com","LC"));
        customersMap.put(5,new Customer(5,"QuangAnh","quanganh@gmail.com","HN"));
        customersMap.put(6,new Customer(6,"Dung","dung@gmail.com","HN"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customersMap.values());
    }

    @Override
    public void save(Customer customer) {
        customersMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customersMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customersMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customersMap.remove(id);
    }
}
