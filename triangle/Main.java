/**
 * Do not change the method or class
 * declarations.
 */



public class Main{


    static void printLine(int width){
    	for (int i = 0; i< width; i ++){
	        System.out.print("*");
	    }
	    System.out.println();
    }

    static void printLineWithSpaces(int width, int spaces){
	    for (int i = 0; i< spaces; i ++){
	        System.out.print(" ");
	    }
	    
	    for (int i = 0; i< width; i ++){
	        System.out.print("*");
	    }
	    
	    System.out.println();
    }

    static void printTriangleA(int height){
	    if (height <= 0){
	        return;
	    }
	    
	    printLine(height);
	    printTriangleA(height-1);
    }

    static void printTriangleB(int height){
	    if (height <= 0){
	        return;
	    }
	    
	    printTriangleB(height-1);
	    printLine(height);
    }

    static void printTriangleC(int base,int height){
	    if (height <= 0){
	        return;
	    }
	    
	    printLineWithSpaces(height, (base - height)/2);
	    printTriangleC(base, height-2);
    }

    static void printTriangleD(int base,int height){
	    if (height <= 0){
	        return;
	    }
	    
	    printTriangleD(base, height-2);
	    printLineWithSpaces(height, (base - height)/2);
    }

    /*
     * You don't need to create nothing new!
     * Just use the previous methods as shown
     */
    static void printRhombus(int base){
        printTriangleD(base,base);
	    printTriangleC(base,base);
    }


    public static void main(String[] args){
	    printTriangleA(4);
	    printTriangleB(4);
	    printTriangleC(7,7);
	    printTriangleD(7,7);
	    printRhombus(7);
    }