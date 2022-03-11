package cuboidcylinder;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfaa
 */
public class Balok implements MenghitungBidang {

        
    @Override
    public void calcrect(int length, int height, int width) {
        int recarea = length* width;
        int reccirc = width* height;
        System.out.println("Rectangle Area = " + recarea);
        System.out.println("Rectangle Circumference = " + reccirc);
    }
    
    @Override
    public void calccub(int length, int height, int width) {
       
    }

    
    
}
