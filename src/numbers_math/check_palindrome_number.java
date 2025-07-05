package src.numbers_math;
//this program is to check the leap year 

public class check_palindrome_number {    
    
    public static void main(String[] args) {
     
        int num=187;
        int rem=0;
        int rev=0;
        int original_number=num;

        while(num>0)
        {
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
       
        if(original_number==rev)
        {
            System.out.println("Number is a palindrome number");
        }
        else
        {
            System.out.println("Number is not a palindrome number");
        }
    }
    
       
}
