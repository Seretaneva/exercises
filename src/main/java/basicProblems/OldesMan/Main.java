package basicProblems.OldesMan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(23,0));
        peopleList.add(new People(34,1));
        peopleList.add(new People(45,1));
        peopleList.add(new People(67,1));
        peopleList.add(new People(87,0));

        for (People person: peopleList){
        person.findOldestMan();
        }
    }
}
