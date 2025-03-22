/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        int []array = new int[10];
        for(int i=0; i<10;i++){
            array[i]=i+1;
        }
        printArray(array,11);
    }
    /**
     * Prints the first positions of an array 
     * It does not control division by 0.
     * @param   array the array to print
     * @param   n the first positions to print
     */
    static void printArray(int []array, int n){
        try{
            for(int i=0; i <n; i++){
                System.out.println("array["+i+"]="+array[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You have reached the end of the array.");
            System.out.println("No more values will be printed");
        }
    }
}
