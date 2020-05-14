/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ny;

import pizza.Pizza;

/**
 *
 * @author boss dung
 */
public class NYCheeseStyle extends Pizza{

    public NYCheeseStyle() {
        pizzaStr="Pizza Cheese kieeyr New York ";
        
    }
    

    @Override
    public void Prepare() {
        pizzaStr+="Chuẩn bị bột và cheese\n";
        
         
    }

    @Override
    public void Bake() {
        pizzaStr+="Nướng banhs 20 phút ở nhiệt đọ 200 độ C\n";
        
        
        
      
    }
    
}
