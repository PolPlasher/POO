package exemplees;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExempleScanner {
    public static void main(String[] args) {
        String name="exemple.txt";
        String path = System.getProperty("user.dir") + File.separator + name;
        FileInputStream fileIS = null;
        try{
            fileIS=new FileInputStream(path);
        }
        catch (FileNotFoundException ex){
            System.err.println(path + "notFound!");
            System.exit(1);
        }
        Scanner scan = new Scanner(fileIS);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
    
}
