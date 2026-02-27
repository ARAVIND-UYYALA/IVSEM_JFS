import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteNameToFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        sc.close();
        try{
            FileWriter obj=new FileWriter("student.txt");
            obj.write(name);
            System.out.println("Hello my name is "+name);
            obj.close();
        }catch(IOException f){
            System.out.println("An Error occurred");
            f.printStackTrace();
        }
    }
}
