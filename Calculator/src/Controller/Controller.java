package Controller;

import Model.Dif;
import Model.Divid;
import Model.Multi;
import Model.PowerCalculator;
import Model.Sum;

public class Controller {
    private iGetView view;
    /**
     * Контроллер калькулятора
     * @param view возможность выбора вьюшки
     */

    public Controller(iGetView view) {
        this.view = view;
    }

    public void run() {

        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            try {
                String command = view.prompt("Введите желаемое действие");
                com = Command.valueOf(command.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Введена неизвестная команда!");
                break;
            }
            


            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;

                case SUM:
                    System.out.println(new Sum().action(view));
                    break;

                case DIF:
                    System.out.println(new Dif().action(view));
                    break;

                case DIVID:
                    System.out.println(new Divid().action(view));
                    break;

                case MULTI:
                    System.out.println(new Multi().action(view));
                    break;

                case POWER:
                System.out.println(new PowerCalculator().action(view));
                    break;
                
                case NONE:
                break;

            }

        }

    }    
}
