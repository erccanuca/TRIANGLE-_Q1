/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author ercan
 */
public class MainClass_Q1 {
    
    static int N = 4;
	
	// Function for finding maximum sum
	static int maxPathSum(int tri[][], int m, int n)
	{
		// loop for bottom-up calculation
		for (int i = m - 1; i >= 0; i--)
		{
			for (int j = 0; j <= i; j++)
			{
				// for each element, check both
				// elements just below the number
				// and below right to the number
				// add the maximum of them to it
				if (tri[i + 1][j] > tri[i + 1][j + 1])
                                {
					tri[i][j] += tri[i + 1][j];
                                        //System.out.println("\n "+tri[i + 1][j]);
                                        //System.out.println(" "+tri[i][j]);
                                }else{
					tri[i][j] += tri[i + 1][j + 1];
                                        //System.out.println("\n "+tri[i + 1][j + 1]);
                                        //System.out.println(" "+tri[i][j]);
                                }
			}
		}
	
		// return the top element
		// which stores the maximum sum
		return tri[0][0];
	}
	static void setPrimesToZero(int tri[][])
	{
	    for(int i = 0; i<N; ++i){
	        for(int j = 0; j<N; ++j){
	            if(isPrime(tri[i][j])) // if true is prime number and set to zero
	                tri[i][j] = 0;
	        }
	    }
	}
	static boolean isPrime(int n)
	{
	    if(n == 1 || n == 2)
            return false;
        
        for (int i=2; i<=n/2; i++ )
        {
            if(n%i==0)
                return false;
        }
            
        return true;
	}
	/* Driver program to test above functions */
	public static void main (String[] args)
	{
		int tri[][] = { {1, 0, 0, 0},
				{8, 4, 0, 0},
				{2, 6, 9, 0},
				{8, 05, 9, 3}};
                
		setPrimesToZero(tri);
                /*for(int i = 0; i<N; ++i){
                    for(int j = 0; j<N; ++j){
                        System.out.print(tri[i][j]);
                    }
                    System.out.println("");
                }*/
		System.out.println ( maxPathSum(tri, 3, 3));
	}
    
}




