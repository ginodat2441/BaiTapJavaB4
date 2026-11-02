import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so nhan vien n: ");
            n = Integer.parseInt(sc.nextLine().trim());
        } while (n <= 0);

        Nhanvien[] ds = new Nhanvien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhan vien thu " + (i + 1) + " ---");
            ds[i] = new Nhanvien();
            ds[i].nhap(sc);
        }

        // Tim nhan vien co so nam cong tac nhieu nhat
        int maxSnct = ds[0].getSnct();
        for (Nhanvien nv : ds) {
            if (nv.getSnct() > maxSnct) {
                maxSnct = nv.getSnct();
            }
        }
        System.out.println("\nNhan vien co so nam cong tac nhieu nhat (" + maxSnct + " nam):");
        for (Nhanvien nv : ds) {
            if (nv.getSnct() == maxSnct) {
                nv.xuat();
            }
        }

        // In danh sach theo luong tu cao den thap
        Arrays.sort(ds, Comparator.comparingDouble(Nhanvien::tinhTienLuong).reversed());
        System.out.println("\nDanh sach nhan vien theo luong giam dan:");
        for (Nhanvien nv : ds) {
            nv.xuat();
        }

        sc.close();
    }
}
