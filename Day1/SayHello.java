import java.io.*;
public class SayHello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        System.out.println("1 Hello");
        System.out.println(name);
        
        
        System.out.print("2 Hello ");
        System.out.println(name);
        
        
        System.out.println("3 Hello " + name);
        
        
        
        
    }
}
