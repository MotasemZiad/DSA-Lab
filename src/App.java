
public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayOfNumbers = { 25, 12, 7, 98, 52, 36, 83, 71, 1, 2, 3, 4, 5 };

        System.out.println("The sum of the array is: " + getSum(arrayOfNumbers));
        System.out.println("The average of the array is: " + getAverage(arrayOfNumbers));
        System.out.println("The second largest number is: " + getSecondLargest(arrayOfNumbers));
        System.out.println("The second smallest number is: " + getSecondSmallest(arrayOfNumbers));

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getAverage(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int getSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}
