import java.util.Scanner;

public class Kysu extends Person implements Comparable<Kysu> {
	private String ngayHoc;
	private int namTotNghiep;

	public String getNgayHoc() {
		return ngayHoc;
	}

	public void setNgayHoc(String ngayHoc) {
		this.ngayHoc = ngayHoc;
	}

	public int getNamTotNghiep() {
		return namTotNghiep;
	}

	public void setNamTotNghiep(int namTotNghiep) {
		this.namTotNghiep = namTotNghiep;
	}

	/**
	 * @param hoTen
	 * @param ngaySinh
	 * @param queQuan
	 * @param ngayHoc
	 * @param namTotNghiep
	 */
	public Kysu(String hoTen, String ngaySinh, String queQuan, String ngayHoc, int namTotNghiep) {
		super(hoTen, ngaySinh, queQuan);
		this.ngayHoc = ngayHoc;
		this.namTotNghiep = namTotNghiep;
	}

	@Override
	public String toString() {
		return "Ho ten : " + this.getHoTen() + "\t" + "Ngay Sinh : " + this.getNgaySinh() + "\t" + "Que Quan : "
				+ this.getQueQuan() + "\t" + "Ngay Hoc : " + this.getNgayHoc() + "\t" + "Nam Tot Nghiep : "
				+ this.getNamTotNghiep() + "\t";

	}

	/**
	 * 
	 */
	public Kysu() {
		super();
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap Ho ten :");
		this.setHoTen(sc.nextLine());

		System.out.println("Nhap Ngay Sinh :");
		this.setNgaySinh(sc.nextLine());

		System.out.println("Nhap Que Quan :");
		this.setQueQuan(sc.nextLine());

		System.out.println("Nhap Ngay Hoc :");
		this.setNgayHoc(sc.nextLine());

		System.out.println("Nhap Nam Tot Nghiep :");
		this.setNamTotNghiep(Integer.parseInt(sc.nextLine()));

	}

	// Thuc hien so sanh nam gan nhat o day lay nam minh nhap vao tru cho 2016
	// roi so sanh nam nao nho hon thi lay
	@Override
	public int compareTo(Kysu o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
