import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String[] args) {
//        #1 arrays
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        char[] arr = new char[n];
//        for (int i=0; i<n; i++) {
//            arr[i] = sc.next().charAt(0); // to take a character variable as input
//        }
//        for (int i=0; i<n; i++) {
//            System.out.println(arr[i]);
//        }
//
//        #2 Boolean comparison
//        int x = 3;
//        int y = 4;
//        int z = 5;
//        boolean compare = x>y || z<y;
//        System.out.println(compare);
//
//        #3 if else
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        if (s.equals("tim")) { // or (s=="tim")
//            System.out.println("You typed tim");
//        }
//        else {
//            System.out.println("You didn't type tim");
//        }
//
//        #4 lists
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Vinegar");

        for (String shopping:list) {
            System.out.println(shopping);
        }
        for (String shopping:list) {
            System.out.println(shopping);
        }

    }
}