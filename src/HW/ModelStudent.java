package HW;

    public class ModelStudent extends ModelPeople implements PrintPeople{
    ModelStudent (String firstName, String lastName, Integer id){
        this.firstName = firstName;
        this.secondName = lastName;
        this.id = id;

    }


        @Override
        public void printP() {
            System.out.println(this.firstName + "\n" +this.secondName +"\n" +this.id);
        }
    }
