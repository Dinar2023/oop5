package HW;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewGroup {

    private Scanner scanner;

    public ViewGroup() {
        scanner = new Scanner(System.in);
    }

    public int getUserChoice() {
        System.out.println("1. Вывести состав учебной группы");
        System.out.println("2. Установить учителя в учебную группу");
        System.out.println("3. Добавить студента в учебную группу");
//        System.out.println("4. Добавить учебную группу");
        System.out.println("5. Выход");
        System.out.print("Выберите действие: ");
        return scanner.nextInt();
    }

    void ScannerNextLine(){  //Костыль чтобы перейти на новую строку
        scanner.nextLine();
    }
    String getStudentName(){

        System.out.println("Введите имя студента");
        return scanner.nextLine();
    }

    String getStudenSecondName(){
        System.out.println("Введите Фамилию студента");
        return scanner.nextLine();
    }

    Integer getStudenID(){
        System.out.println("Введите ID студента");
        return scanner.nextInt();
    }

    String getTeacherName(){
        System.out.println("Введите имя преподователя");
        return scanner.nextLine();
    }

    String getTeacherSecondName(){
        System.out.println("Введите Фамилию преподователя");
        return scanner.nextLine();
    }

    Integer getTeacherID(){
        System.out.println("Введите ID преподователя");
        return scanner.nextInt();
    }

    void printGroup (ModelTeacher teacher, ArrayList<ModelStudent> students){
        System.out.println("Преподователь:");
        teacher.printP();
        System.out.println("Студенты:");
        for (ModelStudent student: students) {
            student.printP();
        }

    }






}
