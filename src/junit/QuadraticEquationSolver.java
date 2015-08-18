package junit;

public class QuadraticEquationSolver
{
	public static String roots(int a,int b,int c)
	{
		  double d = Math.sqrt(b * b - 4 * a * c);
	        assert (d<0):"Imaginary roots Exception"; 
	        double root1 = (-b +  d) / (2*a) ;
	        double root2 = (-b - d) / (2*a) ;
	 
	        return ("The roots are "+root1+" and "+root2);
	}
    public static void main(String[] args)
    { 
        int a = 2;
        int b = 4;
        int c = 0;
        roots( a, b, c);
 
        //Finding out the roots
      
 
        
    }
    
}