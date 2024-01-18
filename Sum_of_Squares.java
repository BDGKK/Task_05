package Employee;

import java.util.Arrays;

public class Sum_of_Squares{

    public static void main(String[] args) {
        // Create a large array of numbers
        int[] numbers = new int[1000000];
        Arrays.fill(numbers, 2); // Filling the array with a constant value for simplicity

        // Sequential stream
        long startTimeSequential = System.currentTimeMillis();
        long sequentialResult = Arrays.stream(numbers)
                .mapToLong(num -> num * num)
                .sum();
        long endTimeSequential = System.currentTimeMillis();

        // Parallel stream
        long startTimeParallel = System.currentTimeMillis();
        long parallelResult = Arrays.stream(numbers).parallel()
                .mapToLong(num -> num * num)
                .sum();
        long endTimeParallel = System.currentTimeMillis();

        // Display results and performance comparison
        System.out.println("Sequential Result: " + sequentialResult);
        System.out.println("Parallel Result: " + parallelResult);

        System.out.println("Sequential Time: " + (endTimeSequential - startTimeSequential) + " ms");
        System.out.println("Parallel Time: " + (endTimeParallel - startTimeParallel) + " ms");
    }
}
