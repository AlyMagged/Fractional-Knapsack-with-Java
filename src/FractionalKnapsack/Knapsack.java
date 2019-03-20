package FractionalKnapsack;

import java.util.ArrayList;
import java.util.Collections;
public class Knapsack {
	public class Item 
	{
		public int weight ; 
		public int value ;
		public float ratio ;
	}
	
	Item I = new Item() ; 
//	public static ArrayList <Float> fraction = new ArrayList<Float>() ;
	public static ArrayList<Item> Items = new ArrayList<Item>() ; 
	 
	public Knapsack(int weight , int value)
	{ 
		I.weight = weight; 
		I.value = value ; 
		add() ;
//		sort(); 
		
	}
	public void add()
	{
		I.ratio = I.value / I.weight ; 
		Items.add(I) ;  
		
	}
	public void sort()
	{
		float pivot ; 
		
		int high = Items.size()-1; 
		pivot = Items.get(high).ratio ; 
		int low = 0 ;
		int i = high -1 ; 
		
		for (int j=low ; j<high ; ++j)
		{
			if (Items.get(j).ratio<= pivot)
			{
				i++ ; 
				Item temp = Items.get(i) ; 
				Items.set(i, Items.get(j)) ;  
				Items.set(j, temp) ; 
			}
		}
		
		Item temp = Items.get(i+1) ; 
		Items.set(i+1, Items.get(high)) ;  
		Items.set(high, temp) ; 
		
//		System.out.println(Items.get(2).ratio +"  "+ Items.get(2).weight+"  "+ Items.get(2).value+"  ");
	}
	
	public float maxVlaue(float maxWeight)
	{
		float counter =0 ; 
		for (int i= 0 ; i<Items.size() ; ++i)
		{
			if (maxWeight==0)
				break ; 
			else if(Items.get(i).weight <= maxWeight)
			{
				maxWeight-=Items.get(i).weight ;
				counter+=Items.get(i).value ; 
			}
			else if (Items.get(i).weight > maxWeight)
			{
				counter+= (maxWeight/Items.get(i).weight)*Items.get(i).value ; 
			}
		}
		return counter ;
	}
	

}
