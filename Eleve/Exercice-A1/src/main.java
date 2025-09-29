/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SchBe878
 */
public class main {
    public static void main(String[] args) {
        Fraction myFraction=new Fraction(3,18); 
        Fraction newFraction=new Fraction(2,6);//6*x=18, x=18/6
        myFraction.add(newFraction);
        System.out.println(myFraction.subtract(newFraction));
 
        Fraction decimal=new Fraction(9.12);
    }
    
}
