import java.util.Scanner;

public class Insert_Element {
    public static void main(String[] args) {
        int count, i, num, index;
        int input[] = new int[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        count = scanner.nextInt();


        // Take array input from user

        System.out.println("Enter " + count + " Numbers");
        for (i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println("Enter Number to be Inserted");
        num = scanner.nextInt();
        System.out.println("Enter Index of Insertion");
        index = scanner.nextInt();


         // Insert "num" at index. First shift all element right of index by one
        // position

        for (i = count; i > index; i--) {
            input[i] = input[i - 1];
        }
        // inserting num at position "index"
        input[index] = num;
        // increment size of array
        count++;

        System.out.println("Final Array");
        for (i = 0; i < count; i++) {
            System.out.print(input[i] + " ");
        }
    }
}