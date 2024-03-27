package HW;

import java.util.ArrayList;

public class ModelGroupServise {
    ModelGroupServise(){

    }
    ModelTeacher teacher = new ModelTeacher("A","A",0);
    ArrayList<ModelStudent> students;
    public void setGroup(ModelTeacher teacher, ArrayList<ModelStudent> students){
        this.teacher = teacher;
        this.students.addAll(students);


    }
    ModelTeacher getTeacher(){
        return teacher;
    }

    ArrayList<ModelStudent> getStudents(){
        return students;
    }



}
