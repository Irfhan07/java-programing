class Main {
    public static void main(String[] args) {
       
       int [] arr={1,2,3,4};
       int [] arr1={6,7,8,9};
       int [] sub=new int[arr.length+arr1.length];
        
       
       for(int i=0;i<arr.length;i++){
           
           sub[i]=arr[i];
            }
       
           
       for(int j=0;j<arr1.length;j++){
           
           sub[arr.length+j]=arr1[j];
           
       }
             
             for(int x:sub){
                
                System.out.println(x);
            
           
    }
    }
