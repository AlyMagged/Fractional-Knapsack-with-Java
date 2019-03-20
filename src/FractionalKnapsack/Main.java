package FractionalKnapsack;
import java.awt.Frame;

public class Main {
	public static void main(String[] args) {
		Knapsack k1 = new Knapsack(10  , 60  );
//		System.out.println(k1.fraction);
		Knapsack k2 = new Knapsack(20  , 100  );
		Knapsack k3 = new Knapsack(30  , 120  );
		
		k3.sort();
		float x= k3.maxVlaue(50);
		System.out.println(x);
	}

}
