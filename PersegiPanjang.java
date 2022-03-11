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
public class PersegiPanjang implements MenghitungBidang {

    @Override
    public void calcrect(int length, int height, int width) {
        
    }

    @Override
    public void calccub(int length, int height, int width) {
        int recvol = length*height*width;
        int recsurf = (length*height*2)+(width*height*2)+(length*width*2);
        System.out.println("Rectangle volume = " + recvol);
        System.out.println("Rectangle surface area = " + recsurf);
    }
    
}
