    /*************************************************************************
    * Author: MazzyK
    * Description: a programme that shifts an array based on the size of array 
    * and shift position input by the user
    *************************************************************************/
    import java.util.Scanner;
    import java.util.Arrays;

    public class rotatearray {
        
      public static void main(String[] args) {
        
        int[] res = getInfo(); //save the array size and position input by the user in the res array
        
        int ArraySize = res[0]; //array size 
        int pos = res[1]; //position where the shift starts
        
        int[] Numbers = new int[ArraySize]; //initialise new integer array of size ArraySize
        int[] tempNums = new int[ArraySize]; //initialise new integer array of size ArraySize
        
        fillArray(Numbers,ArraySize); //populate array
          
        printArray(Numbers,ArraySize); //print start state of array
          
        rotateArray (Numbers, tempNums, ArraySize, pos); //shift array according to position input by user
          
        printArray(tempNums,ArraySize); //print end state of array  
        
      }
      
      
      //a method to prompt the user for the array length and shift position
      public static int[] getInfo() {
        
        Scanner usrInput = new Scanner(System.in);  // Create a Scanner object
        try {
          System.out.println("Enter array size");
            int size = usrInput.nextInt(); //save array size as the first element of the usrInput array
            
            
            System.out.println("Enter position"); 
            int pos = usrInput.nextInt(); //save position as the second element of the usrInput array
            
            //while the array size is smaller than the shift position prompt user for new parameters
            
            while ((size<pos)|| (pos == size-1)) { //(pos ==size-1) is a problem because arrays start at position 0
              if (size<pos) {
                System.out.println("Please make sure the array size is greater than the shift position \n");
                
                System.out.println("Enter array size");
                size = usrInput.nextInt(); //save array size as the first element of the usrInput array
                
                
                System.out.println("Enter position"); 
                pos = usrInput.nextInt(); //save position as the second element of the usrInput array
              }else {
                
                System.out.println("Please make sure the the position value is less than array size -1 \n");
                
                System.out.println("Enter array size");
                size = usrInput.nextInt(); //save array size as the first element of the usrInput array
                
                
                System.out.println("Enter position"); 
                pos = usrInput.nextInt(); //save position as the second element of the usrInput array
              }
              
            }
            
            return new int[] {size,pos};
          
        }finally {
          
          usrInput.close();
        }
         
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
        
        System.out.println(Arrays.toString(Array));  
      }
      
      //a method that shifts the items in an array
      
      public  static void rotateArray (int Array1[], int Array2[], int size, int position) {
        
        int newsize=size - (position+1);
        int j=0;
        
        for (int i=0; i<newsize;i++) {
          Array2[i] = Array1[position+1];
          position++;
        }
        
        for (int i=newsize;i<size;i++) {
          Array2[i] = Array1[j];
          j++;
        }
      }
        
    }
