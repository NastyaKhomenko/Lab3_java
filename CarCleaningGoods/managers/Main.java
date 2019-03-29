/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.CarCleaningGoods.managers;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.CarCleaningGoods.models.Quality;
import ua.lviv.iot.CarCleaningGoods.models.CarCleaningGoods;

/**
 *
 * @author Nastya
 */
public class Main {
    
    public static void main(String[] args){
        
        List<CarCleaningGoods> goods = new ArrayList<CarCleaningGoods>();
    
        goods.add(new CarCleaningGoods("Detergent","Mr.Proper","Poland",20,50,Quality.MEDIUM));
        goods.add(new CarCleaningGoods("Brusher","Rock","Poland",10,30,Quality.BAD));
        goods.add(new CarCleaningGoods("Duster","CrystalClean","France",30,55,Quality.GOOD));
        goods.add(new CarCleaningGoods("High Pressure Washer","Karcher","Germany",3,5000,Quality.GOOD));
        goods.add(new Duster(Size.S, "soft", "black"));
        goods.add(new Brusher("light",Convenience.COMFORTABLE));
        goods.add(new Detergent(1.0 ,"glass"));
        goods.add(new HighPressureWasher( 120));
    
       
        
         List<CarCleaningGoods> sortedCarCleaningGoods1 = 
                (new CarCleaningGoodsManager(goods)).sortByPrice(false);
        System.out.println(sortedCarCleaningGoods1);
        
         List<CarCleaningGoods> sortedCarCleaningGoods = 
                (new CarCleaningGoodsManager(goods)).sortBySalesPerDay(true);
        System.out.println(sortedCarCleaningGoods);
                
    }
    
}
