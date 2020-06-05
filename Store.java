import java.util.List;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;

public class Store {
	private List<Goods> listOfGoods;
	private List<Cashier> listOfCashiers;
	private List<Register> registers;
	private int numberOfReceipts;

	public Store(List<Goods> listOfGoods, List<Cashier> listOfCashiers, int numberOfReceipts, int turnover) {
		super();
		this.listOfGoods = listOfGoods;
		this.listOfCashiers = listOfCashiers;
		this.numberOfReceipts = numberOfReceipts;
		this.turnover = 0;
		this.registers = new LinkedList<Register>();
		for (int i = 0; i < listOfCashiers.size(); i++) {
			Register register = new Register(listOfCashiers.get(i));
			registers.add(register);
		}

	}

	public List<Register> getRegisters() {
		return registers;
	}

	public void setRegisters(List<Register> registers) {
		this.registers = registers;
	}

	public List<Goods> getListOfGoods() {
		return listOfGoods;
	}

	public void setListOfGoods(List<Goods> listOfGoods) {
		this.listOfGoods = listOfGoods;
	}

	public List<Cashier> getListOfCashiers() {
		return listOfCashiers;
	}

	public void setListOfCashiers(List<Cashier> listOfCashiers) {
		this.listOfCashiers = listOfCashiers;
	}

	public int getNumberOfReceipts() {
		return numberOfReceipts;
	}

	public void setNumberOfReceipts(int numberOfReceipts) {
		this.numberOfReceipts = numberOfReceipts;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double d) {
		this.turnover = d;
	}

	private double turnover;

	public Store getInstance() {
		return this;
	}

	public void currentlyWorking(List<Client> clients) {

		Store mystore = getInstance();

		Thread thread1[] = new Thread[clients.size()];


			for (Register register:getRegisters()) {
				int j = 0;
				Thread t1 = new Thread(new Runnable() {


					public void run() {
						System.out.println("Thread"+" is alive and running");

						try {
							register.serveClient(clients.get(j), mystore);
						} catch (Exception e) {
							e.printStackTrace();
						}

						System.out.println("Thread "+" is finished");

					}

				});
				t1.start();
			}


		//for (int i = 0; i < clients.size(); i++) {
		//	try {
		//		thread1[i].join();
		//	} catch (InterruptedException e) {
//
		//		e.printStackTrace();
		//	}
		//}
	}

	private synchronized Client appear(List<Client> clients) {
		if (!clients.isEmpty()) {
			return clients.remove(0);
		}
		return null;

	}
}
