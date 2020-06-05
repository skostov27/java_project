import java.util.List;

import java.util.List;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;



public class Client {
	private List<Goods> list2;
	private int id;
	
	public List<Goods> getList() {
		return list2;
	}
	public void setLis(List<Goods> list2) {
		this.list2 = list2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Client(List<Goods> list2, int id) {
		super();
		this.list2 = list2;
		this.id = id;
	}

}
