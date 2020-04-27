package group;

public class Student {

    private String name;
    private String faculty;
    private double averageGrade;

    public Student(String name, String faculty, double averageGrade) {
        this.name = name;
        this.faculty = faculty;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
