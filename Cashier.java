import java.util.List;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;


public class Cashier {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cashier(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public double checkStore(List<Goods> listOfGroceries,List<Goods> listOfGoods) throws Exception {
		int flag=0;
		Map<Goods, Integer> goodsQuantity = new HashMap<>();
		for (Goods goods: listOfGoods) {
			if (goodsQuantity.containsKey(goods))
			{
				goodsQuantity.put(goods, goodsQuantity.get(goods) + 1);
			}
			else{
				goodsQuantity.put(goods, 1);
			}
		}
		Map<Goods, Integer> purchasedGoodsQuantity = new HashMap<>();
		for (Goods goods: listOfGoods) {
			if (goodsQuantity.containsKey(goods))
			{
				purchasedGoodsQuantity.put(goods, purchasedGoodsQuantity.get(goods) + 1);
			}
			else{
				purchasedGoodsQuantity.put(goods, 1);
			}
		}
		for(Map.Entry<Goods, Integer> produkt : purchasedGoodsQuantity.entrySet()) {
			if (goodsQuantity.containsKey(produkt) && goodsQuantity.get(produkt) < produkt.getValue()){
				throw new Exception("There aren't enough products : " + produkt.getKey() + " " +  produkt.getValue() + "\n");
			}
		}

        System.out.println("\t\t A customer has been provided service");

        Receipt receipt1=new Receipt(this,"00:00:00",listOfGroceries);



		receipt1.printReceipt();
		return receipt1.getTotalSum();
		
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("Cashier [id=").append(id).append(", name=").append(name).append("]");
		return sbuilder.toString();
	}
	
}
