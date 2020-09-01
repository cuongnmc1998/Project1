/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.conf;

import com.cs.pojo.Airline;
import com.cs.pojo.Category;
import com.cs.pojo.Customer;
import com.cs.pojo.Flight;
import com.cs.pojo.Journey;
import com.cs.pojo.Product;
import com.cs.pojo.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author Cuong
 */
public class HibernateUtil {
     private final static SessionFactory FACTORY;
    
    static {
        Configuration conf = new Configuration();
        Properties pros = new Properties();
        pros.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
        pros.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
        pros.put(Environment.URL,"jdbc:mysql://localhost:3306/airline");
        pros.put(Environment.USER,"root");
        pros.put(Environment.PASS,"123456");
        
        conf.setProperties(pros);
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Customer.class);
        conf.addAnnotatedClass(Journey.class);
        conf.addAnnotatedClass(Airline.class);
        conf.addAnnotatedClass(Flight.class);
        conf.addAnnotatedClass(User.class);
    
        
        ServiceRegistry registry =  new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);
    }
      public static SessionFactory getSessionFactory() {
        return FACTORY;
    }
}
