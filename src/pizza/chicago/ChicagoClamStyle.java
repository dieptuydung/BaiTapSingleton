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
public class ChicagoClamStyle extends Pizza{
    

    public ChicagoClamStyle() {
        pizzaStr="Pizza Clam kiểu Chicago\n";
    }
    

    @Override
    public void Prepare() {
        pizzaStr+="Chuẩn bị Clam và bột làm bánh\n";
        
       
    }

    @Override
    public void Bake() {
        pizzaStr+="Nướng bánh 20 phút ở nhiệt độ 250 độ C\n";
      
    }
    
}
