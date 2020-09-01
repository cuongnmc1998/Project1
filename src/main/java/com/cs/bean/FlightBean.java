/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.bean;

import com.cs.pojo.Flight;
import com.cs.service.FlightService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cuong
 */
@ManagedBean
@Named(value = "flightBean")
@SessionScoped
public class FlightBean implements Serializable {
    private final static FlightService fliService = new FlightService();

    /**
     * Creates a new instance of FlightBean
     */
    public FlightBean() {
    }
     public List<Flight> getFlights() {
        return fliService.getFlights(null);
    }
    
    
}
