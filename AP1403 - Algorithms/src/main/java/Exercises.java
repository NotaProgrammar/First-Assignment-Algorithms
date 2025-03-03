public class Exercises {

    /*
        there is an array of positive integers as input of function and another integer for the target value
        all the algorithm should do is to find those two integers in array which their multiplication is the target
        then it should return an array of their indices
        e.g. {1, 2, 3, 4} with target of 8 -> {1, 3}

        note: you should return the indices in ascending order and every array's solution is unique
    */
    public int[] productIndices(int[] values, int target) {
        int[] result = new int[2];
        for (int i = 0, j = 0; i < values.length; i++) {
            for (int k = i + 1; k < values.length; k++) {
                if (values[i] * values[k] == target) {
                    result[0] = i;
                    result[1] = k;
                }
            }
        }
        return result;
    }

    /*
        given a matrix of random integers, you should do spiral traversal in it
        e.g. if the matrix is as shown below:
        1 2 3
        4 5 6
        7 8 9
        then the spiral traversal of that is:
        {1, 2, 3, 6, 9, 8, 7, 4, 5}

        so you should walk in that matrix in a curl and then add the numbers in order you've seen them in a 1D array
    */
    public int[] spiralTraversal(int[][] values, int rows, int cols) {
        int[] result = new int[rows * cols];
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1,counter = 0;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result[counter++] = values[top][i];
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result[counter++] = values[i][right];
            }
            right--;

            // Traverse from right to left along the bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[counter++] = values[bottom][i];
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[counter++] = values[i][left];
                }
                left++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }

    /*
        integer partitioning is a combinatorics problem in discreet maths
        the problem is to generate sum numbers which their summation is the input number

        e.g. 1 -> all partitions of integer 3 are:
        3
        2, 1
        1, 1, 1

        e.g. 2 -> for number 4 goes as:
        4
        3, 1
        2, 2
        2, 1, 1
        1, 1, 1, 1

        note: as you can see in examples, we want to generate distinct summations, which means 1, 2 and 2, 1 are no different
        you should generate all partitions of the input number and

        hint: you can measure the size and order of arrays by finding the pattern of partitions and their number
        trust me, that one's fun and easy :)

        if you're familiar with lists and arraylists, you can also edit method's body to use them instead of array
    */
    public int[][] intPartitions(int n) {
        // todo
        return null;
    }

    public static void main(String[] args) {
    }
}
