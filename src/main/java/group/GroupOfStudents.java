package group;

import java.util.*;

public class GroupOfStudents {
    Scanner scanner = new Scanner(System.in);

    private List<Student> group = new ArrayList<Student>();

    public void addStudent() {
        System.out.println("How many students do you want to add?");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <count ; i++) {
            System.out.println("Enter: Name");
            String name = scanner.nextLine();


            System.out.println("Enter: Faculty");
            String faculty = scanner.nextLine();

            System.out.println("Enter: Average grade");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            group.add(new Student(name, faculty, grade));
        }


    }

    public void removeStudent() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
            }
        }
        System.out.println(name + " has been removed");
    }

    public void changeName() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();

        for (Student stud : group) {
            if (stud.getName().equals(name)) {
                stud.setName(newName);
            }
        }
        System.out.println("Name has been changed");
    }

    public void changeFaculty() {
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter new faculty");
        String faculty = scanner.nextLine();

        for (Student stud : group) {
            if (stud.getName().equals(name)) {
                stud.setFaculty(faculty);
            }
        }
        System.out.println("Faculty has been changed");

    }


    public void changeAverageGrade() {
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter new Average grade");
        double grade = Double.parseDouble(scanner.nextLine());

        for (Student stud : group) {
            if (stud.getName().equals(name)) {
                stud.setAverageGrade(grade);
            }
        }
        System.out.println("Faculty has been changed");
    }

    public void printAllStudents() {
        for (Student student : group) {
            System.out.println(student);
        }
    }
}
