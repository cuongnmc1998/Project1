/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Cuong
 */
@Entity
@Table(name="airline", schema="airline")
public class Airline implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="TyfeOfFlight")
    private String typeofflight;
    @Column(name="nobSeats")
    private String nobSeats;
    @Column(name="nouSeats")
    private String nouSeats;
    @Column(name="sumSeats")
    private String sumSeats;
    
    
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the typeofflight
     */
    public String getTypeofflight() {
        return typeofflight;
    }

    /**
     * @param typeofflight the typeofflight to set
     */
    public void setTypeofflight(String typeofflight) {
        this.typeofflight = typeofflight;
    }

    /**
     * @return the nobSeats
     */
    public String getNobSeats() {
        return nobSeats;
    }

    /**
     * @param nobSeats the nobSeats to set
     */
    public void setNobSeats(String nobSeats) {
        this.nobSeats = nobSeats;
    }

    /**
     * @return the nouSeats
     */
    public String getNouSeats() {
        return nouSeats;
    }

    /**
     * @param nouSeats the nouSeats to set
     */
    public void setNouSeats(String nouSeats) {
        this.nouSeats = nouSeats;
    }

    /**
     * @return the sumSeats
     */
    public String getSumSeats() {
        return sumSeats;
    }

    /**
     * @param sumSeats the sumSeats to set
     */
    public void setSumSeats(String sumSeats) {
        this.sumSeats = sumSeats;
    }
}
