

import java.util.Scanner;
public class bai1
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ten cua ban: ");
        String ten= sc.nextLine();
        System.out.println("Hello "+ten);
        sc.close();
    }
}