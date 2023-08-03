package Model;

import Controller.iGetView;
import Controller.iModel;
import Exception.DivisionByZeroException;


public class Divid implements iModel {

    @Override
    public double action(iGetView view) {
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = Double.parseDouble(view.prompt("Введите делимое"));
            secondNum = Double.parseDouble(view.prompt("Введите делитель"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "Введены неверные данные!");

        }

        try {
            double res = firstNum - secondNum;
            if (secondNum == 0) {
                throw new DivisionByZeroException();
            } 
            return res;
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            return (double) 0;
        }
    }

}
