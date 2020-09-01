/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs.bean;

import com.cs.pojo.Product;
import com.cs.service.ProductService;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Cuong
 */
@ManagedBean
@Named(value = "productBean")
@RequestScoped
public class ProductBean {
    private int productId;
  
    private int flightH;

    private String dayT;
  
    private String placeofsale;
   
    private double price;
    private static ProductService proService = new ProductService();
    /**
     * Creates a new instance of ProductBean
     */
    public ProductBean() {
        if(!FacesContext.getCurrentInstance().isPostback()){
            String proId=FacesContext.getCurrentInstance()
                    .getExternalContext().getRequestParameterMap().get("product_id");
            if(proId != null && !proId.isEmpty()){
                Product p =proService.getProductById(Integer.parseInt(proId));
                this.productId=p.getId();
                this.flightH=p.getFlightH();
                this.dayT=p.getDayT();
                this.placeofsale=p.getPlaceofsale();
                this.price=p.getPrice();
            }
        }
    }
    public List<Product> getProducts(){
   
        List<Product> products = getProService().getProducts(null);
        return products;
    }
    public String addProduct(){
        //String proId=FacesContext.getCurrentInstance().getExternalContext().
                    //getRequestParameterMap().get("product_id");
        Product p;
        if(this.productId >0)
            p = proService.getProductById(this.productId);
        else
            p= new Product();
        
        p.setFlightH(this.flightH);
        p.setDayT(this.dayT);
        p.setPlaceofsale(this.placeofsale);
        p.setPrice(this.price);
        
        if(proService.addOrSaveProduct(p)==true)
            return "product-list?faces-redirect=true";
        return "products";
    }
    public String deleteProduct(Product p) throws Exception{
        if(proService.deleteProduct(p))
        return "successful";
        
        throw new Exception("something wrong!!!");
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

    /**
     * @return the proService
     */
    public static ProductService getProService() {
        return proService;
    }

    /**
     * @param aProService the proService to set
     */
    public static void setProService(ProductService aProService) {
        proService = aProService;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }
}
