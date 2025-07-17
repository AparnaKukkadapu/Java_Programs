package src.arrays;
class sum_of_digits_array {
    public static void main(String[] args) {
               
        int a[]={100,200,300,400,500,600};
        int sum=0;
        
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("sum of the digits in the given array is " +sum);
    }
}