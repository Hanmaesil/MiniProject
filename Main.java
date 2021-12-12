import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Nurse nu = new Nurse(); // 간호사 클래스
		Athlete at = new Athlete(); // 운동선수 클래스
		Student stu = new Student(); // 고등학생 클래스
		Percentage per = new Percentage(); // 확률과 수치들 클래스

		Character nurse = nu; // 업캐스팅
		Character athlete = at; // 업캐스팅
		Character student = stu; // 업캐스팅

		int choice; // 캐릭터 선택하기
		int world; // 지역 선택
		int finChoice; // 최종 선택
		int cnt = 0; // while 문을 빠져나오는 조건.
		// 캐릭터 수치
		int health = 0; // 추가 및 감소되는 체력수치 저장
		int resistance = 0; // 추가 및 감소되는 저항력 저장

		while (true) { // 캐릭터 선택하기!
			System.out.println("===== 캐릭터를 선택하세요 ======");
			System.out.print("1. 간호사 2. 운동선수 3. 고등학생 >>>>");
			choice = sc.nextInt(); // 캐릭터를 고르시오.
			if (choice == 1) {
				System.out.println("간호사는 조기백신을 접종하여 다른 캐릭터보다 코로나 감염저항력이 높습니다!.");
				nurse.selectCharcter(); // 스탯을 보여준다.
				System.out.print("1. 선택 2. 뒤로가기. >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (choice == 2) {
				System.out.println("운동선수는 철저한 몸관리로 다른 캐릭터보다 체력이 높습니다!");
				athlete.selectCharcter(); // 스탯을 보여준다.
				System.out.print("1. 선택 2. 뒤로가기. >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (choice == 3) {
				System.out.println("고등학생은 코로나 대유행시 한달을 스킵 가능합니다!.");
				student.selectCharcter(); // 스탯을 보여준다.
				System.out.print("1. 선택 2. 뒤로가기 >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else {
				System.out.println("다시 선택하세요!");
			}
			if (cnt != 0) {
				System.out.println("선택완료.");
				cnt = 0;
				break;
			}

		}

		while (true) { // 지역선택하기.
			System.out.println("===== 지역 선택 =====");
			System.out.print("1. 수도권 2. 지방권 3. 강원도 두메산골 >>>>");
			world = sc.nextInt();

			if (world == 1) {
				System.out.println("수도권은 다른지역보다 코로나에 걸릴 확률이 높습니다.");
				System.out.print("1. 선택 2. 뒤로가기 >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (world == 2) {
				System.out.println("지방권은 수도권보다 코로나에 걸릴 확률이 낮지만 쉽지는 않을겁니다.");
				System.out.println("1. 선택 2. 뒤로가기 >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (world == 3) {
				System.out.println("강원도 두메산골은 코로나가 쉽게 접근 못하는 청정지역입니다.");
				System.out.print("1. 선택 2. 뒤로가기 >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else {
				System.out.println("다시 선택하세요!");
			}
			if (cnt != 0) {
				System.out.println("선택완료.");
				cnt = 0;
				break;
			}

		}
		status(choice, nurse, athlete, student, health, resistance); // 캐릭터의 상태창을 보여주는 메소드

		int month = 1; // 1, 2, 3 ... 12번째 턴
		int day = 1; // 아침 점심 저녁 선택지.

	
		int dayChoice; // 선택지 고르는 변수
		while (true) {
			System.out.println("각박한 세상에 살아남으십시오.");  //스크립트 따로 클래스로 빼기

			if (month == 1) {
				System.out.println("1월");
				System.out.println("선택지를 고르세요");
				System.out.print("1. 10분 더자고 출근하기, 2. 씻고 출근하기 3. 밥먹고 출근하기 >>>>");
				dayChoice = sc.nextInt();
				if (dayChoice == 1) {
					if (per.select > 0 && per.select < 40) {
						System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
						System.out.printf("욕실에서 미끄러져 체력 -%d!\n", per.healthStandard1); //랜덤숫자 다시 뽑는방법 찾아보기
						health -= per.healthStandard1;
						} 
					else if (per.select > 40 && per.select < 80) {
						System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
						System.out.printf("푹 자고 일어나서 체력 +%d!\n", per.healthStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // 이벤트
							System.out.printf("추가로 저항력 +%d!!!", per.resistanceStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("지각하여 오전내내 상사에게 시달렸다.");
						System.out.printf("정신적인 타격으로 체력 -%d\n", per.healthStandard1);
						health -= per.healthStandard1;
						
					}

				} else if (dayChoice == 2) {

				} else if (dayChoice == 3) {

				}
			}
			System.out.println("선택지를 고르세요");
			System.out.print("1. 구내식당가기 2. 맛집 찾아가기 3. 짬내서 운동하기 >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) {
				if (per.select > 0 && per.select < 40) {
					System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
					System.out.printf("욕실에서 미끄러져 체력 -%d!\n", per.healthStandard2);
					health -= per.healthStandard2;
					
				} else if (per.select > 40 && per.select < 80) {
					System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
					System.out.printf("푹 자고 일어나서 체력 +%d!\n", per.healthStandard2);
					health += per.healthStandard2;
					if (per.select > 60 && per.select < 70) { // 이벤트
						System.out.printf("추가로 저항력 +%d!!!", per.resistanceStandard2);
						resistance += per.resistanceStandard2;
						
					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("지각하여 오전내내 상사에게 시달렸다.");
					System.out.printf("정신적인 타격으로 체력 -%d\n", per.healthStandard2);
					health -= per.healthStandard2;
					
				}

			} else if (dayChoice == 2) {

			} else if (dayChoice == 3) {

			}
			
			System.out.println("선택지를 고르세요");
			System.out.print("1. 칼퇴하고 푹 쉬기! 2. 친구만나기 3. 운동가기 >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) {
				if (per.select > 0 && per.select < 40) {
					System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
					System.out.printf("욕실에서 미끄러져 체력 -%d!\n", per.healthStandard3);
					health -= per.healthStandard3;
					
				} else if (per.select > 40 && per.select < 80) {
					System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
					System.out.printf("푹 자고 일어나서 체력 +%d!\n", per.healthStandard3);
					health += per.healthStandard3;
					if (per.select > 60 && per.select < 70) { // 이벤트
						System.out.printf("추가로 저항력 +%d!!!", per.resistanceStandard3);
						resistance += per.resistanceStandard3;
						
					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("지각하여 오전내내 상사에게 시달렸다.");
					System.out.printf("정신적인 타격으로 체력 -%d\n", per.healthStandard3);
					health -= per.healthStandard3;
					
				}

			} else if (dayChoice == 2) {

			} else if (dayChoice == 3) {

			}
			
			status(choice, nurse, athlete, student, health, resistance);
			break;
			
		}
		
		
		
		
	}

	// 캐릭터의 상태창을 보여주는 메소드.
	private static void status(int choice, Character nurse, Character athlete, Character student, int health,
			int resistance) {
		if (choice == 1) {
			nurse.status(health, resistance);
		} else if (choice == 2) {
			athlete.status(health, resistance);
		} else if (choice == 3) {
			student.status(health, resistance);
		}
	}

}
