class Subject{
    String name;
    String type;
    int credits;
    Subject(String name,String type,int credits){
        this.name = name;
        this.type = type;
        this.credits = credits;
    }
    @Override
    public String toString(){
        return "Subject("+ name + "," + type + "," + credits +")";
    }
}

class Branch{
   String name;
   String bhavan;
   int floor;
   String hod;
   int code;
   Branch(String name,String bhavan,int floor,String hod,int code){
    this.name = name;
    this.bhavan = bhavan;
    this.floor = floor;
    this.hod = hod;
    this.code = code;
   }
   @Override
   public String toString(){
    return "Branch("+name + "," + bhavan + ","+ floor + ","+ hod + ","+code + ")";
   }
}

class Student{
    String name;
    int age;
    String rollNumber;
    Branch branch;
    Subject[] subjects;
    Student(String name,int age ,String rollNumber,Branch branch,Subject[] subjects){
        this.name = name;
        this.age =age;
        this.rollNumber = rollNumber;
        this.branch =branch;
        this.subjects = subjects;
    }

    void showStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("RollNumber: "+ rollNumber);
        System.out.println("Age: "+age);
        System.out.println("Branch: "+branch);
        for(Subject i : subjects)
        System.out.println("Subject: "+ i);
    }
}


public class composition {
    public static void main(String[] args) {
        Branch b1 = new Branch("CSE", "Ramanujan", 2, "Murthy", 24134);
        Subject[] subs = {
                       new Subject("M1", "calculation", 3),
                       new Subject("Java", "Theory", 3)
        };
        Student s1 =new Student("Akshay", 20, "24p31A0539", b1, subs);
        s1.showStudentDetails();
    }
}
