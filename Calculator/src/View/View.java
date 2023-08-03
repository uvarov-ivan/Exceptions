package View;

// import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.iGetView;

public class View implements iGetView {

//Пытался сделать черес try-with-resosre, 
//но после закрытия сканера при новой итерации он не открывался, пытался победить по разному, не смог, сделал так.

    // Scanner in = new Scanner(System.in);

    // public String prompt(String msg) throws RuntimeException {

    //     System.out.print(msg + " -> ");
    //     // String d = in.nextLine();
    //     System.out.println(in.nextLine());
    //     return in.nextLine();

    // }

    // public Double promptDouble(String msg) {
    //     try {
    //         System.out.print(msg + " -> ");
    //         System.out.println(in.nextLine());
    //         return in.nextDouble();
    //         // System.out.println(in.nextLine());
    //     } catch (InputMismatchException e) {
    //         System.out.println(e.getMessage() + "Введены неверные данные!");
    //         return promptDouble(msg);
    //     }
    // }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg + " -> ");
        String s = in.nextLine();
        // in.close();
        return s;
    }
}
