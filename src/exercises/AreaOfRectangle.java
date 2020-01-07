package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length:");
        int length = input.nextInt();
        System.out.println("Input width:");
        int width = input.nextInt();
        int area = length*width;
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);

    }
}
