package Basic.Loops;

public class forloop {
    public static void main(String[] args) {
        int x = 4;
        for(int i = 0; i<x; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-------------For Each Loop------------");
        int y[] = {8,10,20,30};
        for (int in : y) {
            System.out.print(in+" ");
        }
    }
    
}

// run command -- java .\forloop.java