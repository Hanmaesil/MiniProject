import java.util.Random;

public class Percentage2 extends Character {
	// 기본적인 수치들 클래스.
	Random ran = new Random();
	// 지역별 저항력 추가되는 값, 캐릭터 클래스에 추가하기
	int seoul = 0; // 수도권
	int provinces = 15; // 지방
	int country = 30; // 시골

	// 체력과 저항력 감소와 증가 수치
	// 아침
	int healthStandard1 = ran.nextInt(20) + 1;
	int resistanceStandard1 = ran.nextInt(20) + 1;
	// 점심
	int healthStandard2 = ran.nextInt(20) + 1;
	int resistanceStandard2 = ran.nextInt(20) + 1;
	// 저녁
	int healthStandard3 = ran.nextInt(20) + 1;
	int resistanceStandard3 = ran.nextInt(20) + 1;

	// 선택지 수치
	int select = ran.nextInt(120) + 1; // 3분의 1확률로 선택지 출력

	// 기본 감염률 : 60%
	int percentage = ran.nextInt(100) + 1;
	// if(percentage < 50) 감염, 저항력이 나을때 감염되어야 한다.

	// 대유행시 감염률 추가(4,8번째 턴)
	int vogue = 20;

	// 사회적 거리두기시 추가 면역력 감소 수치(3, 6, 9번째 턴)
	int keepDistance1 = 10; // 사회적거리두기 1단계
	int keepDistance2 = 20; // 사회적거리두기 2단계
	int keepDistance3 = 30; // 사회적거리두기 3단계

	// 백신 접종시 추가 저항력
	// 1차접종(5번째 턴)
	int noVaccine1 = 0;
	int vaccineAz1 = 5;
	int vaccinePfizer1 = 10;
	int vaccineModerna1 = 15;
	// 2차접종(10번째 턴)
	int noVaccine2 = -10; // 백신패스로 인해 불이익을 받았다.
	int vaccineAz2 = 10;
	int vaccinePfizer2 = 15;
	int vaccineModerna2 = 20;

	// 백신 접종시 부작용으로 체력 감소 폭
	// 1차접종
	int sideEffectAz1 = 5;
	int sideEffectPfizer1 = 10;
	int sideEffectMorderna1 = 15;
	// 2차접종
	int sideEffectAz2 = 10;
	int sideEffectPfizer2 = 15;
	int sideEffectMorderna2 = 20;

	// 12월 연말 이벤트

	// 돌연변이 출연
//	if(percentage == 20 && 40 && 60 && 80) {
//		System.out.println("대유행!"); //대유행시 코로나 감염률 30퍼센트 증가
//	}
	
	
	
	public void RePercentage(int resistance) { //기본 감염률 + 면역력 추가
		if(percentage + resistance < 50) { //면역력 추가
			System.out.println("코로나 감염");
		}else {
			System.out.println("무사히 하루를 넘겼습니다");
			
			if(resistance < 30) {  //면역력이 일정수치 이하일때 경고
				System.out.println("===== 경고 =====");
				System.out.printf("현재 당신의 저항력은 %d 입니다.");
				System.out.println("==============");
			}
		}
	}
	
	public void HePercentage(int health) { //하루가 종료될 때 일정 체력 이하라면 
		int decrease = 5;
		if(health < 70) {
//			resistance -= decrease;  기본 저항력 - 추가 감소분.
		}
		
		
	}

	@Override
	public void selectCharcter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void status(int health, int resistance) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
}