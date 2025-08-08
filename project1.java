import java.util.Scanner;

class Main {
     
           static int Add(int A,int B){
                
                return A+B;
                }
        
       
           static int Sub(int A,int B){
               
               return A-B;
       }
        
       
           static int Mult(int A,int B){
               
               return A*B;
       }
       
       
        public static void main(String[] args) {
          
           Scanner data = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = data.nextInt();
        
        
        System.out.println("Enter the number1 ");
        int A= data.nextInt();
        
        System.out.println("Enter your number2");
        int B=data.nextInt();
        
        

          switch(n){
          
            case 1:
                
               A=Add(A,B);
               
               System.out.println(A);
               
               
            case 2:
               System.out.println(Sub(A,B));
              
            case 3:
                
               System.out.println( Mult(A,B));
              
          }  
            
         
        
       
    }
}
