//Thomas Burless
//CSCI 157 - HW 7 prob 13.6.5
//11-17-16
//Client that prints an array to the terminal that counts from
//7 to 1 in an upside down triangle format, for each number it prints 
//that many numbers of itself to the terminal

import objectdraw.*;
import java.awt.*;

public class UpsideDownTriangleClient extends WindowController{

  public static void main(String[] args) {
  new UpsideDownTriangleClient().startController(800,800);
}

  public void begin() {
    //start at max value and decrement to get descend
    for (int i = 7; i > 0; i -= 1) {
    //decide number of numbers per line
     for (int k = 7; k < (0 - i / 2); k++) {
         System.out.print(" ");
     }
     //print out next number
     for (int j = 0; j < i; j++) {
         System.out.printf("%d ", i);
     }
     System.out.println("");
   }
    }

  }

