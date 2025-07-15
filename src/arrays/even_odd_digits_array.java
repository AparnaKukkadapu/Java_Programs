package src.arrays;
class Main {
    public static void main(String[] args) {
               
        int a[]={1,2,3,4,5,6,7,8,9};
        int even=0;
        int odd=0;
        
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]);
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of even digits in the given array is " +even);
        System.out.println("Number of odd digits in the given array is " +odd);
    }
}