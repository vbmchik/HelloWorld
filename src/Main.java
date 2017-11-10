import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr;

        int[][] triangle = new int[3][];

        triangle[0] = new int[3];
        triangle[1] = new int[32];
        triangle[2] = new int[13];

        System.out.println(triangle[1].length);
        arr = new int[]{1, 2, 3, 4, 5};


        int [][][][] superarray = new int[3][4][5][6];



        int[] array = {99, 5, 3, 2, 1, 7,4,2};
        int n = 2;
        //сдвиг влево
        //ShiftArray(array, 4);
        System.out.println(Arrays.toString(array));
        mover(array,3);
        System.out.println(Arrays.toString(array));

    }


    public static void mover( int[] array, int n){
        int a, b;

        int t = 0 ;

        a = array[0];
        int f = 0 ;
        for( int i = 0 ; i < array.length ; ++i) {

            t = ind(t, n, array.length);


            b = array[t];
            array[t] = a;
            a = b;
            printarray(array);
        }
    }
    public static int ind( int i, int n, int length )
    {
        if( n > 0 )
            return i + n < length ? i + n  : i + n - length;
        else
            return i + n >= 0 ? i + n  : length  + i + n  ;
    }

    public static void ShiftArray(int[] array, int n) {
        System.out.println("Задача №7:(масив-" + Arrays.toString(array));
        if (n > 0) {
            System.out.println("положительный счетчик (сдвиг вправо на " + n + ")");
            int temp = 0;
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < array.length; i++) {
                    temp = array[i];
                    array[i] = array[array.length - 1];
                    array[array.length - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("отрицательный счетчик(сдвиг влево на " + -n + ")");
            for (int j = 0; j < 2; j++) {
                int temp = array[0];
                for (int i = 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                }
                array[array.length - 1] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
    public static void changer(int t){
        t = t + 16;
    }

    public static void change(int[] array) {
        for( int i = 0 ; i < array.length ; ++i)
            array[i]+=3;
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();

    }

    public static void mult(int a, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j + 1 + " ");
            System.out.println();
        }


    }

    public static int calc(int x, int y, int switcher) {
        ;
        int out = -99999;
        switch (switcher) {
            case 0:
                out = x + y;
                break;
            case 1:
                out = x - y;
                break;
            case 2:
                out = x * y;
                break;
            case 3:
                System.out.println("jkshdghjkdsgfhjksf");
            case 4:
                out = x / y;
                break;
        }
        return out;
    }


}
