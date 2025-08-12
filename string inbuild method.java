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

        int S4=name.codePointCount(0,5);
        System.out.println(S4);
        
        int S5=name.compareTo(N2);
        System.out.println(S5);
        
        int  S6= name.compareToIgnoreCase(N2);
        System.out.println(S6);
        
        String S7=name.concat(N2);
        System.out.println(S7);
        
        boolean S8=name.contains(N2);
        System.out.println(S8);
      
        boolean S9=name.contentEquals(N2);
        System.out.println(S9);
        
        
        
        
        
        
        
        
        
        
    }
}
