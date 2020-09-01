/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.bean;

import com.cs.pojo.Customer;
import com.cs.service.CustomerService;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cuong
 */
@ManagedBean
@Named(value = "customerBean")
@RequestScoped
public class CustomerBean implements Serializable{
    private final static CustomerService cusService = new CustomerService();

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
   
    public List<Customer> getCustomers() {
        return cusService.getCustomers(null);
    }
    
}
