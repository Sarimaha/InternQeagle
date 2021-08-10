package homeworks;

public class PyramidPattern2   
{    
	public static void main(String args[])   
	{  /** * * * * * * 
		* * * * * * 
		 * * * * * 
		  * * * * 
		   * * * 
		    * * 
		     *  */
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       

		for (i=row; i>=0; i--)   
		{  

			for (j=row-i; j>1; j--)   
			{  

				System.out.print(" ");   
			}   

			for (j=0; j<=i; j++ )   
			{   

				System.out.print("* ");   
			}   

			System.out.println();   
		}   
	}   
}  
