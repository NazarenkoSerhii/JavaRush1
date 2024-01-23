package Test;

public class TestMethod3 {

        public static String name = " Amigo ";
        public static String position = " Java developer ";
        public static int salary = 10_000;

        public static void setPosition(String pos) {
            TestMethod3.position = pos;
        }

        public static void setSalary(int sal) {
            TestMethod3.salary = sal;
        }


    public static void main(String[] args) {
        setPosition("Java Developer");
        setSalary(72000);
        System.out.println(name + position +" "+ salary);
    }
    }

