class Grandfather{
       
       void cycle(){
           
           System.out.println("This is grandfather cycle");
       }
   }
  
  
  
  class Father extends Grandfather{
      
      void car(){
          
          System.out.println("this is father car");
      }
  }
  
  class Son extends Grandfather{
      
      void bike(){
          
          System.out.println("this is son bike");
      }
  }
  
  
  public class Main{
  public static void main(String[] args){
      
      Son A;
      Father B;
      A = new Son();
      
      A.bike();
      A.cycle();
      
      
      B= new Father();
     
      
     
      B.car();
      B.cycle();
      
  }
  }
