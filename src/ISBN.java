import java.util.Scanner;


public class ISBN {
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int copyNum = num;
        int totalNum = 0;
        int quotient = 100_000_000;
        int check = copyNum / quotient;
        for (int i = 0; i < 9; i++){
            int d = num / quotient;
            totalNum += d * (i+1);
            num -= d * quotient;
            quotient /= 10;
        }
        int finalNum = totalNum % 11;
        if (check == 0){
            if (finalNum == 10){
                System.out.print("The ISBN-10 number is: " + "0" + copyNum + "X");
            }else{
                System.out.print("The ISBN-10 number is: " + "0" + copyNum + finalNum);
            }
        } else if (finalNum == 10) {
            System.out.print("The ISBN-10 number is: " + copyNum + "X");
        }else {
            System.out.print("The ISBN-10 number is: " + copyNum + finalNum);
        }
    }
}