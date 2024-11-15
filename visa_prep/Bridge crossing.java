import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        if (Y >= Z) {
            System.out.println(0);
        }else {
            int remainingCapacity = Z - Y;
            int maxMangoes = remainingCapacity / X;
            System.out.println(maxMangoes);
            
        }
    }
}
