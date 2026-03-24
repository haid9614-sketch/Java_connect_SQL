public class Student {
    private int id;
    private String name;
    private String major;
    private double gpa;
    public Student() {}
    public Student(int id, String name, String major, double gpa ) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getMajor() {
        return this.major;
    }
    public double getGpa() {
        return this.gpa;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
