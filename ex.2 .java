import java.util.Scanner;
class main{
    public static void main(String[]args){
       
        Scanner data = new Scanner(System.in);
        double area;
       
        System.out.println("enter the choice");
        System.out.println("1.circle");
        System.out.println("2.rectangle");
        System.out.println("3.square");
        System.out.println("4.triangle");
        int choice = data.nextInt();
       
        switch(choice)
        {
            case 1:
                System.out.println("enter the area of the circle");
                double radius = data.nextDouble();
                area = 3.14 * radius * radius;
                System.out.println("area of the circle:" + area);
                break;
               
            case 2:
                System.out.println("enter the length");
                double lenght = data.nextDouble();
                System.out.println("enter the width");
                double width = data.nextDouble();
                area = lenght * width;
                System.out.println("area of the rectangle:" + area);
                break;
               
            case 3:
                System.out.println("enter the side");
                double side = data.nextDouble();
                area = side * 4;
                System.out.print("area of the square:" + area);
                break;
               
            case 4:
                System.out.println("enter the base");
                double base = data.nextDouble();
                System.out.println("enter the height");
                double height = data.nextDouble();
                area = (base * height) / 2;
                System.out.println("area of the triangle:" + area);
                break;
               
            default:
                System.out.println("invalid choice");
               
               
               
        }
       
    }
}
