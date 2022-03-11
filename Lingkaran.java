package cuboidcylinder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfaa
 */
public class Lingkaran implements MenghitungRuang {

    @Override
    public void calccirc(float radius, float height2) {
        float circarea = (float) (radius*radius*3.14) ;
        float circcirc = (float) (2*3.14*radius);
        System.out.println("Circle area = " +circarea);
        System.out.println("Circle circumference = " +circcirc);
    }

    @Override
    public void calccyl(float radius, float height2) {
        
    }

   
    
}
