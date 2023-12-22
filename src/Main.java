import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row, col;
             System.out.print("Mayin Tarlasina hosgeldiniz......");
        System.out.println("Oynamak istedigniz boyutlari giriniz: ");
        System.out.print("Satir sayisi: ");
        row=sc.nextInt();
        System.out.print("Sutun sayisi: ");
        col=sc.nextInt();
        MayinTarlasi mayin = new MayinTarlasi(row,col);
        mayin.run();

    }
}
