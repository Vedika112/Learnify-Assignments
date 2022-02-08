
public class Product {
	int ProdId;
	String ProdName;
	Product(){
		ProdId=12;
		ProdName="Pen";
	}
	void print() {
		System.out.println(ProdId);
		System.out.println(ProdName);

	}
	public static void main(String[] args) {
		Product p=new Product();
		p.print();
		
	}
}
