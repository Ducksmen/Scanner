package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + ".");
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Oh you are " + age + " years old, that's nice.");
        input.close();
    }
}
