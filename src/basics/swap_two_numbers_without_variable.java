class Main {
    public static void main(String[] args) {
               
        int a=10;
        int b=20;
        
        System.out.println("Before swapping of numbers is");
        System.out.println("a value is " +a);
        System.out.println("b value is " +b);
       
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping of numbers is");
        System.out.println("a value is " +a);
        System.out.println("b value is " +b);
        
    }
}