package javabasicbai1;

import java.util.Scanner;

public class MyMainClass {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số thứ nhất x = ");
	        double x = scanner.nextDouble();

	        System.out.print("Nhập số thứ hai y = ");
	        double y = scanner.nextDouble();

	        System.out.print("Nhập lệnh ACTION = ");
	        scanner.nextLine(); 
	        String action = scanner.nextLine();

	        double result;
	        switch (action) {
	            case "CONG":
	                result = CalculateUtils.tinhCong(x, y);
	                System.out.println("Kết quả: " + result);
	                break;
	            case "TRU":
	                result = CalculateUtils.tinhTru(x, y);
	                System.out.println("Kết quả: " + result);
	                break;
	            case "NHAN":
	                result = CalculateUtils.tinhNhan(x, y);
	                System.out.println("Kết quả: " + result);
	                break;
	            case "CHIA":
	                if (y == 0) {
	                    System.out.println("Giá trị ACTION không hợp lệ. Số chia phải khác 0.");
	                } else {
	                    result = CalculateUtils.tinhChia(x, y);
	                    System.out.println("Kết quả: " + result);
	                }
	                break;
	            default:
	                System.out.println("Giá trị ACTION không hợp lệ");
	                break;
	        }

	        scanner.close();
	    }

}
