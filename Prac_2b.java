import java.util.Scanner;
class Prac_2a{
    public static void main(String args[]){
        String num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Binary number");
        num1=sc.nextLine();
        System.out.println("Binary to Decimal "+Integer.parseInt(num1,2));
        
        System.out.println("Enter a decimal number ");
        num2=sc.nextInt();
        System.out.println("Decimal to Binary "+Integer.toBinaryString(num2));
        sc.close();
    }
}