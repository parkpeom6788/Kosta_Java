package step8;

public class MovieService {
	public void enterAdultMovie(int age) throws AgeException {
		if(age <= 0)
			throw new AgeException(age+" : 잘못된 나이 정보입니다.");
		else if(age <= 13)
			throw new AgeException(age +" : 세 미성년이므로 성인영화 관람은 불가합니다.");
		System.out.println("즐 영화감상~~");
	}
}
