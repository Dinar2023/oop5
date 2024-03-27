package HW;




public class Controller {
    private ModelGroup modelGroup;
    private ViewGroup viewGroup;
    private ModelGroupServise modelGroupServise;

    public Controller (ModelGroup modelGroup, ViewGroup viewGroup) {
        this.modelGroup = modelGroup;
        this.viewGroup = viewGroup;
    }

    public void processUserInput() {
        boolean running = true;
        while (running) {
            int choice = viewGroup.getUserChoice();
            switch (choice) {
                case 1:
                    modelGroupServise.setGroup(modelGroup.getTeacher(), modelGroup.getStudents());



                    break;
                case 2:
                    viewGroup.ScannerNextLine();
                    modelGroup.setTeacher(viewGroup.getTeacherName(), viewGroup.getTeacherSecondName(), viewGroup.getTeacherID());
                    break;
                case 3:
                    viewGroup.ScannerNextLine();
                    modelGroup.addStudent(viewGroup.getStudentName(), viewGroup.getStudenSecondName(), viewGroup.getStudenID());
                    break;
                case 4:
                    viewGroup.printGroup(modelGroup.getTeacher(), modelGroup.getStudents());
                    break;

                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}


