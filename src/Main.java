import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//, 11, 12, 13};//, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int n = 5;

        System.out.println(Arrays.toString(array));
        mover(array, n);
        System.out.println(Arrays.toString(array));

        shortage();
        //ShiftArray2(array1,n);

    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void mover(int[] array, int n) {
        int a, b;
        int t = 0;
        boolean symmetry = false;
        int m = Math.abs(array.length / n);

        /*if ((array.length % n) == 0) symmetry = true;
        else */
        if (gcd(array.length, n) != 0) {
            symmetry = true;
            m = array.length / gcd(array.length, n);
        }

        if (array.length < n) n = array.length % n;

        a = array[0];

        for (int i = 0; i < array.length; ++i) {

            t = ind(t, n, array.length);
            b = array[t];
            array[t] = a;
            // Учесть вариант как 6 и 4
            if (symmetry && (i+1) % m == 0 && i != 0 ) {
                if( i == array.length - 1 )
                    array[ind(t,n,array.length)] = b;
                else
                    b = array[t < array.length - 1 ? t + 1 : 0];
                t = t  + 1 ;
            }

            a = b;
            //System.out.println(Arrays.toString(array));
        }
    }



    public static int ind(int i, int n, int length) {
        if (n > 0)
            return i + n < length ? i + n : i + n - length ;
        else
            return i + n >= 0 ? i + n : length + i + n;
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();

    }


    // Famouse Rudenko condition

    public static void ShiftArray2(int[] array, int n) {
        System.out.println("Задача №7 одним циклом:(масив-" + Arrays.toString(array) + ": ");

        int temp = 0;
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            array[i] = array[array.length - 1];
            array[array.length - 1] = temp;
            if (i == array.length - 1 && j < n) {
                j = j + 1;
                i = -1;
                temp = 0;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array, int n, int k) {
        int temp = 0;
        int j = k;
        for (int i = n; i < j; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int n) {
        reverse(array, 0, n);
        reverse(array, n + 1, array.length - 1);
        reverse(array, 0, array.length - 1);
    }

    public static void shortage() {
        // write your code here
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 34, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        sort(array, 2);
    }
}
