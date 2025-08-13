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
        
        String S10=name.copyValueOf(data1,0,5);
        System.out.println(S10);
        
       boolean S11=name.endsWith("O");
       System.out.println(S11);

         String str="Abdul";
        
        String hi="hi %s my age %d";
        
        System.out.println(str.equalsIgnoreCase("hello"));
        System.out.print(String.format(hi,name,N2));

         String name="abdul world";
        String S1=name.toUpperCase();
        System.out.println(S1);
        
        System.out.println(name.indexOf("world"));
        
         String name="abdul";
        
        byte[]arr=name.getBytes();
        
        System.out.println(arr[0]);
        
        System.out.println(name.hashCode());
        
        char[] data ={'1','2','3','4','5','2','3','3','7'};
        
        
        System.out.println(data);
        
        String S1="Abdul";
        S1.getChars(0,5,data,4);
        System.out.println(data);

        boolean A1=name.isEmpty();
        System.out.println(A1);

          
        String name=String.join(" ","ABDUL", "IRFHAN");
        System.out.println(name);
        
        System.out.println(name.lastIndexOf("irfhan"));

          Scanner data=new Scanner(System.in);
        System.out.println("Enter your value:");
        String D1=data.nextLine();
    
      String a="hello world";
      
    String y="[,// .//s]";
    System.out.println(D1.replace("a","s"));
    System.out.println(D1.replaceAll("hello","hi"));
    String[]z=D1.split(y);
    
    for(String s:z){
        
        System.out.println(s);

        String a="hello world";
      
   
    System.out.println(a.startsWith("hello world"));
    System.out.println(a.startsWith("hello"));

           Scanner a=new Scanner(System.in);
        
        System.out.println("Enter your name:");
        
        
        String s=a.nextLine();
     
     String s2=" Abdul irfhan";
     
     char[]y=s.toCharArray();
     
     for(char s1:y){
          System.out.println(s1);
     }
    
     
     System.out.println(s.toUpperCase());
     
     System.out.println(s.toLowerCase());
     
     System.out.println(s.toString());
     
     System.out.println(s2.trim());
     
    String s2=" Abdul irfhan";
     
     int a=67;
     
     System.out.println(String.valueOf(s2));
     
     System.out.println(a.typeOf());
     
     
        
      
      
        
        
        
        
        
        
        
    }
}
