public class Student {
    private String name;
    private int gradYear;
    private double gpa;

    // constructor
    public Student(String studentName, int studentYear, double studentGpa) {
        name = studentName;
        gradYear = studentYear;
        gpa = studentGpa;
    }

    // method prints student profile
    public void profile() {
        System.out.println("This student's name is " + name);
        System.out.println("They will graduate in " + gradYear);
        System.out.println("This student's GPA is "+ gpa);
    }
    // method prints if student makes the honor roll or not
    public void isAnHonorStudent() {
        if (gpa > 90.0) {
            System.out.print("This student makes the honor roll");
        } else {
            System.out.print("This student does not make the honor roll");
        }


    }
}


