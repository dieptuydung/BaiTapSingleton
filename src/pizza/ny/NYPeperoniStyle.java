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
public class NYPeperoniStyle extends Pizza{

    public NYPeperoniStyle() {
        pizzaStr ="Pizza Pepperoni kiểu NY\n";
    }
    

    @Override
    public void Prepare() {
        pizzaStr+="Chuẩn bị pepperoni và bột làm bánh\n";
        
       
    }

    @Override
    public void Bake() {
        pizzaStr+="Nướng bánh 25 phút ở nhiệt độ 250 độ C\n";
        
    }
    
}
