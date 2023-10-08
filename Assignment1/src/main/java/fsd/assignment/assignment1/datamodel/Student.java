package fsd.assignment.assignment1.datamodel;

public class Student {
    private final String studId;
    private final String yearOfStudy;
    private final String module1;
    private final String module2;
    private final String module3;

    /* TODO: the constructor must accept parameters so that all
             instance variables are set accordingly
    */
    public Student(String studId, String yearOfStudy, String module1, String module2, String module3) {
        this.studId = studId;
        this.yearOfStudy = yearOfStudy;
        this.module1 = module1;
        this.module2 = module2;
        this.module3 = module3;


    }

    /* TODO: ensure that all getters are included here
    */
    public String getModule1() {
        return module1;
    }

    public String getModule2() {
        return module2;
    }

    public String getModule3() {
        return module3;
    }

    public String getStudId() {
        return studId;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }
    /* TODO: include a toString() that returns studId
    */

    @Override
    public String toString() {
        return "Student{" +
                "studId='" + studId + '\'' +
                '}';
    }
}
