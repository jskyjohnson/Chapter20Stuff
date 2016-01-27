/**
 * 
 */
import java.util.*;
/**
 * @author SkyJohnson
 * 
 *
 */
public class tested {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Stack<String> stk = new Stack<String>();
//		
//		stk.push("One");
//		stk.push("Two");
//		stk.push("Three");
//		
//		while(!stk.isEmpty()){
//			String s = stk.pop();
//			if(!stk.isEmpty()){
//				s+=("-" + stk.pop());
//				stk.push(s);
//			}
//			System.out.println(s);
//		}
		Queue<Integer> q = new LinkedList<Integer>();
		
		for ( int k = 1; k <= 3; k++){
			q.add(k-1);
			q.add(k+1);
		}
		while(!q.isEmpty()){
			System.out.print(q.remove() + " ");
		}
	}
	public static double sum2(List<Double> list){
		double k = 0.0;
		Iterator<Double> topIter = list.iterator();
		while(topIter.hasNext()){
			double firstValue = topIter.next();
			Iterator<Double> lowerIter = list.iterator();
			while(lowerIter.hasNext()){
				double secondValue = lowerIter.next();
				k += firstValue*secondValue;
			}
		}
		return k;
	}
	public static LinkedList<String> mixOn(List<String> list1, List<String> list2){
		if(list1.size() != list2.size()){
			return null;
		}
		LinkedList<String> k = new LinkedList<String>();
		Iterator<String> l1iter = list1.iterator();
		Iterator<String> l2iter = list2.iterator();
		while(l1iter.hasNext() && l2iter.hasNext()){
			k.add(l1iter.next());
			k.add(l2iter.next());
		}
		return k;
	}
	
	public static LinkedList<String> mix(List<String> list1, List<String> list2){
		if(list1.size() != list2.size()){
			return null;
		}
		LinkedList<String> k = new LinkedList<String>();
		for(int i = 0; i < list1.size(); i++){
			k.add(list1.get(i));
			k.add(list2.get(i));
		}
		return k;
	}
	public static <E> void appendIndecies(List<E> list1, List<E> list2){
		for(int i = 0; i < list2.size(); i++){
			list1.add(list1.size()+i,list2.get(i));
		}
	}
	public static <E> void appendIterator(List<E> list1, List<E> list2){
		Iterator<E> iter = list2.iterator();
		while(iter.hasNext()){
			list1.add(iter.next());
		}
	}
	public static <E> void appendForEach(List<E>list1, List<E> list2){
		for(E k: list2){
			list1.add(k);
		}
	}

}
