import java.util.LinkedList;
import java.util.Queue;

public class Student {
	
	private double GPA;
	private String name;
	
	public Student(String a, double b){
		name = a;
		GPA = b;
	}
	
	public String toString(){
		return name + " : " + GPA;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Student> studentBody = new LinkedList<Student>();
		for(int i = 0; i < 100; i++){
			studentBody.add()
		}
	}

}
