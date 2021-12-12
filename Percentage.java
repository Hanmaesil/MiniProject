import java.util.Random;

public class Percentage {
	// 기본적인 수치들 클래스.
	Random ran = new Random();
	// 체력과 저항력 감소와 증가 수치
	//아침
	int healthStandard1 = ran.nextInt(20) + 1;
	int resistanceStandard1 = ran.nextInt(15)+1;
	//점심
	int healthStandard2 = ran.nextInt(20) + 1;
	int resistanceStandard2 = ran.nextInt(15)+1;
	//저녁
	int healthStandard3 = ran.nextInt(20) + 1;
	int resistanceStandard3 = ran.nextInt(15)+1;
	
	// 선택지 수치
	int select = ran.nextInt(120)+ 1; //3분의 1확률로 선택지 출력
	
	

	// 기본 감염률 : 60%
	int percentage = ran.nextInt(100) + 1;

	// 대유행시 감염률 추가(4,8번째 턴)
	int vogue = 20;

	//사회적 거리두기시 추가 면역력 감소 수치(3, 6, 9번째 턴)
	int keepDistance1 = 10; //사회적거리두기 1단계
	int keepDistance2 = 20; //사회적거리두기 2단계 
	int keepDistance3 = 30; //사회적거리두기 3단계 
	
	
	//백신 접종시 추가 저항력
	//1차접종(5번째 턴)
	int noVaccine1 = 0;
	int vaccineAz1 = 5;
	int vaccinePfizer1 = 10;
	int vaccineModerna1 = 15;
	//2차접종(10번째 턴)
	int noVaccine2 = -10; //백신패스로 인해 불이익을 받았다.
	int vaccineAz2 = 10;
	int vaccinePfizer2 = 15;
	int vaccineModerna2 = 20;
	
	//백신 접종시 부작용으로 체력 감소 폭
	//1차접종
	int sideEffectAz1 = 5;
	int sideEffectPfizer1 = 10;
	int sideEffectMorderna1 = 15;
	//2차접종
	int sideEffectAz2 = 10;
	int sideEffectPfizer2 = 15;
	int sideEffectMorderna2 = 20;
	
	//12월 연말 이벤트
	
	
	//돌연변이 출연
//	if(percentage == 20 && 40 && 60 && 80) {
//		System.out.println("대유행!"); //대유행시 코로나 감염률 30퍼센트 증가
//	}
	
	

	
	
}
