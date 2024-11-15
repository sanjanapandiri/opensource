mport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        if(Z >= X + Y) {
            System.out.println(2);
        }else if (Z >= X) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
}
}
