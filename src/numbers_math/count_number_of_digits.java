package src.numbers_math;
//this program is to check the leap year 

public class count_number_of_digits {    
    
    public static void main(String[] args) {
     
        int num=423424;
        int rem=0;
        int i=0;

        while(num>0)
        {
            rem=num%10;
            //System.out.println(rem);
            num=num/10;
            i++;
        }
        System.out.println("Number of digits in the given number is " +i);
    }
       
}
