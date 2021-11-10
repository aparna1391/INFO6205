package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int t = 0;
        
        do{

            Scanner sc = new Scanner(System.in);
            System.out.print("Please input the size of sites:");
            int n = sc.nextInt();
      
       

            Random rd = new Random();
            UF_HWQUPC client = new UF_HWQUPC(n,true);
           

            System.out.println("the number of pairs generated is: "+client.counts(n));
           // System.out.println("the number of connections happening is: "+counts);

          t++; 
        }while(t<10);

    }

    

}