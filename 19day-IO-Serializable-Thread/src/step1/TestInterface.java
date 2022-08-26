package step1;
interface Player {} // 아무것도 없어도 쓸모가 있다. -> serializable 인터페이스의 다양한 계층구조를 지원한다  
							  // 인터페이스 : 다양한 계층 구조 족보하에 편입이 되냐 안되냐 큰 차이 -> ex) serializable 에는 상수와 추상메서드가 존재하지 않음 
							  // serialversionUID : 유일한 아이디값 붕어빵틀에 고유한 아이디 
							  // 어떤 유형의 틀에서 나왔는지 권장해준다   직렬화,역직렬화할때 UID가 다르면 이셉션 발생
							  // 멤버가 수정이 되어서 자동생성 되는 경우 serialversionUID 가 자동생성된다. ->  다르므로 이셉션 발생 
							  // Transiant 를 쓰면 직렬화가 안되는 변수 지정 
class GomPlayer implements Player{}
class Youtube implements Player{}
public class TestInterface {
	public static void main(String[] args) {
		GomPlayer gom = new GomPlayer();
		Youtube you = new Youtube();
		System.out.println(gom instanceof Player);
		System.out.println(you instanceof Player);
	}
}
