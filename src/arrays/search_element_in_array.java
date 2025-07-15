package src.arrays;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
               
        int a[]={10,20,30,40,50};
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {
            
            if(num==a[i])
            {
            System.out.println("Number is found" +a[i]);
            break;
            }
           
        }          
            
           
     
    }
}