
public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayOfNumbers = { 25, 12, 7, 98, 52, 36, 83, 71, 1, 2, 3, 4, 5 };

        System.out.println("The sum of the array is: " + getSum(arrayOfNumbers));
        System.out.println("The average of the array is: " + getAverage(arrayOfNumbers));
        System.out.println("The second largest number is: " + getSecondLargest(arrayOfNumbers));
        System.out.println("The second smallest number is: " + getSecondSmallest(arrayOfNumbers));

        int[][] matrix2D = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        System.out.println("The Left Diagonal of the matrix is: ");
        printLeftDiagonal(matrix2D);
        System.out.println("The Right Diagonal of the matrix is: ");
        printRightDiagonal(matrix2D);

        System.out.println("The difference between the sum of the left diagonal and the right diagonal is: "
                + getDiagonalDifference(matrix2D));

    }

    public static void printLeftDiagonal(int[][] matrix2D) {
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix2D[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void printRightDiagonal(int[][] matrix2D) {
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                if (i + j == matrix2D.length - 1) {
                    System.out.print(matrix2D[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // This method returns the difference between the left and the right diagonals
    // of a given matrix
    public static int getDiagonalDifference(int[][] matrix2D) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                if (i == j) {
                    leftDiagonal += matrix2D[i][j];
                }
                if (i + j == matrix2D.length - 1) {
                    rightDiagonal += matrix2D[i][j];
                }
            }
        }

        return Math.abs(leftDiagonal - rightDiagonal);
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
