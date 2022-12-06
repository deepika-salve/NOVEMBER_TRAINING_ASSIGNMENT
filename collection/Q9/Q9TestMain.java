package collection.Q9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q9TestMain {
	
	public static void main(String[] args) {
        Employee e1 = new Employee(201, "pooja", 20000, "Hr", "jalgaon");
          Employee e2 = new Employee(202, "minakshi", 6000, "software", "amravti");
          Employee e3 = new Employee(203, "kajal", 2300, "IT4", "mumbai");
          Employee e4 = new Employee(204, "nishi", 9000, "Admin", "pune");
          Employee e5 = new Employee(205, "aarati", 9000, "It1", "mumbai");
          Employee e6 = new Employee(206, "sanju", 10000, "It2", "jalgaon");
          Employee e7 = new Employee(207, "shama", 10990, "It3", "mumbai");
          Employee e8 = new Employee(208, "nita", 16000, "Admin", "mumbai");
          Employee e9 = new Employee(209, "megha", 17000, "It", "mumbai");
          Employee e10 = new Employee(210, "yuga", 18400, "software", "pune");
        Set<Employee> list = new HashSet<>();
          list.add(e1);
          list.add(e2);
          list.add(e3);
          list.add(e4);
          list.add(e5);
          list.add(e6);
          list.add(e7);
          list.add(e8);
          list.add(e9);
          list.add(e10);
        for (Employee e : list) {
              System.out.println(e);
          }
      }
  


}
