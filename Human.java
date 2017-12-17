package shaffel1;

import java.util.Scanner;

public class Human extends Player {
    public int number(){
        System.out.println("Drop a black disk at column (1–7): ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt()-1;
        return i;
    }
}
