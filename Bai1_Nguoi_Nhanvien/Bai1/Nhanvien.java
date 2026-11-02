import java.util.Scanner;

public class Nhanvien extends Nguoi {
    private static final double LCB = 1.5;           // luong co ban: 1.5 trieu
    private static final double HE_SO_PHU_CAP = 0.2; // 0.2 trieu / nam cong tac

    private int snct;   // so nam cong tac
    private double hsl; // he so luong

    public Nhanvien() {
        super();
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine().trim());
    }

    // tienluong = lcb * hsl + phucap, phucap = 0.2 * snct (don vi: trieu)
    public double tinhTienLuong() {
        double phucap = HE_SO_PHU_CAP * snct;
        return LCB * hsl + phucap;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" SNCT: %-3d HSL: %-5.2f Luong: %.2f trieu%n",
                snct, hsl, tinhTienLuong());
    }

    public int getSnct() {
        return snct;
    }

    public double getHsl() {
        return hsl;
    }
}
