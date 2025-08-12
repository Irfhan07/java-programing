import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        
        Scanner data=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=data.nextLine();
        
        char S1 = name.charAt(0);
        System.out.println(S1);
        
        int S2=name.codePointAt(0);
        System.out.println(S2);
        
        int S3=name.codePointBefore(1);
        System.out.println(S3);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
