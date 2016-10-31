package calculation;
import java.util.Scanner;



public class Calculation_main {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
      System.out.print("input Number m > ");
      int m = Integer.parseInt(scan.next());
  
     System.out.print("input Number n > ");
  int n = Integer.parseInt(scan.next());

  Calculation_lib clib = new Calculation_lib(m,n);
  System.out.println("m + n ="+clib.getPlus());

  Calculation_lib clib2 = new Calculation_lib(m,n);
  System.out.println("m - n ="+clib2.getMinus());
 
  Calculation_lib clib3 = new Calculation_lib(m,n);
  System.out.println("m * n ="+clib3.getProduct());
  
  Calculation_lib clib4 = new Calculation_lib(m,n);
  System.out.println("m / n ="+clib4.getDrive());
  
  Calculation_lib clib5 = new Calculation_lib(m,n);
  System.out.println("m % n ="+clib5.getMod());
  
    
}
}