import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
public class ReadNameToFile {
    public static void main(String[] args) {
        try{
            File file=new File("student.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()) {
                String name=sc.nextLine();
                System.out.println(name);
            }
            sc.close();
            System.out.println("File Reading succesfully ...");
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
