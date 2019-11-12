import java.util.ArrayList;
import java.util.Scanner;

public class colors {
public static void main(String[]args) {

    Scanner input = new Scanner(System.in);
    ArrayList<String> col = new ArrayList<>();
    System.out.println("colors");

   col.add("red") ;
    //System.out.println("Yellow");
    col.add("Yellow");
  //  System.out.println("Blue");
  col.add ("Blue");
        String colorD = "";


    // for (int i = 0; i < 1; i++) {}
        System.out.println("Enter color D");
        colorD = input.nextLine();
        col.add(colorD);

        for (String colors : col) {
           // String yellow = "";
           // String red = "";
            //String blue = "";

          System.out.println(colors);


        }
    }
}





