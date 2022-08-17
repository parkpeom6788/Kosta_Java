import java.util.HashMap;
import java.util.Map;
public class Test {
	public static void main(String[] args) throws AgeException  {
		getAge(-3);
	}
	public static int getAge(int age) throws AgeException {
		if (age<0){
				throw new AgeException("나이가 0살보다 적으면 안됩니다.");			
			}
		return age;
	}
}
