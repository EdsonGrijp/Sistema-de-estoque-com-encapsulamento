package entites;

public class Product {
	private String name; //n�o esquecer da regra do camel case.
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =  name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity; 
	}
	
	public double totalValueInStock() {
		return  price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //palavra reservada de auto refer�ncia para o objeto. Ele est� acessando o atributo da classe.
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)			
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", totalValueInStock());
			
	}
}

