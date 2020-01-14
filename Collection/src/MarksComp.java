import java.util.Comparator;

public class MarksComp implements Comparator <User> {


	@Override
	public int compare(User o1, User o2) {
		
		
		if(o1.mark>o2.mark)
			return 1;
		else if(o1.mark<o2.mark)
			return -1;
		else
		return 0;
	}

}
