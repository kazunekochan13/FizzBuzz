/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FizzBuzz;

public class FizzBuzz1 {
    
    public void fb1(){
        for (int i=1; i<101; i++){
            if (i%3 == 0){
                if (i%5 ==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
    public void fb2() {
        for (int i=1; i<101; i++){
            String n = "";
            if (i%3==0){
                n += "Fizz";
            }
            if (i%4==0){
                n += "Buzz";
            }
            if (n==""){
                n = String.valueOf(i);
            }
            System.out.println(n);
        }
    }
    
    public static void main(String[] args){
        FizzBuzz1 main = new FizzBuzz1();
        main.fb2();
    }
}
