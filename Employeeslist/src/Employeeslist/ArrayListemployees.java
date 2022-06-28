package Employeeslist;
import java.util.*;

public class ArrayListemployees {


    public static void main(String args[]) {
        List<employee> list = new ArrayList<>();
        list.add(new employee("Kostya", 24, "Ukraine"));
        list.add(new employee("Bogdan", 34, "Uruguay"));
        list.add(new employee("Viktoriia", 19, "Poland"));
        list.add(new employee("Viktor", 51, "Argentine"));
        list.add(new employee("Mustafa", 31, "USA"));

        for (employee element:list) {
            if (element.age>50){
                System.out.println("name" + " " + element.name);
            }

        }
        for (employee element2:list) {
            if (element2.country == "USA") {
                System.out.println(element2.name + " " + element2.country);
            }
        }
        Collections.sort(list, new Comparator<employee>() {
            @Override
            public int compare(employee o1, employee o2) {

                if (o1.country.length()>o2.country.length()){
                    return o1.country.length();
                }
                else {
                    return o2.country.length();
                }



            }
        });
        System.out.println(list);





    }
    }