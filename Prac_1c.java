import java.util.Scanner;
class Prac_1c {
    public static void main(String[] args) {
        System.out.println("Enter the radius :");
        Scanner sc=new Scanner(System.in);
        float radius= sc.nextFloat();

        float area = 3.14f*radius*radius;
        float perimeter = 2*3.14f*radius;

        System.out.println("Area of circle="+area);
        System.out.println("Perimeter of circle="+perimeter);
        sc.close();
    }
}
