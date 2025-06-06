//this program is to check the leap year 

public class divisible_number2 {    
    
    public static void main(String[] args) {
     
        int num=21;

        if(num%3==0&&num%7==0)
        {
            System.out.println(num +" number is a multiple of both 3 and 7");
        }
        else
         {
            System.out.println(num +" number is not a multiple of both 3 and 7");
        }
    }
}
