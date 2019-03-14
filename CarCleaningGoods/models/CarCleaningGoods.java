/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.models;

/**
 *
 * @author Nastya
 */
public class CarCleaningGoods {

   private String name;
   private String producer;
   private String country;
   private int salesPerDay;
   private double price;
   public Quality quality ;
   
   public CarCleaningGoods(){
  
   }

    public CarCleaningGoods(String name, String producer, String country, int salesPerDay, double price, Quality quality){
        this.name = name;
        this.producer = producer;
        this.country = country;
        this.salesPerDay = salesPerDay;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "CarCleaningGoods [name=" + name + ", producer=" + producer +

				", country=" + country + ", salesPerDay=" + salesPerDay + ", price=" +

				price + ", quality=" + quality + "]";
        
    }
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalesPerDay() {
        return salesPerDay;
    }

    public void setSalesPerDay(int salesPerDay) {
        this.salesPerDay = salesPerDay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }
    
    
   
   
    
    
}
