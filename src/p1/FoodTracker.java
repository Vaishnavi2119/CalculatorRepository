package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class RestaurantManager{
	
	//String item;
	int totalOrders = 0;
	HashMap<String, Integer> map = new HashMap<>();
	
	public RestaurantManager() {
		
	}
	
	public RestaurantManager( int totalOrders, HashMap<String, Integer> map) {
		super();
		//this.item = item;
		this.totalOrders = totalOrders;
		this.map = map;
	}
	public void orderFood(String item) {
		
		map.put(item, map.getOrDefault(item, 0)+1);
		totalOrders++;
	}
	public boolean cancelOrder(String item) {
		if(!map.containsKey(item)) {
			return false;
		}
		int cnt = map.get(item);
		if(cnt == 1) {
			map.remove(item);
		}
		else {
			map.put(item, cnt-1);
		}
		totalOrders--;
		return true;
		
	}
	public int getTotalOrders() {
		return totalOrders;
	}
	
	public int getItemOrderCount(String item) {
		if(!map.containsKey(item))
			return 0;

		return map.get(item);
	}
	
	public List<String> getMostPopularItems(){
		
		List<String> rep = new ArrayList<String>();
		if(map.isEmpty()) {
			return rep;
		}
		int maxCnt = Collections.max(map.values());
		for(String item : map.keySet()) {
			if(map.get(item) == maxCnt) {
				rep.add(item);
			}
		}
		Collections.sort(rep);
		return rep;
		
	}
	
	public void printMenu() {
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}
}
public class FoodTracker {

	public static void main(String[] args) {
	
			RestaurantManager m1 = new RestaurantManager();
			m1.orderFood("dosa");
			m1.orderFood("idli");
			m1.orderFood("dosa");
			m1.orderFood("poori");
			System.out.println("Food Menu: ");
			m1.printMenu();
			
			System.out.println("total orders: "+m1.getTotalOrders());
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter item to know order count: ");
			String str = sc.nextLine();
			System.out.println("order count:"+str+" "+m1.getItemOrderCount(str));
			System.out.println("popular items: "+m1.getMostPopularItems());
			System.out.println("Cancel order ? Enter item : ");
			String str2 = sc.nextLine();
			System.out.println(m1.cancelOrder(str2));
			System.out.println("orders after cancelling");
			m1.printMenu();
			System.out.println("total orders: "+m1.getTotalOrders());
	}

}
