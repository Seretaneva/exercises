package basicProblems.OldesMan;

public class People {
    private int age;
    private  int gender;
    public  People(int age, int gender){
        this.age = age;
        this.gender = gender;
    }
    public  People(){};
    public int getAge(){return age;}

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        if (gender == 1){
            System.out.println("Male");
        }else if (gender == 0){
            System.out.println("Female");
        }else {
            System.out.println("No gender");
        }

        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    public void findOldestMan(){

       if (this.gender == 1 && this.age >= 50){
           System.out.println("Man age is : " + this.age);
       }
    }
}
