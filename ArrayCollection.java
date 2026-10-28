public class ArrayCollection {
    public static void main(String[] args) {
      int[][] arrays = {
                          {1, 2, 3}, 
                          {4, 5, 6}, 
                          {7, 8, 9}
                       };
              int[][] result = reversedArray(arrays);
              for (int index = 0; index < arrays.length; index++) {
                  for (int count = 0; count < arrays[index].length; count++) {
                      System.out.print(result[index][count] + " ");
                  }
                  System.out.println();
              }
          }
      
    public static int[][] reversedArray(int[][] arrays) {
      for (int index = 0; index < arrays.length; index++) {
          for (int row = 0; row < arrays[index].length; row++) {
              for (int column = row + 1; column < arrays[index].length; column++) {
                 // if (arrays[index][row] < arrays[index][column]) {
                      int arraySwap = arrays[index][row];
                          arrays[index][row] = arrays[index][column];
                          arrays[index][column] = arraySwap;
                  }
              } 
          }
      
      return arrays;
   }
}
   
