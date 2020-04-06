import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

    public static class Student {
        int rollNo;
        String name;
        int age;

        Student(int rollNo,String name, int age){
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

//        @Override
//        public int compare(final Student s1, final Student s2){
//            Integer d1 = null;
//            Integer d2 = null;
//            d1 = s1.age;
//            d2 = s2.age;
//            return d2.compareTo(d1);
//        }

//        @Override
//        public int compare(final Student s1, final Student s2){
//            String name1 = s1.name;
//            String name2 = s2.name;
//            return name2.compareTo(name1);
//        }
    }

    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Ananya",25));
        list.add(new Student(2,"Fn",25));
        list.add(new Student(3,"Snu",23));
        list.add(new Student(4,"Bnz",30));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.name).compareTo(o2.name);
            }
        });
        list.forEach(in-> {
            System.out.println("Roll No: "+in.rollNo + " Name: "+in.name + " Age : "+in.age);
        });
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return (int)s1.age-s2.age;
            }
        });

        list.forEach(in-> {
            System.out.println("Roll No: "+in.rollNo + " Name: "+in.name + " Age : "+in.age);
        });



    }
}
