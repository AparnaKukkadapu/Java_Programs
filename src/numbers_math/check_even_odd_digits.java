package src.numbers_math;
//this program is to check the leap year 

public class check_even_odd_digits {    
    
    public static void main(String[] args) {
     
        int num=23456;
        int rem=0;
        int even=0;
        int odd=0;

        while(num>0)
        {
            rem=num%10;
            //System.out.println(rem);
            num=num/10;
            if(rem%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of even digits in the given number is " +even);
        System.out.println("Number of odd digits in the given number is " +odd);
    }
       
}
