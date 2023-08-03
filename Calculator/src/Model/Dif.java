package Model;

import Controller.iGetView;
import Controller.iModel;
import Exception.NegativeDifferenceException;
import Exception.NegativeException;

public class Dif implements iModel {

    @Override
    public double action(iGetView view) {
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = Double.parseDouble(view.prompt("Введите уменьшаемое"));
            secondNum = Double.parseDouble(view.prompt("Введите вычитаемое"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "Введены неверные данные!");

        }

        try {
            double res = firstNum - secondNum;
            if (secondNum < firstNum) {
                throw new NegativeDifferenceException();
            }else if (res < 0) {
                throw new NegativeException();
            }
            return res;
        } catch (NegativeException e) {
            System.out.println(e.getMessage() + "Разность введённых чисел отрицательна");
            return (double) 0;
        } catch(NegativeDifferenceException e){
            System.out.println(e.getMessage());
            return (double) 0;
        }
    }

}
