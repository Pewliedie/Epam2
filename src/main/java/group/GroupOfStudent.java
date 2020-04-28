package group;

import java.util.*;

public class GroupOfStudent {
    private List<Student> group = new ArrayList<Student>();

    //добавление
    public void addStudent(int index, String name, String faculty, double grade) {
        group.add(new Student(index, name, faculty, grade));
    }

    //удаление
    public void removeStudent(int index) {
        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getIndex() == index) {
                iterator.remove();
            }
        }
    }

    //изменение имени
    public void changeName(int index, String newName) {
        for (Student stud : group) {
            if (stud.getIndex() == index) {
                stud.setName(newName);
            }
        }
        System.out.println("Name has been changed");
    }

    //изменение факультета
    public void changeFaculty(int index, String newFaculty) {
        for (Student stud : group) {
            if (stud.getIndex() == index) {
                stud.setFaculty(newFaculty);
            }
        }
        System.out.println("Faculty has been changed");
    }

    //изменение оценки
    public void changeAverageGrade(int index, double newGrade) {
        for (Student stud : group) {
            if (stud.getIndex() == index) {
                stud.setAverageGrade(newGrade);
            }
        }
        System.out.println("Average grade has been changed");
    }

    // показать всех студентов
    public void printAllStudents() {
        for (Student student : group) {
            System.out.println(student);
        }
    }
}
