
public class Character {
	// 캐릭터 상위 클래스
	String name = "기본캐릭터";
	int choice; // 선택한 캐릭터
	int health = 100; // 기본 체력
	int resistance = 10; // 기본 코로나 감염 저항력
	int nurse = 25;
	int athlete = 10;
	int student = 10;

	public void selectCharcter() {
		
	} // 자식클래스에서 출력문 가져오기

	public void status(int health, int resistance) {
		
	} // 상태를 알려주는 메소드

}