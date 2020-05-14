/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;

/**
 *
 * @author boss dung
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza( type);
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
        return pizza;
    }
    
}
