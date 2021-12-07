import java.util.Scanner;
class Prac_2c {
    public static void main(String args[]){
        String orig="",rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        orig=sc.nextLine();
        int length=orig.length();
        for(int i=length-1; i>=0; i--){
            rev=rev+orig.charAt(i);
        }
        System.out.println("Reverse of the String is "+rev);
        sc.close();
    }
}
