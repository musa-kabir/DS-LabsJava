import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("This program multiplies two integer arrays to make a new array");
        //Change number of elements in each array; a, b and c
        int n = 5;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        //Create a random generator to use in generating a different number for each element in a and b
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            b[i] = random.nextInt(100);
        }
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        //multiply a and b to make a new array c
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println("Array c: " + Arrays.toString(c));
    }
}

