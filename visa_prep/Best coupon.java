import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double discount10 = X - (X * 0.10);
        int discount100 = X - 100;
        double finalAmount = Math.min(discount10, discount100);
        System.out.println((int)finalAmount);
    }
}
