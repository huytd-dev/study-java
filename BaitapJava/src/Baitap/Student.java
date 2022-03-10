package Baitap;

public class Student extends Person{
    public String lop;


    public Student(String name, int age, float height, String lop) {
        super(name, age, height);
        this.lop = lop;
    }
        public  void getInfo() {
            super.getInfo();
            System.out.println("hoc lop: "+lop);


        }
    }

