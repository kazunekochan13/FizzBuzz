/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package First;

public class FizzBuzz1 {
    
    public static void main(String[] args){
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
}
