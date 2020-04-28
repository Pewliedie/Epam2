package group;

public class Student {
    private int index;
    private String name;
    private String faculty;
    private double averageGrade;

    public Student(int index, String name, String faculty, double averageGrade) {
        this.index = index;
        this.name = name;
        this.faculty = faculty;
        this.averageGrade = averageGrade;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
    public String  toString() {
        return "Student{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
