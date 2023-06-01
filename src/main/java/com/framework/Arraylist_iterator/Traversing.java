package framework.code.Arraylist_iterator;
import java.util.ArrayList;

    class StudentDetail {
        String name,usn;
        int age;

        StudentDetail(String name,String usn, int age) {
            name = this.name;
            usn = this.usn;
            age = this.age; // refer to local variable with "this" operator not instance variable.
        }
        // below method return data of class rather than refId or address of constructor.
        public String toString() {
            return name+" "+ usn+" "+" "+age;
        }
    }

    class Traversing {
        public static void main(String args[]) {
            ArrayList<StudentDetail> arrraylilst = new ArrayList<StudentDetail>();
            StudentDetail detail1 = new StudentDetail("Abhishek","vk21",20);
            StudentDetail detail2 = new StudentDetail("Abhi","vk22",19);
            StudentDetail detail3 = new StudentDetail("surya","vk23",22);
            arrraylilst.add(detail1);
            arrraylilst.add(detail2);
            arrraylilst.add(detail3);
            for(int i=0;i<arrraylilst.size();i++) {
                System.out.println(arrraylilst.get(i));
            }
            java.util.Iterator<StudentDetail>iterator=arrraylilst.iterator();
            // Traversing through iterator. // Traversing with poiniter in java.
            while(iterator.hasNext()) {
                StudentDetail std = (StudentDetail)iterator.next();
                System.out.println(std.name+" "+std.usn+" "+std.age);
            }
        }
    }


