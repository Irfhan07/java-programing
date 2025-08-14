class grandfather{
       
       void cycle(){
           
           System.out.println("This is grandfather cycle");
       }
   }
  
  
  
  class father extends grandfather{
      
      void car(){
          
          System.out.println("this is father car");
      }
  }
  
  class son extends father{
      
      void bike(){
          
          System.out.println("this is son bike");
      }
  }
  
  
  public class Main{
  public static void main(String[] args){
      
      son A;
      A = new son();
      A.bike();
      A.car();
      A.cycle();
      
  }
  }
