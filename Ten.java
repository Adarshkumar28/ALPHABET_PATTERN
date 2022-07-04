class Ten
{
   public static void main(String[] args)
   {
   int i,j,k=65;

         for(i=65; i<=70; i++)
         {
             for(j=65; j<=i; j++)
             {
             System.out.print((char)k+" ");
             k++;
             }
         System.out.println();
         }
    }
}