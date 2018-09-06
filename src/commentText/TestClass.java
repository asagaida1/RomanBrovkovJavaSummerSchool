package commentText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        psvm
        System.out.println("Hello Word!");
//        sout
//        System.out.println("\"\"\"\\\\\\\\\\");
//        System.out.println("abc"+"def"+"ghj"+5+5+5+5);
//        System.out.println("abc"+"def"+"ghj"+(5+5+5+5));
//
//        int a = System.in.read();
//        System.out.println(a);
//
//        int b = System.in.read();
//        System.out.println(b);

        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        System.out.println(c);

        BufferedReader bafin = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(bafin.readLine());
        System.out.println(d);




    }
}
