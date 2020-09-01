/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.bean;

import com.cs.pojo.Journey;
import com.cs.service.JourneyService;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cuong
 */
@ManagedBean
@Named(value = "journeyBean")
@Dependent
public class JourneyBean {
    private final static JourneyService jourService = new JourneyService();
    /**
     * Creates a new instance of JourneyBean
     */
    public JourneyBean() {
    }
    public List<Journey> getJourneys() {
        return jourService.getJourneys(null);
    }
}
