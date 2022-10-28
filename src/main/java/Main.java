import java.util.Scanner;
/**
 * Created by Yingjie Yang on 10/27/17.
 */
public class Main {
    public static void main(String[] args ){
    //create Scanner object
        Scanner stringName = new Scanner(System.in);

        //prompt user for entering their name
        System.out.print("Hi, please enter your name: ");
        String name= stringName.nextLine();

        //Greeting users whose name are Alice and Bob
        if(name.equalsIgnoreCase("alice") || name.equalsIgnoreCase("bob")){
            System.out.print("Hi, "+ name);
        }
    }
}
