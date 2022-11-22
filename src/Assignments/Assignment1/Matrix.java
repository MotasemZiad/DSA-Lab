package Assignments.Assignment1;

import java.util.Arrays;

public class Matrix<T> {
    private T[][] matrix;

    public Matrix(int length) {
        matrix = (T[][]) new Object[length][length];
    }

    public void add(Index index, T value) {
        matrix[index.row][index.column] = value;
    }

    public T[] getRow(int row) {
        return matrix[row];
    }

    public T[] getColumn(int column) {
        T[] columnArray = (T[]) new Object[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            columnArray[i] = matrix[i][column];
        }
        return columnArray;
    }

    public T[] getRightDiagonal() {
        T[] rightDiagonal = (T[]) new Object[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            rightDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return rightDiagonal;
    }

    public T[] getLeftDiagonal() {
        T[] leftDiagonal = (T[]) new Object[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            leftDiagonal[i] = matrix[i][i];
        }
        return leftDiagonal;
    }

    public int length() {
        return matrix.length;
    }

    @Override
    public String toString() {
        return "Matrix [matrix=" + Arrays.toString(matrix) + "]";
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static class Index {
        private int row;
        private int column;

        public Index(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        @Override
        public String toString() {
            return "Index [row=" + row + ", column=" + column + "]";
        }

    }

}