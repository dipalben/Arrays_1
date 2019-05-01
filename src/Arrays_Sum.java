

public class Arrays_Sum {
    public static void main(String args[]) {

            int[] array = {40, 20, 30};
            int sum = 0;
            //Advanced for loop
            for (int num : array) {
                sum = sum + num;
            }
            System.out.println("Sum of array elements is:" + sum);
        }
    }

