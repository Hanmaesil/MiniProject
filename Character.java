
public abstract class Character {
	//캐릭터 상위 클래스
	String name = "기본캐릭터";
	int choice; //선택한 캐릭터
	int health = 100; //기본 체력
	int resistance = 10; //기본 코로나 감염 저항력
	
	
	public abstract void selectCharcter(); // 자식클래스에서 출력문 가져오기
	public abstract void status(int health, int resistance); //상태를 알려주는 메소드
	
	
	
	
	
	
	
	
	

	
	
	
}
