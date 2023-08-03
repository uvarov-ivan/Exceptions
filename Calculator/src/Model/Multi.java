package Model;

import Controller.iGetView;
import Controller.iModel;
import Exception.NegativeException;

public class Multi implements iModel{

    @Override
    public double action(iGetView view) {
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = Double.parseDouble(view.prompt("Введите первый множитель"));
            secondNum = Double.parseDouble(view.prompt("Введите второй множитель"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "Введены неверные данные!");

        }

        try {
            double res = firstNum * secondNum;
            if (res < 0) {
                throw new NegativeException();
            }
            return res;
        } catch (NegativeException e) {
            System.out.println(e.getMessage() + "Произведение введённых чисел отрицательно");
            return (double) 0;
        }
    }
    
}
