/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.service;

import com.cs.conf.HibernateUtil;
import com.cs.pojo.Airline;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Cuong
 */
public class AirlineService {
     private final static SessionFactory factory = HibernateUtil.getSessionFactory();
     public List<Airline> getAirlines(String kw){
          try (Session session = factory.openSession()){
                CriteriaBuilder builder = session.getCriteriaBuilder();
                CriteriaQuery<Airline> query = builder.createQuery(Airline.class);
                Root<Airline> root = query.from(Airline.class);
                query.select(root);
                
                if(kw != null && !kw.isEmpty()){
                    String p = String.format("%%%s%%", kw);
                    Predicate p1 = builder.like(root.get("nobSeats").as(String.class),p);
                    Predicate p2 = builder.like(root.get("nouSeats").as(String.class),p);
                    
                    query=query.where(builder.or(p1,p2));
                }
                return session.createQuery(query).getResultList();
          }
     }
    
}
