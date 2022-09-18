import static java.lang.Math.*;


public class Lab1 {

    public static void main(String[] args) {
        Lab1 lab = new Lab1();
        int[] a = new int[7];
        float[] x = new float[13];
        double[][] arr = new double[7][13];

        for (int i = 6; i <= 18; i = i + 2) {
            a[(i - 6) / 2] = i;
        }

        for (int i = 0; i < 13; i++) {
            x[i] = (float)(random() * (15 - (-2)) + (-2));
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                if (a[i] == 16) {
                    arr[i][j] = log(pow(tan(cos(pow(x[j], 1.0 / 3.0))), 2));
                } else if (a[i] == 8 || a[i] == 12 || a[i] == 14) {
                    arr[i][j] = pow(2.0 * pow(2.0 / (pow(x[j] * (4.0 + x[j]), 3) - 4.0), 2), 2);
                } else {
                    arr[i][j] = pow(pow(tan(pow(E, x[j])) / (1.0 - cos(pow(x[j], PI / (x[j] - 1.0)))), 2), 1.0 / 3.0);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.2f\t", arr[i][j]);
            }
            System.out.println();
        }
    }
}
