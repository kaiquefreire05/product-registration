package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProducts extends Product{
	
	private LocalDate manufatureDate;

	// construtores
	
	public UsedProducts() {}
	
	public UsedProducts(String name, Double price, LocalDate manufatureDate) {
		super(name, price);
		this.manufatureDate = manufatureDate;
	}

	// getters e setters 
	
	public LocalDate getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(LocalDate manufatureDate) {
		this.manufatureDate = manufatureDate;
	}
	
	// métodos da clase
	@Override
	public String priceTag() {
		return getName() + 
				" (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: " 
				+ manufatureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
