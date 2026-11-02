import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int tuoi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine().trim());
    }

    public void xuat() {
        System.out.printf("Ho ten: %-20s Tuoi: %d", hoTen, tuoi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }
}
