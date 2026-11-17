import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("Juan");   
        student.add("Pedro");   
        student.add("Berting"); 

        // Display the ArrayList
        System.out.println("List of Students: " + student);

        // Accessing elements from the ArrayList
        System.out.println("Student at index 2: " + student.get(2));

        // Delete an element by index
        student.remove(1);  
        // Display the ArrayList after removal
        System.out.println("After deletion: " + student);

        // Update an element
        student.set(1, "Ronnie"); 
        // Display the updated list
        System.out.println("After update: " + student);

        // Get the size of the ArrayList
        System.out.println("ArrayList size: " + student.size());

        // Check if the ArrayList contains a specific number
        boolean hasName = student.contains("Ronnie");
        System.out.println("Has name Ronnie? " + hasName);

        // Iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for (String name : student) {
            System.out.println(name);
        }

        // Empty the ArrayList
        student.clear();
        System.out.println("After clearing: " + student);
    }
}
