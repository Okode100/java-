/**
 * Main class of the Java program.
 */

public class Main{

    /*
     * Returns an array with the quotient and remainder of the
     * integer division
     *
     * @param dividend a positive int
     * @param divisor a positive int
     */
    static int[] division(int dividend, int divisor){

	    int result[] = {0, dividend};
	
	    if ( dividend < divisor ){
	        return result;
	    }else{
	        int tmp = dividend - divisor;
	        result = division(tmp,divisor);
	        result[0]++;
	        return result;
	    }
	
    }

    public static void main(String[] args){
	    int result[]=division(13,3);
	    System.out.println("Quotient: "+ result[0]
			   + " Remainder: "+ result[1]);
    }
}

