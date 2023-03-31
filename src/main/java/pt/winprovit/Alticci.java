package pt.winprovit;

public class Alticci {
    public static int a(int n) {
        if(n == 0) {
            return 0;
        } else if(n <= 2)  {
            return 1;
        }
        else {
            return a(n -3) + a(n - 2);
        }
    }
}