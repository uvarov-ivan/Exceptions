package Model;

import Controller.iGetView;
import Controller.iModel;
import Exception.InvalidInputException;
import Exception.NegativeException;

public class PowerCalculator implements iModel {

    @Override
    public double action(iGetView view) {
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = Double.parseDouble(view.prompt("Введите число"));
            secondNum = Double.parseDouble(view.prompt("В какую степень хотите возвести число"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "Введены неверные данные!");

        }

        try {
            double res = 1;
            if (secondNum < 0) {
                throw new NegativeException();
            } else if (firstNum == 0){
                throw new InvalidInputException();
            }
            for (int i = 0; i < secondNum; i++) {
                res *= firstNum;
                        
            }
            return res;
        } catch (NegativeException e) {
            System.out.println(e.getMessage() + "Возведение в отрицательную степень невозможно!");
            return (double) 0;
        } catch(InvalidInputException e) {
            System.out.println(e.getMessage());
            return (double) 0;
        }

    }
}
