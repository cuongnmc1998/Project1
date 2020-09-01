/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author Cuong
 */
@Entity
@Table(name="ticket",schema = "airline")
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="FlightH")
    private int flightH;
    @Column(name="DayT")
    private String dayT;
    @Column(name="PlaceOfSale")
    private String placeofsale;
    @Column (name="price")
    private double price;
    
     

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
     * @return the flightH
     */
    public int getFlightH() {
        return flightH;
    }

    /**
     * @param flightH the flightH to set
     */
    public void setFlightH(int flightH) {
        this.flightH = flightH;
    }

    /**
     * @return the dayT
     */
    public String getDayT() {
        return dayT;
    }

    /**
     * @param dayT the dayT to set
     */
    public void setDayT(String dayT) {
        this.dayT = dayT;
    }

    /**
     * @return the placeofsale
     */
    public String getPlaceofsale() {
        return placeofsale;
    }

    /**
     * @param placeofsale the placeofsale to set
     */
    public void setPlaceofsale(String placeofsale) {
        this.placeofsale = placeofsale;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDayT(int dayT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrice(BigDecimal price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
