/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.managers;

import ua.lviv.iot.CarCleaningGoods.models.*;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
/**
 *
 * @author Nastya
 */
public class CarCleaningGoodsManager {
    
    
    private List<CarCleaningGoods> goods;

    public CarCleaningGoodsManager(){
    }
    
    public CarCleaningGoodsManager(List<CarCleaningGoods> goods) {
        this.goods = goods;
    }
 
    public List<CarCleaningGoods> sortByPrice(boolean descending){
        
        Comparator<CarCleaningGoods> comparator =
                
                (CarCleaningGoods obj1, CarCleaningGoods obj2) ->  
 
 
 
    Double.compare((obj1.getPrice()),(obj2.getPrice())); 
 
 
 
   List<CarCleaningGoods> goodsList = goods;
   
       goodsList.sort(comparator); 
   
   if (descending) { 
       
    Collections.reverse(goodsList); 
    
   } 
   return goodsList; 
   
   
   
    }

    
     public List<CarCleaningGoods> sortBySalesPerDay(boolean descending){
         
        Comparator<CarCleaningGoods> comparator =
                
                (CarCleaningGoods obj1, CarCleaningGoods obj2) ->  
 
 
 
    Double.compare((obj1.getPrice()),(obj2.getPrice())); 
 
 
 
   List<CarCleaningGoods> goodsList = goods;
   
   goodsList.sort(comparator); 
   
   if (descending) { 
       
    Collections.reverse(goodsList);
    
   } 
   return goodsList; 
   
   
   
    }
    
     
     
     public List<CarCleaningGoods> findByName(String name) {

		List<CarCleaningGoods> goodsList = goods;

		List<CarCleaningGoods> findCarCleaningGoodsList = goodsList.stream()

				.filter(goods -> goods.getName() == name)

				.collect(Collectors.toList());

		return findCarCleaningGoodsList;

	}


 public List<CarCleaningGoods> findByQuality(Quality quality) {

		List<CarCleaningGoods> goodsList = goods;

		List<CarCleaningGoods> findCarCleaningGoodsList = goodsList.stream()

				.filter(goods -> goods.getQuality() == quality)

				.collect(Collectors.toList());

		return findCarCleaningGoodsList;

	}     
     
    
  public List<CarCleaningGoods> findByProducer(String producer) {

		List<CarCleaningGoods> goodsList = goods;

		List<CarCleaningGoods> findCarCleaningGoodsList = goodsList.stream()

				.filter(goods -> goods.getProducer() == producer)

				.collect(Collectors.toList());

		return findCarCleaningGoodsList;

	}
 
 
   public List<CarCleaningGoods> findByCountry(String country) {

		List<CarCleaningGoods> goodsList = goods;

		List<CarCleaningGoods> findCarCleaningGoodsList = goodsList.stream()

				.filter(goods -> goods.getCountry() == country)

				.collect(Collectors.toList());

		return findCarCleaningGoodsList;

	}
  
  
 
    public List<CarCleaningGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<CarCleaningGoods> goods) {
        this.goods = goods;
    }
    }
    
    
      
    
    

