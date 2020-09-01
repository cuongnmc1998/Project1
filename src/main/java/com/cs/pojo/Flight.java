/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.pojo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Cuong
 */
@Entity
@Table(name="flight", schema="airline")
public class Flight implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
   
    @Column(name="FlightTime")
    private Date FlightTime;
    
    @ManyToOne
    @JoinColumn(name = "codeht")
    private Journey journey;
    
    @ManyToOne
    @JoinColumn(name = "codemb")
    private Airline airline;
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the FlightTime
     */
    public Date getFlightTime() {
        return FlightTime;
    }

    /**
     * @param FlightTime the FlightTime to set
     */
    public void setFlightTime(Date FlightTime) {
        this.FlightTime = FlightTime;
    }

    /**
     * @return the journey
     */
    public Journey getJourney() {
        return journey;
    }

    /**
     * @param journey the journey to set
     */
    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    /**
     * @return the airline
     */
    public Airline getAirline() {
        return airline;
    }

    /**
     * @param airline the airline to set
     */
    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    
      
}
