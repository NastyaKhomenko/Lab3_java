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
public class Brusher extends CarCleaningGoods{
    private String stiffness;
    private Convenience convenience;
    
    public Brusher (){
        
    }

    public Brusher(String stiffness, Convenience convenience) {
        this.stiffness = stiffness;
        this.convenience = convenience;
    }

    public String getStiffness() {
        return stiffness;
    }

    public void setStiffness(String stiffness) {
        this.stiffness = stiffness;
    }

    public Convenience getConvenience() {
        return convenience;
    }

    public void setConvenience(Convenience convenience) {
        this.convenience = convenience;
    }
    
    
    
}
