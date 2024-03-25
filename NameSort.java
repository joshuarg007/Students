import java.util.ArrayList;

public class NameSort {
    
     public static void sortStudentsByName(ArrayList<Student> students) {

        int length = students.size(); // length of Students ArrayList

        // Traverse each element of the array
        for (int i = 0; i < length - 1; i++) {

            int minIndex = i; // Stores location of lowest value

            for (int j = i + 1; j < length; j++) {

                // if jth student goes before element ad minIndex
                if (students.get(j).getName().compareTo(students.get(minIndex).getName()) < 0) {

                    minIndex = j; // set jth element as lowest
                }
            }

            // Temporarily store the minimum element before swapping.
            Student temp = students.get(minIndex);

            // Move the element at 'i' (start of unsorted segment) to 'minIndex' position.
            students.set(minIndex, students.get(i));

            // Place the originally found minimum element at the start of the unsorted segment.
            students.set(i, temp);

        }
    }
    
}
