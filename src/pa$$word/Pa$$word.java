/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa$$word;

/**
 *
 * @author teel6
 */
import java.util.Scanner;
public class Pa$$word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String FirstName = sc.nextLine();
        System.out.println("Please enter your last name:");
        String LastName = sc.nextLine();
        int integer = 10 + (int)(Math.random() * ((99 - 10) + 1));
        
        System.out.println(FirstName.substring(0, 1) + LastName.charAt(0) + LastName.charAt(1) + LastName.charAt(2)
                + LastName.charAt(3) + LastName.charAt(4) + integer);
    }
    
}
