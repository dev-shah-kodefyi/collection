
import java.util.List;
import java.util.Map;

public class User {
	int userId;
	String userName;
	Map<Laptop,List<Movies>> map;
	public User() {
		super();
	}
	public User(int userId, String userName, Map<Laptop, List<Movies>> map) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.map = map;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Map<Laptop, List<Movies>> getMap() {
		return map;
	}
	public void setMap(Map<Laptop, List<Movies>> map) {
		this.map = map;
	}
	
}

