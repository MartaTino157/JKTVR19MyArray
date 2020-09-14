/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19myarray;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println(" ------- Работа с массивами ------- ");
        int myArr[] = new int[20];
        Random random = new Random();
        for (int i=0; i < myArr.length; i++) {
            myArr[i]=random.nextInt(19-0+1)-0;
        }
        
        /* //так можно вывести только четные числа
         for (int i=0; i < myArr.length; i++) {
            while(true){
                int evenNumber = random.nextInt(19-0+1)-0;
                if(evenNumber%2==0){
                    myArr[i]=evenNumber; 
                    break;
                }
            } 
        }*/
        
        //так массив выводится не слишком красиво
        //System.out.println(Arrays.toString(myArr));
        
        for (int n : myArr) {
            if(n > 9){
                System.out.printf("%-3d",n);
            }else{
                System.out.printf("0%-2d",n);
            }
        }
        
        int max =0;
        int min =20;
        int sum =0;
        for (int n : myArr) {
            if(n > max) max = n;
            if(n < min) min = n;
            sum +=n; //sum = sum+n
        }
        double result = (double)(sum - max - min)/myArr.length-2;
        System.out.println();
        System.out.println("Max = "+max+". Min = "+min);
        System.out.println("Среднее арифметическое: "+result);
        
    }
}
