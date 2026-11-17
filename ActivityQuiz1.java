import java.util.ArrayList;
public class ActivityQuiz1 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);   
        numbers.add(42);   
        numbers.add(8); 
        numbers.add(99);   
        numbers.add(23);

        System.out.println("Numbers in the list: " + numbers);


        int largest = numbers.get(0);
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The maximum number in the ArrayList is " + largest);



    
    }
}
