
public class Athlete extends Character{
	
	
	String name = "운동선수";
	int health = 100 + 20; //기본 체력 + 추가체력
	int resistance = 10; //기본 코로나 감염 저항력
	
	
	@Override
	public void selectCharcter() {
		System.out.printf("체력 : %d\n",health);
		System.out.printf("코로나 감염 저항력 : %d\n", resistance);		
	}


	@Override
	public void status(int health, int resistance) { //선택지로 증가 및 감소되는 수치를 받는 매개변수
		this.health += health;
		this.resistance += resistance;
		System.out.println("===== 현재 스탯 =====");
		System.out.println(name);
		System.out.printf("체력 : %d\n", this.health);
		System.out.printf("코로나 감염 저항력 : %d\n", this.resistance);
		System.out.println("=================");		
	}
	
	


}
