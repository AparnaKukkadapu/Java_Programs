package src.arrays;
class Main {
    public static void main(String[] args) {
               
        int a[]={20,30,90,40,350,50,16,60,70,150,200};
       
        int temp;
        for(int i=0;i<a.length;i++)
        {
            temp=a[0];   
           for(int j=i+1;j<a.length;j++)
           {
            if(a[i]<a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
           }           
        }
         System.out.println("Smallest element in the given array is " +a[a.length-1]);       
     
    }
}