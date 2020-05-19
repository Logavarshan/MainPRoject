package com.niit.practise;




public class App 
{
    public static void main( String[] args )
    {
    	 int i=10;
         int j=11;
         int k;
         
         try
         {
        	 if (j==0) throw new Logavarshan("Cannot divide by zero");
        	
             
             else 
                     {
                         System.out.println("The result is possible");
                     }
        	 k=i/j;
             
             System.out.println("The result is " + k);
         }
        
        /* catch (Exception e)
         {
             System.err.println("Error...denominator cannot be zero");
         }*/
        catch (Logavarshan e)
         {
             System.out.println("Error " + e.getMessage());
         }
         
    }
}
