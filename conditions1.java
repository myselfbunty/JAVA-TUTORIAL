import java.util.*;

public class conditions1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button == 1 ){
        //     System.out.println("hello");
        // }
        // else if(button == 2){
        //     System.out.println("namaste");
        // }
        // else if(bitton == 3){
        //     System.out.println("Bonjour");
        // }
        // else {
        //     System.out.println("Invalid button");
        // }
       switch(button){
        case 1 : System.out.println("hello");
        break;
        case 2 : System.out.println("namaste");
        break;
        case 3 : System.out.println("Bonjour");
        break;
        default : System.out.println("Invalid button");

       }
        


    }
}
