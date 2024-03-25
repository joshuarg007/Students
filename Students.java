import java.util.ArrayList;

public class Students {
    public static void main(String[] args) {
        // Create two ArrayLists of Student objects
        ArrayList<Student> studentsByName = new ArrayList<>();
        studentsByName.add(new Student("Joshua", 1, "3456 Maple St"));
        studentsByName.add(new Student( "Crystal", 2, "1234 Park St"));
        studentsByName.add(new Student( "Matthias", 3, "2345 Oak St"));
        studentsByName.add(new Student("Serafina", 4, "3456 Maple St"));
        studentsByName.add(new Student( "Solomon", 5, "1234 Park St"));
        studentsByName.add(new Student( "Kryptonite", 6, "2345 Oak St"));

        ArrayList<Student> studentsByRollNo = new ArrayList<>();
        studentsByRollNo.add(new Student("Joshua", 5, "3456 Maple St"));
        studentsByRollNo.add(new Student( "Crystal", 2, "1234 Park St"));
        studentsByRollNo.add(new Student( "Matthias", 6, "2345 Oak St"));
        studentsByRollNo.add(new Student("Serafina", 4, "3456 Maple St"));
        studentsByRollNo.add(new Student( "Solomon", 1, "1234 Park St"));
        studentsByRollNo.add(new Student( "Kryptonite", 3, "2345 Oak St"));


        // Sort students by name using NameSort class
        NameSort.sortStudentsByName(studentsByName);

        // Print sorted list by name
        System.out.println("Sorted by Name:");
        for (Student student : studentsByName) {
            System.out.println(student);
        }

        System.out.println();  // Empty line for separation

        // Sort students by roll number using RollNumberSort class
        RollNumberSort.sortStudentsByRollNo(studentsByRollNo);

        // Print sorted list by roll number
        System.out.println("Sorted by Roll Number:");
        for (Student student : studentsByRollNo) {
            System.out.println(student);
        }
    }
}
