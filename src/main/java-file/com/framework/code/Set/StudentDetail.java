import java.util.HashSet;
import java.util.Set;

class students {
    String name,branch,usn;
    Double cgpa;
    int id;
    students(String name,String branch,String usn,Double cgpa,int id) {
        this.name = name;
        this.branch = branch;
        this.usn = usn;
        this.cgpa = cgpa;
        this.id=id;
    }

    void show() {
        System.out.println(name+" "+branch+" "+usn+" "+cgpa+" "+id);
    }
    //override hasCode and equal method to eliminate the duplicany in hashset.
    public int hashCode() {
        return  id*10;
    }

    public boolean equals(Object o) {
        student s = (student)o;
        if(this.id==s.id) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return name + " "+ branch+" "+ usn+" "+cgpa+" "+id;
    }

}



class studentDetail {
    public static void main(String[]args) {
        students s1= new students("abhishek", "vk093", "cse", 7.52,100);
        students s2= new students("abhi", "vk094", "ise", 7.0,200);
        students s3= new students("ramesh", "vk07", "civil", 8.3,300);
        students s4= new students("rahul", "vk03", "ece", 9.0,400);
        students s5= new students("abhishek", "vk093", "cse", 7.52,100);

        // System.out.println(s1);System.out.println(s2);System.out.println(s3);
        // System.out.println(s4);System.out.println(s5);

        Set <students> h = new HashSet<students>();
        h.add(s1);h.add(s2);h.add(s3);h.add(s4);h.add(s5);
        System.out.println(h);
        System.out.println();

        java.util.Iterator <students> i = h.iterator();
        while(i.hasNext()) {
            students temp = (students)i.next();
            temp.show();
        }

    }
}
