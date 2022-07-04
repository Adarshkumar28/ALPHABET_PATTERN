class Twelve
{
public static void main(String[] args)
{
   int i,j;
  
  
       for(i=65; i<=70; i++)
       {
            int k=i;
            for(j=65; j<=i; j++)
            {
            System.out.print((char)k+" ");
            k=k+5;
            }
       System.out.println();
       }

 }
}
