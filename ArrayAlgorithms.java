public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      int[] tempArray = new int[arraySize];
      intArray=tempArray;
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int i = 0;i<intArray.length;i++){
         intArray[i]=(int)(Math.random()*100);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
         int seqNum = startNum;
      for(int i = 0; i < intArray.length;i++){
         intArray[i]=seqNum;
         seqNum++;
         
      }
      
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int maxNum = 0;
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
      for (int i = 0; i<intArray.length;i++){
          for(int x = 1; x<intArray.length;x++){
            if (intArray[i]==intArray[x]&&i !=x)
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
      for(int i =0; i<intArray.length; i++){
         System.out.println(intArray[i]);
      }
   } 

   // ===== UWHS ALGORITHMS =====

   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
      int a = 0;
      int increase = 0;
      int streak = 0;
      for (int array : intArray){
         if(array>increase){
            increase = array;
            a++;
         }
         else{
            a=0;
            increase = 0;
         }
         if(a>streak){
            streak =a;
            System.out.println(streak);
         }
      }
      if(intArray[0]==0){
         return streak+1;
      }
      else{
         return streak;
      }
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
   

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms array = new ArrayAlgorithms(50);
      array.populateArrayWithRandom();
      System.out.println(array.hasDuplicates());
      array.print();
      System.out.println();
      System.out.println();
      System.out.println();
      array.moveZeroesToEnd();
      array.print();
      
   }
}
