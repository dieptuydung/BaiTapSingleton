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
public class ChicagoPepperoniStyle extends Pizza{

    public ChicagoPepperoniStyle() {
        pizzaStr="Pizza Pepperoni kiểu Chicago\n";
    }
    

    @Override
    public void Prepare() {
        pizzaStr+="Chuẩn bị pepperoni và bột làm bánh\n";
    }

    @Override
    public void Bake() {
        pizzaStr+="Nướng bánh 20 phút ở nhiệt độ 215 độ C\n";
        
    }
    
}
