public class Main {

   public static void main(String []args) {
      // 2D array fata structure
      // like an ARRAY but w rows and columns like grid
      // rows horizantal and columns vert

      // declare a 2d array w double sq brackets
      int[][] experimentData;
      double[][] pointValues;

      // expirementData = new int[10][3]; // 10 row 3 col

      // initilize 2 d aray
      String[][] seatingChart = new String[4][6];
      // 4 x 6

      // set a value by accessing a cell
      // acess a cell: arrayName[row][col]
      seatingChart[0][0] = "Mia";   
      seatingChart[0][5] = "sohaila";   
      seatingChart[1][0] = "Ethan";
      seatingChart[1][5] = "Z";   
      seatingChart[1][1] = "AA";   
      seatingChart[2][3] = "Sim";
      seatingChart[2][4] = "Bo";
      seatingChart[3][0] = "shwartz";
      seatingChart[2][3] = "Sim";
      seatingChart[2][3] = "Sim";
      seatingChart[2][3] = "Sim";
      seatingChart[2][3] = "Sim";
      seatingChart[2][3] = "Sim";

      // Shortcut: INITIALIZER LISTS 
      // use double curly brackets to set values for a 2D array right away
      String[][] bingo = {
         {"!", "A", "11"} ,
         {"S", "<3", ":"} ,
         {",", "20", "x"}
      };
      // Look at new array 
      System.out.println(bingo); // no built-in toString 
      // have to use a loop or access individual items 
      System.out.println(bingo[0][0]); 
      System.out.println(bingo[1][1]); 
      System.out.println(bingo[1][2]); 

      
      // 4.12 array traversals, a row in a 2d array i jusst a 1 d array
      // when loop row first then every col in that row

      // enhanced for each loops nested
      for ( String[] row : seatingChart ) {
         // for every col in current row
         for (String col : row) {
         System.out.print(col + "bo");   
         }
         System.out.println();
      }

      // Standard for loops req tracking the index
      // and knowing how many items in each row/col
      int numRows = seatingChart.length;
      // array[0]. length provides num of cols
      int numCols = seatingChart[0].length;
      // seatingchart0 is whole first row

      // use infor in standard loop
      for (int r = 0; r < seatingChart.length; r++) {
         for (int c = 0; c < seatingChart[0].length; c++){
            // can modift in standard
            seatingChart[r][c] = seatingChart[r][c] + "fourteen";
            System.out.print(seatingChart[r][c]);
         }
         System.out.println();
      }





















   }
}
