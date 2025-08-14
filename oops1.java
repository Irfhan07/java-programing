class Cars{
    void sound(){
        System.out.println("Cars make a sound");
    }
}

class BMW extends Cars{
    void sound(){
        System.out.println("BMW");
    }
}

class Audi extends Cars{
    void sound(){
     System.out.println("Audi");
     
    }
}

class Benz extends Cars{
    void sound(){
     System.out.println("Benz");
     
    }
}

public class Main{
    public static void main(String[] args){
        Cars a;
        
        
        a = new BMW();
        a.sound();


      
  import java.util.Scanner;

class Family{
    void sound(){
        System.out.println("Family make a sound");
    }
}

class Grandfather extends Family{
    void sound(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Grandfather");
        String x =  sc.nextLine();
        System.out.println(x);
    }
}

class Grandmother extends Family{
    void sound(){
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the Grandmother");
        String y =  sc.nextLine();
        System.out.println(y);
     
    }
}

class Father extends Family{
    void sound(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Father");
        String z =  sc.nextLine();
        System.out.println(z);
        
    
     
    }
}

public class Main{
    public static void main(String[] args){
        Family a;
        
        
        a = new Grandfather();
        a.sound();
        
      
        a = new Grandmother();
        a.sound();
        
       
        a = new Father();
        a.sound();
    }
}
        
      
        a = new Audi();
        a.sound();
        
       
        a = new Benz();
        a.sound();
    }
}
