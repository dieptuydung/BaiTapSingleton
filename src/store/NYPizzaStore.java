/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.ny.NYCheeseStyle;
import pizza.ny.NYClamStyle;
import pizza.ny.NYPeperoniStyle;

/**
 *
 * @author boss dung
 */
public class NYPizzaStore extends PizzaStore{
    private static NYPizzaStore intance;

    protected NYPizzaStore() {
    }
    public static NYPizzaStore Intance()
    {
        if(intance==null)
            intance = new NYPizzaStore();
        return intance;
    }
    
            

    @Override
    protected Pizza createPizza(PizzaType type) {
       switch(type)
        {
            case cheese: return new NYCheeseStyle();
        }
        switch(type)
        {
            case clam: return new NYClamStyle();
        }
        switch(type)
        {
            case pepperoni: return new NYPeperoniStyle();
        }
        return null;
       
    }
    
}
