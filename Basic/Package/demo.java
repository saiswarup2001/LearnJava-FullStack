import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter x and y");
        try (Scanner sc = new Scanner(System.in)) {
            x = sc.nextInt();
            y = sc.nextInt();
        }
        int z = sum(x,y);
        System.out.println("Sum is: "+ z);
    }

    public static int sum(int x, int y){
        return x+y;
    }
}
