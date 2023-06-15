// Write a program to print the Multiplication Table using for loop.

import java.util.Scanner;

class Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value to generate the multiplication table: ");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(a + " x " + i + " = " + (a * i));
        }

        System.out.println("\nBurhan Iqbal | CSE-20-06");

        sc.close();
    }
}