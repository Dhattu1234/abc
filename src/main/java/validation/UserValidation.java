package validation;
import java.util.ResourceBundle;
public class UserValidation {
	public boolean check(String name, String password)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String a=rb.getString("username");
		String b=rb.getString("password");
		if(a.equals(name) && b.equals(password))
		{
			return true;
		}
		return false;
	}
}
