import java.util.ArrayList;
public class ArrayListNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);   
        numbers.add(42);   
        numbers.add(8); 
        numbers.add(99);   
        numbers.add(23); 

        boolean hasValue = numbers.contains(9);
        System.out.println("The maximum number in the ArrayList is: ");

        System.out.println("Iterating through the list:");
        for (Number values : numbers) {
            System.out.println(values + ", ");
        }

        numbers.clear();
        System.out.println("After clearing: " + numbers);
    }
}
