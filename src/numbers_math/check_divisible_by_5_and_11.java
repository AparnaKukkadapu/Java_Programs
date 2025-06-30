package src.numbers_math;
//this program is to check the leap year 

public class check_divisible_by_5_and_11 {    
    
    public static void main(String[] args) {
     
        int num=55;

        if(num%5==0&&num%11==0)
        {
            System.out.println(num +" number is divisble by both 5 and 11");
        }
        else
         {
            System.out.println(num +" number is not divisble by both 5 and 11");
        }
    }
}
