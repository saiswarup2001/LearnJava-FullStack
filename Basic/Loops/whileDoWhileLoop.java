package Basic.Loops;

class whileDoWhileLoop {
    public static void main(String[] args) {
        int x = 0;
        do{
            System.out.print(x+" ");
            x++;
        }while(x<=4);


        System.out.println();
        System.out.println("----While Loop----");
        int y = 1;
        while (y<=10) {
            System.out.print(y+" ");
            ++y;
        }
    }
}