import java.util.LinkedHashSet;
import java.util.Set;

class student {
    String name,branch,usn;
    Double cgpa;
    int id;
    student(String name,String branch,String usn,Double cgpa,int id) {
        this.name = name;
        this.branch = branch;
        this.usn = usn;
        this.cgpa = cgpa;
        this.id=id;
    }
    void show() {
        System.out.println(name+" "+branch+" "+usn+" "+cgpa+" "+id);
    }
    // to return as string in-built function.
    public String toString() {
        return name+" "+branch +" "+usn + " "+cgpa+" "+id;
    }
}

public class LinkedHash {
    public static void main(String[]args) {
        student s1= new student("abhishek", "vk093", "cse", 7.52,100);
        student s2= new student("abhi", "vk094", "ise", 7.0,200);
        student s3= new student("ramesh", "vk07", "civil", 8.3,300);
        student s4= new student("rahul", "vk03", "ece", 9.0,400);
        student s5= new student("abhishek", "vk093", "cse", 7.52,100);
        // LinkedHashSet maintains the oreder.
        Set <student> sl = new LinkedHashSet<student>();
        sl.add(s1);sl.add(s2);sl.add(s3);sl.add(s4);sl.add(s5);
        // using toStirng() traverse.
        System.out.println(sl);
        java.util.Iterator <student> i =sl.iterator();
        // using iteratior method traverse.
        while(i.hasNext()) {
            student temp = (student) i.next();
            temp.show();
        }
    }
}

