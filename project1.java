import java.util.Scanner;

class Main {
     
           static double Add(double A,double B){
                
                return A+B;
                }
           static double Sub(double A,double B){
               
               return A-B;
           }
           static double Mult(double A,double B){
               
               return A*B;
       }
        public static void main(String[] args) {
            
            System.out.println("1.add");
            System.out.println("2.sub");
            System.out.println("3.Mult");
           Scanner data = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = data.nextInt();
        
        
        System.out.println("Enter the num1 ");
       double A= data.nextInt();
        
        System.out.println("Enter your num2");
        double B=data.nextInt();
        
        

          switch(n){
          
            case 1:
                
             double r=Add(A,B);
              System.out.println(r);
              break;
                
            case 2:
               
               System.out.println(Sub(A,B));
               break;
            case 3:
                
               System.out.println(Mult(A,B));
              break;
          }  
            
         
        
       
    }
}
