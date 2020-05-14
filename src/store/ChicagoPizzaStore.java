/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.chicago.ChicagoCheeseStyle;
import pizza.chicago.ChicagoClamStyle;
import pizza.chicago.ChicagoPepperoniStyle;

/**
 *
 * @author boss dung
 */
public  class ChicagoPizzaStore extends PizzaStore{
    private static ChicagoPizzaStore intance;

    protected ChicagoPizzaStore() {
       
    }
    public static ChicagoPizzaStore Intance()
    {
        if(intance==null)
            intance = new ChicagoPizzaStore();
        return intance;
    }

    @Override
    protected Pizza createPizza(PizzaType type) {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
        }
        switch(type)
        {
            case clam: return new ChicagoClamStyle();
        }
        switch(type)
        {
            case pepperoni: return new ChicagoPepperoniStyle();
        }
        return null;
    }

    

   
    

   
        

     
}
    

 
