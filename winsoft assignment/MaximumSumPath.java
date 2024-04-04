import java.util.ArrayList;
import java.util.List;

public class MaximumSumPath {
    
    public static int[] maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int i = 0, j = 0;
        int sumX = 0, sumY = 0;
        int result = 0;
        
        List<Integer> path = new ArrayList<>();
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                path.add(X[i]);
                i++;
            } else if (X[i] > Y[j]) {
                sumY += Y[j];
                path.add(Y[j]);
                j++;
            } else {
                result += Math.max(sumX, sumY) + X[i];
                path.add(X[i]);
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        
        while (i < m) {
            sumX += X[i];
            path.add(X[i]);
            i++;
        }
        
        while (j < n) {
            sumY += Y[j];
            path.add(Y[j]);
            j++;
        }
        
        result += Math.max(sumX, sumY);
        
        int[] resultArray = new int[path.size()];
        for (int k = 0; k < path.size(); k++) {
            resultArray[k] = path.get(k);
        }
        
        return resultArray;
    }

    public static void main(String[] args) {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        
        int[] maxSumPath = maxSumPath(X, Y);
        int maxSum = 0;
        for (int num : maxSumPath) {
            System.out.print(num + " -> ");
            maxSum += num;
        }
        System.out.println("\nThe maximum sum is: " + maxSum);
    }
}
