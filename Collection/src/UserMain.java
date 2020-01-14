import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		ArrayList<User> list = new ArrayList<>(n);

		System.out.println("Enter your user id");
		int uid = sc.nextInt();

		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("Enter your age");
		int age = sc.nextInt();

		System.out.println("Enter your marks");
		int mark = sc.nextInt();

		User user=new User(uid,name,age,mark);
		
		Collections.sort(list, new AgeComp().thenComparing(new MarksComp().thenComparing(new NameComp())));

		for (User u : list) {
			System.out.println(u.age);
			System.out.println(u.mark);
			System.out.println(u.name);
			System.out.print(u.uid);
		}

	}

}
