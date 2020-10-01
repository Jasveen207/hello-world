/*
 * The pattern in Listing 8-2
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class SomeClassName {
    public static void main(String args[]) 
                                  throws IOException {
        Scanner scannerName =
            new Scanner(new File("SomeFileName"));
        //Some code goes here
        scannerName.nextInt();
        scannerName.nextDouble();
        scannerName.next();
        scannerName.nextLine();
        //Some code goes here
        scannerName.close();
    }
}
