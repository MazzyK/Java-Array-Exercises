    /*************************************************************************
    * Author: MazzyK
    * Description: a programme that inverts the contents of an array.
    *************************************************************************/
    public class invertarray {
      public static void main(String[] args) {
        
        int ArraySize = 10; //array size - change here to change throughout programme
            
        int[] Numbers = new int[ArraySize]; //declare and initialise integer array of size ArraySize
        int[] tempNums =  new int[ArraySize];//declare and initialise integer array of size ArraySize
        
        fillArray(Numbers,ArraySize); 
        
        printArray(Numbers,ArraySize); 
        
        invertArray(Numbers, tempNums,ArraySize);
        
        printArray(Numbers,ArraySize);
      }
      
      //a method that populates an array with the numbers 1 to size
      public static void fillArray (int Array[], int size) {
        int j=1;
        
        for (int i=0;i<size;i++) {
          Array[i] = j;
          j++;
        }
      }
      
      //a method that prints the contents of an Array
      
      public static void printArray (int Array[], int size) {
        
        for (int i=0; i<size;i++) {
          System.out.println(Array[i]);
        }
        
      }
      
      //a method that inverts the contents of an array
      
      public static void invertArray (int Array1[], int Array2[],int size) {
        
        int j=size-1;
        
        for (int i=0 ; i<size; i++) {
          Array2[j] = Array1[i];
          j--;
        }
        
        for (int i=0; i<size; i++) {
          Array1[i] = Array2[i];
        }
        
      }
    }
