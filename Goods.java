
import java.util.List;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;

public class Goods {
	private int id;
	private String nameOfProduct;
	private String bestBefore;
	private double Price;
	
	@Override
	public String toString() {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("Goods [id=").append(id).append(", nameOfProduct=").append(nameOfProduct).append(", bestBefore=")
				.append(bestBefore).append(", Price=").append(Price).append("]");
		return sbuilder.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOfProduct() {
		return nameOfProduct;
	}
	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}
	public String getSrokNaGodnost() {
		return bestBefore;
	}
	public void setSrokNaGodnost(String bestBefore) {
		this.bestBefore = bestBefore;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
	public Goods(int id, String nameOfProduct, String bestBefore, double Price) {
		super();
		this.id = id;
		this.nameOfProduct = nameOfProduct;
		this.bestBefore = bestBefore;
		this.Price = Price;
	}

}
