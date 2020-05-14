/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodcntt3;

import pizza.Pizza;
import pizza.PizzaType;
import store.ChicagoPizzaStore;
import store.NYPizzaStore;
import store.PizzaStore;

/**
 *
 * @author boss dung
 */
public class FactoryMethodCNTT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore store = ChicagoPizzaStore.Intance();
        Pizza pizza=store.orderPizza(PizzaType.clam);
        System.out.println(pizza.toString());
        pizza=store.orderPizza(PizzaType.cheese);
        System.out.println(pizza.toString());
         pizza=store.orderPizza(PizzaType.pepperoni);
        System.out.println(pizza.toString());
        
        PizzaStore nystore=NYPizzaStore.Intance();
        Pizza pizzany=nystore.orderPizza(PizzaType.clam);
        System.out.println(pizzany.toString());
        pizzany=nystore.orderPizza(PizzaType.cheese);
        System.out.println(pizzany.toString());
        pizzany=nystore.orderPizza(PizzaType.pepperoni);
        System.out.println(pizzany.toString());
        
        
        
        // TODO code application logic here
    }
    
}
