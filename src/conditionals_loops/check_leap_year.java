//this program is to check the leap year 

public class leap_year {    
    
    public static void main(String[] args) {
               
        int year=2020;
               
        if((year%4==0))
        {
            if((year%100==0))
            {
                if((year%400==0))
                {
                    System.out.println(year +" year is a leap year");
                }
               else
               {
                System.out.println(year +" year is not a leap year");
               } 
            }
            else
            {
                System.out.println(year +" year is a leap year");
            }            
        }
        else
        {
            System.out.println(year +" year is not a leap year ");
        }        
        
    }
}
