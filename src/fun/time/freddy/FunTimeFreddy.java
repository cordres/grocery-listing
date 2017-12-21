package fun.time.freddy;

/**
 *
 * @author 18078
 */
import java.util.Scanner;

public class FunTimeFreddy {
    
private static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String groceryName [] = new String [3];
        double groceryPrice [] = new double[3];
        
        for (int i =0; i < groceryName.length; i++){
        System.out.print("please enter item name: ");
        groceryName[i] = in.nextLine();
        
        System.out.println("please enter price: ");
        groceryPrice[i] = in.nextDouble() * 1.07;
        in.nextLine();
    }
        for (int i =0; i < groceryName.length; i++){
        System.out.printf("the cost of " + groceryName[i] +
                "'s: " + groceryPrice[i]);
    }
        
        
        
        
        
        
        
    }
    
}
