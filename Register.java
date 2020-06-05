import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;



public class Register {
	
	private Cashier currentCashier;
	private int flag;
	

	public Cashier getCurrentCashier() {
		return currentCashier;
	}

	public void setCurrentCashier(Cashier currentCashier) {
		this.currentCashier = currentCashier;
		this.flag=1;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Register(Cashier currentCashier) {
		super();
		this.currentCashier = currentCashier;
	}
	
	public void serveClient(Client client, Store store)  throws Exception {

		System.out.println("The client has been served");

	//		for(Goods good: client.getList()) {
	//			if (store.getListOfGoods() && store.getStocksAvailable().get(stock) < stock.getValue()){
	//				throw new Exception("More items of " + stock.getKey().getName() + " requested!" + System.lineSeparator()
	//						+ "Requested : " + stock.getValue() + " in-stock : " + store.getStocksAvailable().get(stock));
	//			}
	//		}
	//		return billFactory.createBill(cashier, new Date(), client.getStocksMap());

	}

	
}
