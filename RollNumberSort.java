import java.util.ArrayList;

public class RollNumberSort {
    
     // Method to sort students by their roll numbers using Selection Sort algorithm
    public static void sortStudentsByRollNo(ArrayList<Student> students) {
        // Get the size of the students list
        int length = students.size();

        // Loop over each element in the list except the last one
        for (int i = 0; i < length - 1; i++) {
            // Assume the first unsorted element has the minimum roll number
            int minIndex = i;
            // Compare the assumed minimum with the rest of the elements
            for (int j = i + 1; j < length; j++) {
                // If a smaller roll number is found, update minIdx with the index of the new minimum
                if (students.get(j).getRollNo() < students.get(minIndex).getRollNo()) {
                    minIndex = j;
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
