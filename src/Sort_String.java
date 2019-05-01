import java.util.Arrays;

public class Sort_String {
    public static void main(String[] args)
    {
        // create a Java String array
        String[] fruits = {"banana", "orange", "kiwi", "apple"};

        // sort the array, using the sort method of the Arrays class
        Arrays.sort(fruits);

        // print the sorted results
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}

