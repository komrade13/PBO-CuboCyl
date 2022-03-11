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
public class Tabung implements MenghitungRuang{

    @Override
    public void calccirc(float radius, float height2) {
      
    }

    @Override
    public void calccyl(float radius, float height2) {
        float cylvol = (float) (height2*radius*radius*3.14) ;
        float cylsurf = (float) ((2*3.14*radius)*(radius + height2));
        System.out.println("Cylinder volume = " +cylvol);
        System.out.println("Cylinder surface area = " +cylsurf);
    }

    
}
