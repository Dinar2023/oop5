package HW;

import java.util.ArrayList;

public class ModelGroup {
    String name;
    ModelGroup(){

    }
    public void MakeGroup (String name){
        this.name = name;
    }
   ModelTeacher teacher = new ModelTeacher("A","A",0);
   public void setTeacher(String firstName, String lastName, Integer id){
       this.teacher.firstName = firstName;
       this.teacher.secondName = lastName;
       this.teacher.id = id;
   }
   ModelTeacher getTeacher(){
       return teacher;
   }
    ArrayList <ModelStudent> students = new ArrayList<>();
   public void addStudent(String firstName, String lastName, Integer id) {
       students.add(new ModelStudent(firstName, lastName, id));
   }

    ArrayList <ModelStudent> getStudents(){
       return students;
    }



}
