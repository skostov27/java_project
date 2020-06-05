import java.util.List;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		LinkedList<Cashier> cashiers=new LinkedList<>();

		Cashier first=new Cashier(1,"Stanislav1");
		Cashier second=new Cashier(2,"Stanislav2");
		Cashier third=new Cashier(3,"Stanislav3");
		Cashier fourth=new Cashier(4,"Stanislav4");
		cashiers.add(first);
		cashiers.add(second);
		cashiers.add(third);
		cashiers.add(fourth);
		
		LinkedList<Goods> goods =new LinkedList<>();
		for(int i = 0; i<100; i++) {

			Goods availableGoods=new Goods(0+i, "Milk", "No date", 1.95);
			goods.add(availableGoods);
			
		}
		LinkedList<Goods> list1=new LinkedList<>();
		for(int i = 0; i<10; i++) {

			Goods availableGoods=new Goods(0+i, "Cookies", "12.05.1998", 2.95);
			list1.add(availableGoods);
			
		}
		LinkedList<Client> clients=new LinkedList<>();
		for(int i = 0; i<10; i++) {
			
			Client availableGoods=new Client(list1, i);
			clients.add(availableGoods);
			
		}
		Store store1=new Store(goods, cashiers, 0, 0);
		store1.currentlyWorking(clients);
		
		System.out.println("Here");
		
	}

}


