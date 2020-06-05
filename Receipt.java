import java.util.List;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;



public class Receipt {

	private static int id=0;
	private Cashier printedByCashier;
	private String displayTime;
	private List<Goods> listGoods;
	private double totalSum;
	
	
	public double getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}
	public static void setId(int id) {
		Receipt.id = id;
	}
	public Receipt(Cashier printedByCashier, String displayTime, List<Goods> listGoods) {
		super();
		this.printedByCashier = printedByCashier;
		this.displayTime = displayTime;
		this.listGoods = listGoods;
		id++;
		for(int i=0;i<this.listGoods.size();i++) {
			totalSum+=this.listGoods.get(i).getPrice();
		}
	}
	public int getId() {
		return id;
	}
	public Cashier getPrintedByCashier() {
		return printedByCashier;
	}
	public void setPrintedByCashier(Cashier printedByCashier) {
		this.printedByCashier = printedByCashier;
	}
	public String getDisplayTime() {
		return displayTime;
	}
	public void setDisplayTime(String displayTime) {
		this.displayTime = displayTime;
	}
	public List<Goods> getListGoods() {
		return listGoods;
	}
	public void setList(List<Goods> listGoods) {
		this.listGoods = listGoods;
	}
	
	@Override
	public String toString() {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("Receipt [printedByCashier=").append(printedByCashier).append(", displayTime=").append(displayTime)
				.append(", listGoods=").append(listGoods).append(", totalSum=").append(totalSum).append("]");
		return sbuilder.toString();
	}
	
	public void printReceipt() {
		
		Formatter a = null;
		
		try {
			a=new Formatter(id+".txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		a.format("%s",this.toString());
		a.close();
		System.out.println("\t\t\t A receipt has been printed: "+id);
		return;
	}
	
}
