import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	static Scanner sc;
	static int n;
	private static final String PATH = "D:/DATA.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Kysu> list = new ArrayList<>();
		Nhap(list);

		// chay truoc
		boolean kiemtra = ReadWriteFile.ghiFile(list, PATH);
		if (kiemtra) {
			System.out.println("Ghi Thanh Cong");
		} else {
			System.out.println("That Bai");
		}

		// chay sau
		// List<Kysu> ls = ReadWriteFile.docFile(PATH);

		// for (Kysu ks : ls) {
		// System.out.println(ks);
		// }

	}

	public static void Nhap(List<Kysu> List) {
		sc = new Scanner(System.in);

		System.out.println("Nhap n ky su :");
		n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {

			Kysu ks = new Kysu();
			ks.Nhap();

			List.add(ks);

		}
	}
}
