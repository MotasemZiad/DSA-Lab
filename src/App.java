public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Data Structure and Algorithms");

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
