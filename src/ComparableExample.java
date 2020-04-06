import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

    public static class Student implements Comparable<Student>{
        int rollNo;
        String name;
        int age;

        Student(int rollNo,String name, int age){
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

//        @Override
//        public int compareTo(Student st){
//            return this.name.compareTo(st.name);
//        }

        @Override
        public int compareTo(Student st) {
            if (age == st.age) {
                return 0;
            } else if (age > st.age) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Ananya",25));
        list.add(new Student(2,"Fn",25));
        list.add(new Student(3,"Snu",23));
        list.add(new Student(4,"Bnz",30));
        Collections.sort(list);
        list.forEach(in-> {
            System.out.println("Roll No: "+in.rollNo + " Name: "+in.name + " Age : "+in.age);
        });


    }
}
