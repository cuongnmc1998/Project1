/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.service;

import com.cs.conf.HibernateUtil;
import com.cs.pojo.Flight;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Cuong
 */
public class FlightService {
    private final static SessionFactory factory = HibernateUtil.getSessionFactory();
        public List<Flight> getFlights(String kw){
            try (Session session = factory.openSession()){
                CriteriaBuilder builder = session.getCriteriaBuilder();
                CriteriaQuery<Flight> query = builder.createQuery(Flight.class);
                Root<Flight> root = query.from(Flight.class);
                query.select(root);
                
                return session.createQuery(query).getResultList();
          }
     }
   
}
