package src.numbers_math;
//this program is to check the leap year 

public class reverse_number_while {    
    
    public static void main(String[] args) {
     
        int num=1234;
        int rem=0;
        int rev=0;

        while(num>0)
        {
            rem=num%10;
            System.out.println(rem);
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println(rev);
    }
       
}
