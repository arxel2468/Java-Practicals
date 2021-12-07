import java.util.Scanner;

class Prac_3a {
    public static void main(String[] args) {
        int alpha = 0, num = 0, sp = 0, sym = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();

        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(ch[i]))
                alpha++;
            else if (Character.isDigit(ch[i]))
                num++;
            else if (Character.isSpaceChar(ch[i]))
                sp++;
            else
                sym++;
        }
        System.out.println("Number of Alphabets=" + alpha);
        System.out.println("Number of Numbers=" + num);
        System.out.println("Number of Spaces=" + sp);
        System.out.println("Number of Symbol=" + sym);
        sc.close();
    }
}