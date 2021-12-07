import java.util.Scanner;
class Prac_1a{
    public static void main(String args[]){
        System.out.println("Enter a number :");
        
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Multiplication Table is ");
        for(int i=1; i<=10; i++){
            int prod = num*i;
            System.out.println(num+"*"+i+"="+prod);
            sc.close();
        }
    }
}