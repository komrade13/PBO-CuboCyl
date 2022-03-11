/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidcylinder;
import java.util.Scanner;
/**
 *
 * @author alfaa
 */
public class Main extends Balok{

    /**
     * @param args the command line arguments
     */
    
    private Main(){
    }
    
    public static void main(String[] args) {
        Scanner selector = new Scanner(System.in);
        Scanner incalc = new Scanner(System.in);
        Balok callB = new Balok();
        Tabung callT = new Tabung();
        Lingkaran callL = new Lingkaran();
        PersegiPanjang callPP = new PersegiPanjang();
        
        System.out.println("=========");
        System.out.println("Main Menu");
        System.out.println("=========");
        System.out.println("1. Calculate Cuboid");
        System.out.println("2. Calculate Cylinder");
        System.out.println("3. Exit");
        System.out.print("Option : ");
        int menu = selector.nextInt();
        
	    switch(menu)
	    {
	    case 1:  
	    	  System.out.println("============");
                  System.out.print("Input length : ");
                  int length = incalc.nextInt();
                  System.out.print("Input width : ");
                  int width = incalc.nextInt();
                  System.out.print("Input height : ");
                  int height = incalc.nextInt();
                  callB.calcrect(length, height, width);
                  callPP.calccub(length, height, width);
                  break;

	    case 2:  System.out.println("============");
                  System.out.print("Input radius : ");
                  float radius = incalc.nextFloat();
                  System.out.print("Input height : ");
                  float height2 = incalc.nextFloat();
                  callL.calccirc(radius, height2);
                  callT.calccyl(radius, height2);
		  break;
                  
            case 3:  System.out.println("Thank you for using this program!");
		  break;
                  
	   default:  System.out.println("Please choose a valid choice!");
        
    }
  }
}