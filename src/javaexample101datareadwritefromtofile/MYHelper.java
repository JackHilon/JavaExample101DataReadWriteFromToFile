package javaexample101datareadwritefromtofile;

public class MYHelper {

    public static boolean IsNumber(String str) {

        double d = 0;

        try {
            d = Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean IsPureText(String str) {

        return !IsNumber(str);
    }

    public static double DoubleArraySum(double[] array) {

        double d = 0;

        try {
            for (int i = 0; i < array.length; i++) {
                d = d + array[i];
            }

            return d;
        } catch (Exception e) {
            return 0;
        }
    }

}