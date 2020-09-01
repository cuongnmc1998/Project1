/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.bean;

import com.cs.pojo.Airline;
import com.cs.service.AirlineService;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cuong
 */
@ManagedBean
@Named(value = "airlineBean")
@Dependent
public class AirlineBean {
        private final static AirlineService airService = new AirlineService();
    /**
     * Creates a new instance of AirlineBean
     */
    public AirlineBean() {
    }
    public List<Airline> getAirlines() {
        return airService.getAirlines(null);
    }
}
