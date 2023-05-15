package exemplees;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ExemplePrintWriter {
    public static void main(String[] args) {
        String name="ammetller.txt";
        String path = System.getProperty("user.dir") + File.separator + name;
        FileOutputStream fileOS = null;
        try{
            fileOS=new FileOutputStream(path,true); /* append=true */
        }
        catch (FileNotFoundException ex){
            System.err.println(path + "notFound!");
        }
        PrintWriter pWriter = new PrintWriter(fileOS);
        String poema="A mig aire de la serra\n" +
                "veig un ammetller florit.\n" +
                "Deu te guard bandera blanca\n" +
                "dies ha que t'he delit.";
        String[] versos=poema.split("\n");
        for (String vers:versos){
            pWriter.println(vers); // o write(vers + "\n");
        }
        pWriter.close();
    }
    
}
