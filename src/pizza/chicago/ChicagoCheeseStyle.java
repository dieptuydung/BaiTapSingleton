

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.chicago;

import pizza.Pizza;

/**
 *
 * @author boss dung
 */
public class ChicagoCheeseStyle extends Pizza{

    public ChicagoCheeseStyle() {
        pizzaStr="Pizza Cheese kiểu Chicago\n ";
    }
    
    

    @Override
    public void Prepare() {
        pizzaStr+="Chuẩn bị cheese và bột làm bánh\n";
        
    }

    @Override
    public void Bake() {
        pizzaStr+="Nướng bánh 25 phút trong 200 độ C\n";
      
    }
    
}
