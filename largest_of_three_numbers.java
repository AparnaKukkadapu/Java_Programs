//this program is to check the largest of two numbers 

public class largest_of_three_numbers {    
    
    public static void main(String[] args) {
               
        int a=50;
        int b=20;
        int c=45;
        
        if(a>b&&a>c)
        {
            System.out.println("a is the largest of three numbers " +a);
        }
        if(b>a&&b>c)
        {
            System.out.println("b is the largest of three numbers" +b);
        }       
        if(c>a&&c>b)
        {
            System.out.println("c is the largest of three numbers" +c);
        }
        
    }
}
