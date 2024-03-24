package HW;

public class ModelTeacher extends ModelPeople implements PrintPeople{
    ModelTeacher (String firstName, String lastName, Integer id){
        this.firstName = firstName;
        this.secondName = lastName;
        this.id = id;
    }

    @Override
    public void printP() {
        System.out.println(this.firstName + "\n" +this.secondName +"\n" +this.id);
    }
}
