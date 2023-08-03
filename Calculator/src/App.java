import Controller.Controller;
import Controller.iGetView;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        iGetView view = new View();
        Controller control = new Controller(view);
        control.run();
    }
}
