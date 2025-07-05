package src.numbers_math;
//this program is to check the leap year 

public class calculate_sum_of_digits {    
    
    public static void main(String[] args) {
     
        int num=1234;
        int rem=0;
        int sum=0;
       
        while(num>0)
        {
            rem=num%10;
            //System.out.println(rem);
            num=num/10;
            sum=sum+rem;
        }
        System.out.println("Sum of digits in the given number is " +sum);
        
    }
       
}
