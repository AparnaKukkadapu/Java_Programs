package src.arrays;
class Main {
    public static void main(String[] args) {
               
        int a[]={100,100,200,200,300,400,300,400,600};
        int temp;

        for(int i=0;i<8;i++)
        {
            temp=a[0];
            for(int j=i+1;j<8;j++)    
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }                         
           
            //System.out.println(a[i]);
            for(int j=i+1;j<8;j++)           
            
            {
                if(a[i]==a[j])
            {
               System.out.println("Duplicate element is " +a[i]);
            }
        }             
     
    }   
}
   
}