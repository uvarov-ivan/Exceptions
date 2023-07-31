package Homework2;

import java.util.Scanner;

public class View {
    
    public static String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg + " -> ");
        return in.nextLine();
    }

}
