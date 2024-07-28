import java.util.Scanner;
public class RailFence{
    public static void main(String[] args){
    String text = "meetmeinpark";
    System.out.println(text);
    Scanner obj = new Scanner(System.in);
    System.out.println("enter no. of rows");
    int rows = obj.nextInt();
    System.out.println("no. of rows is: "+rows);
    int cols = (int) Math.ceil((double) text.length() / rows);
     System.out.println("no. of columns is: "+cols);
     
     char[][] grid = new char[rows][cols];
     
     int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (index < text.length()) {
                    grid[r][c] = text.charAt(index);
                    index++;}
                    else {
                    grid[r][c] = ' '; }
            }
    
    }
    for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("Your cipher text is:");
        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
               System.out.print(grid[j][i]);
            }
        }

        System.out.println(); 
                
    
}
}
