import java.util.*;
public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArray;
   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public ArrayListAlgorithms() {
      intArray = new ArrayList<Integer>();
   }


   public void populateArrayWithRandom() {
   int num = 100;
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int i = 0;i <(int)(Math.random()*num)+1;i++){
         int ranNum =(int)(Math.random()*num);
         intArray.add(ranNum);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
         int seqNum = startNum;
      for(int i = 0; i < intArray.size();i++){
         intArray.add(seqNum);
         seqNum++;
         
      }
      
   }
   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int maxNum = Integer.MIN_VALUE;
      for(int num : intArray){
         if (num>maxNum){
            maxNum=num;
         }
      }
      return maxNum;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      boolean dupe = true;
      for (int i = 0; i<intArray.size();i++){
          for(int x = 1; x<intArray.size();x++){
            if (intArray.get(i)==intArray.get(x)&&i !=x)
            return true;
          }
      }
      return false;      
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int i :intArray){
         if (i==intToFind){
            return true;
         }
      }
      return false;
   }
   public void print(){
      for(int i =0; i<intArray.size(); i++){
         System.out.println(intArray.get(i));
      }
   } 

   // ===== UWHS ALGORITHMS =====
/*
   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
      
         int count = 1;
         int streak = 1;
         for (int i = 0;i<intArray.length;i++){
            if (i!=0)
               if(intArray[i]>intArray[i-1]){
                  count++;
               }
            else{
               count=1;
            }
            if(count>streak){
               streak = count;
            }
            //System.out.println("Count: "+count);
           // System.out.println("Streak: "+streak);
          }
          
       return streak;
       }

   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
      int zero = 0;
      int increment = 0;
      int[] copy = intArray;
      for (int num : intArray){
         if(num==0){
            zero++;
         }
      }
      for (int i=0;i<intArray.length;i++){
         if (intArray[i]!=0){
            copy[increment] = intArray[i];
            increment++; 
         }
      }
      while((intArray.length-zero)<intArray.length){
         copy[intArray.length-zero]=0;
         zero--;
      }
      return copy;
   }
   
*/
   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayListAlgorithms array = new ArrayListAlgorithms();
      array.populateArrayWithRandom();
      array.print();
      System.out.println();
      System.out.println(array.isInArray(0));
      System.out.println(array.hasDuplicates());
      System.out.println(array.findMax());
      //System.out.println(array.longestContiguousSubarray());
      System.out.println();
      
   }
}
