package HW;



public class Main {
    public static void main(String[] args) {
        ModelGroup model = new ModelGroup();
        ViewGroup view = new ViewGroup();
        Controller controller = new Controller(model, view);
        controller.processUserInput();
    }
}
