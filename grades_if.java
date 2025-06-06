//this program is to check the leap year 

public class grades_if {    
    
    public static void main(String[] args) {
     
        int marks=20;

        if(marks<35)
        {
            System.out.println(marks +" your grade is 'F'");
        }
        else if(marks>=35 && marks <45)
         {
            System.out.println(marks +" your grade is 'E'");
         }
         else if(marks>=45 && marks <55)
         {
            System.out.println(marks +" your grade is 'D'");
         } 
         else if(marks>=55 && marks <65)
         {
            System.out.println(marks +" your grade is 'C'");
         }
          else if(marks>=65 && marks <75)
         {
            System.out.println(marks +" your grade is 'B'");
         }
         else if(marks>=75 && marks<=100)
         {
            System.out.println(marks +" your grade is 'A'");
         }
    }
}
