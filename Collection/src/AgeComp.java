import java.util.Comparator;

public class AgeComp implements Comparator<User> {

	

	@Override
	public int compare(User o1, User o2) {
	
		if(o1.age>o2.age)
			return 1;
		else if(o1.age<o2.age)
			return -1;
		else
		return 0;
	}

}
