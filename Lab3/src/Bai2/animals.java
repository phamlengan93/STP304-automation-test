package Bai2;
import java.util.ArrayList;
import java.util.Scanner;
public class animals {
	//khai bao thuoc tinh
	private String name;
	private double weight;

	//tao phuong thuc get cho cac thuoc tinh
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	//tao phuong thuc set cho cac thuoc tinh
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//su dung vong lap tao du lieu cho animals
	public static void main(String[]args ) {
		ArrayList<animals> array = new ArrayList<>();
		int N = 5;
		for (int i = 0; i<N; i++) {
			Scanner scanner = new Scanner(System.in);
			animals a = new animals() ;
			System.out.print("Nhap ten animal thu ["+(i+1)+"]: ");
			a.setName(scanner.nextLine());
			System.out.print("Nhap can nang animal thu ["+(i+1)+"]: ");
			a.setWeight(scanner.nextDouble());
			
			array.add(a);
			
		}
		
		//Arraylist hiện danh sách vừa nhập
		System.out.println("Thông tin Animal: " );
		for (int i = 0; i < N; i++) {
			System.out.println("Name: " + "\t" + array.get(i).getName() + 
					"\t" + "Weight: " + array.get(i).getWeight());
		}
		
		//Duyet arraylist tìm animal có weight lon nhat
		//B1: tao mang weight rong
		Scanner scanner = new Scanner(System.in);
	
		double weightList[] = new double[N];
		//B2: get tat ca weight tu arraylist vao mang
		for (int i=0; i<N; i++) {
			System.out.println("Can nang cua animal thu ["+(i+1)+"]: "+ array.get(i).getWeight());
			weightList[i]= array.get(i).getWeight();
			}
		int max_idx = 0;
		double max = weightList[0];
		for (int j=1; j<N; j++) {
			if(max < weightList[j]) {
				max = weightList[j];
				max_idx = j;
			}
		}
		System.out.println("Animal nang nhat la: "+array.get(max_idx).getName()+ " voi can nang la: "+weightList[max_idx]);
	}
}

		
		
	
