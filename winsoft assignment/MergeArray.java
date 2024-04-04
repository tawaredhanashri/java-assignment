import java.util.Arrays;

class MergeArray {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = m - n - 1;
        int j = n - 1;
        
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[i + j + 1] = X[i];
                i--;
            } else {
                X[i + j + 1] = Y[j];
                j--;
            }
        }
        
        while (j >= 0) {
            X[j] = Y[j];
            j--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        System.out.println("Input X[]: " + Arrays.toString(X));
        System.out.println("Input Y[]: " + Arrays.toString(Y));
        
        mergeArrays(X, Y);
        
        System.out.println("Merged X[]: " + Arrays.toString(X));
    }
}
