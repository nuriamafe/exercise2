import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /****** Exercise 1 ******/
        /*int[] input = {5, 4, 3, 2, 1};
        System.out.println("input: " + Arrays.toString(input));
        int result;
        int first = input[0];

        for (int i = 0; i < input.length; i++) {
            if (i + 1 < input.length) {
                result = input[i] * input[i + 1];
            } else {
                result = input[i] * first;
            }
            input[i] = result;
        }
        String output = Arrays.toString(input);
        System.out.println("output: " + output);*/

        /****** Solution ******/
        /*int[] numbers = {5, 4, 3, 2, 1};
        System.out.println("input: " + Arrays.toString(numbers));

        int lastPosition = numbers[numbers.length - 1] * numbers[0];

        for(int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i] * numbers[i + 1];
        }

        numbers[numbers.length - 1] = lastPosition;
        System.out.println("output: " + Arrays.toString(numbers));*/

        /****** Exercise 2 ******/
        /*int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = new int[input.length];
        int j = 0;
        System.out.println("input: " + Arrays.toString(input));
        for (int i = input.length - 1; i >= 0; i--) {
            output[j] = input[i];
            j++;
        }
        System.out.println("ouput: " + Arrays.toString(output));*/

        /****** Solution ******/
        int[] numbers = {5, 4, 3, 2, 1};
        int[] invertedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int index = numbers.length - 1;
            invertedArray[i] = numbers[index - i];
        }

        for (int number: invertedArray) {
            System.out.println(number);
        }
    }
}
