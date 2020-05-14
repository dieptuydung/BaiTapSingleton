/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author boss dung
 */
public  abstract class Pizza {
     protected String pizzaStr;

    public Pizza() {
    }
    public abstract void Prepare();
    public abstract void Bake();
    public void Cut()
    {
        pizzaStr +="cắt thành 8 miếng\n";
    }
    public void Box()
    {
        pizzaStr +="bỏ trong hộp\n";
    }    

    @Override
    public String toString() {
        return pizzaStr;
    }
     
    
}
