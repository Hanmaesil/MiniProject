
import java.util.Scanner;

public class Main백업본 {

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
			System.out.println("각박한 세상에 살아남으십시오."); // 스크립트 따로 클래스로 빼기
			
			if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11 || month == 12) {
				System.out.println(month + "월");
				System.out.println("===== 아침 =====");
				System.out.println("선택지를 고르세요");
				System.out.print("1. 10분 더자고 출근하기, 2. 씻고 출근하기 3. 밥먹고 출근하기 >>>>");
				dayChoice = sc.nextInt();
				if (dayChoice == 1) { // 10분 더자고 출근하기
					if (per.select > 0 && per.select < 40) {
						System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
						System.out.printf("욕실에서 미끄러져 체력 -%d!\n", per.healthStandard1); // 랜덤숫자 다시 뽑는방법 찾아보기
						health -= per.healthStandard1;
					} else if (per.select > 40 && per.select < 80) {
						System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
						System.out.printf("푹 자고 일어나서 체력 +%d!\n", per.healthStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // 이벤트
							System.out.printf("추가로 저항력 +%d!!!\n", per.resistanceStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
						System.out.printf("정신승리로 인한 저항력 +%d\n", per.resistanceStandard1);
						resistance += per.resistanceStandard1;

					}

				} else if (dayChoice == 2) { // 씻고 출근하기
					if (per.select > 0 && per.select < 40) {
						System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
						System.out.printf("상사에게 혼나 체력 -%d!\n", per.healthStandard1); // 랜덤숫자 다시 뽑는방법 찾아보기
						health -= per.healthStandard1;
					} else if (per.select > 40 && per.select < 80) {
						System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
						System.out.printf("깨끗하게 씻어서 저항력 +%d!\n", per.resistanceStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // 이벤트
							System.out.printf("추가로 체력 +%d!!!\n", per.healthStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("부지런히 씻고 무사히 출근!");
						System.out.printf("정시출근으로 체력 +%d\n", per.healthStandard1);
						health += per.healthStandard1;

					}

				} else if (dayChoice == 3) { // 밥먹고 출근하기
					if (per.select > 0 && per.select < 40) {
						System.out.println("밥을 급하게 먹어 체해버렸다!");
						System.out.printf("속이 답답해서 체력 -%d!\n", per.healthStandard1); // 랜덤숫자 다시 뽑는방법 찾아보기
						health -= per.healthStandard1;
					} else if (per.select > 40 && per.select < 80) {
						System.out.println("아침엔 고기지!");
						System.out.printf("속이 든든해서 체력 +%d!\n", per.healthStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // 이벤트
							System.out.printf("추가로 저항력 +%d!!!\n", per.resistanceStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("밥을 든든히 먹은후엔 아이스 아메리카노지!");
						System.out.printf("카페인 섭취로 인한 저항력 +%d\n", per.resistanceStandard1);
						resistance += per.resistanceStandard1;

					}

				}
			}
			System.out.println("===== 점심 =====");
			System.out.println("선택지를 고르세요");
			System.out.print("1. 구내식당가기 2. 맛집 찾아가기 3. 짬내서 운동하기 >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) { // 구내식당가기
				if (per.select > 0 && per.select < 40) {
					System.out.println("구내식당 공사로 인해 점심을 못 먹었다.");
					System.out.printf("쫄쫄 굶어 체력 -%d!\n", per.healthStandard2);
					health -= per.healthStandard2;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("18첩 반상이 나왔다!");
					System.out.printf("배불리 먹어 체력 +%d!\n", per.healthStandard2);
					health += per.healthStandard2;
					if (per.select > 60 && per.select < 70) { // 이벤트
						System.out.printf("기분이 좋아져 추가로 저항력 +%d!!!\n", per.resistanceStandard2);
						resistance += per.resistanceStandard2;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("과식으로 인해 응급실로 실려갔다.");
					System.out.printf("응급실에 가서 저항력 -%d\n", per.resistanceStandard2);
					resistance -= per.resistanceStandard2;

				}

			} else if (dayChoice == 2) {// 맛집 찾아가기
				if (per.select > 0 && per.select < 40) {
					System.out.println("맛집을 갔는데 웨이팅이 길어 밥을 못먹었다.");
					System.out.printf("쫄쫄 굶어 체력 -%d!\n", per.healthStandard2);
					health -= per.healthStandard2;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("......겁나 맛있어");
					System.out.printf("배불리 먹어 체력 +%d!\n", per.healthStandard2);
					health += per.healthStandard2;
					if (per.select > 40 && per.select < 70) { // 이벤트
						System.out.printf("기분이 좋아져 추가로 저항력 +%d!!!\n", per.resistanceStandard2);
						resistance += per.resistanceStandard2;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("맛집의 행운권에 당첨되어 한달 무료 이용권을 얻었다!");
					System.out.printf("기분이 좋아져 저항력 +%d\n", per.resistanceStandard2);
					resistance += per.resistanceStandard2;

				}

			} else if (dayChoice == 3) {// 짬내서 운동하기
				if (per.select > 0 && per.select < 40) {
					System.out.println("운동에 열중한 나머지 퇴근시간에 복귀했다!");
					System.out.printf("상사에게 혼나 저항력 -%d!\n", per.resistanceStandard2);
					resistance -= per.resistanceStandard2;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("스쿼트 1000개!!!!!");
					System.out.printf("근육이 너무 잘먹어 면역력 +%d!\n", per.resistanceStandard2);
					resistance += per.resistanceStandard2;
					if (per.select > 50 && per.select < 70) { // 이벤트
						System.out.printf("기분이 좋아져 추가로 저항력 +%d!!!\n", per.resistanceStandard2);
						resistance += per.resistanceStandard2;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("운동후엔 단백질쉐이크지!");
					System.out.printf("운동이 잘되서 면역력이 +%d\n", per.resistanceStandard2);
					resistance += per.resistanceStandard2;

				}

			}

			System.out.println("===== 저녁 =====");
			System.out.println("선택지를 고르세요");
			System.out.print("1. 칼퇴하고 푹 쉬기! 2. 친구만나기 3. 운동가기 >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) { // 칼퇴하고 푹쉬기
				if (per.select > 0 && per.select < 40) {
					System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
					System.out.printf("만원버스를 피해 체력이 +%d!\n", per.healthStandard3);
					health += per.healthStandard3;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 야근을 하게 되었다");
					System.out.printf("망할 상사때문에 체력 -%d!\n", per.healthStandard3);
					health -= per.healthStandard3;
					if (per.select > 50 && per.select < 70) { // 이벤트
						System.out.printf("스트레스로 인한 저항력 -%d!!!\n", per.resistanceStandard3);
						resistance -= per.resistanceStandard3;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
					System.out.printf("맛있는 음식으로 인해 체력 +%d\n", per.healthStandard3);
					health += per.healthStandard3;

				}

			} else if (dayChoice == 2) { // 친구만나기
				if (per.select > 0 && per.select < 40) {
					System.out.println("사람 많은 곳을 피해 친구 집으로 가서 술을 먹었다!");
					System.out.printf("사람 많은 곳을 피해 저항력이 +%d!\n", per.resistanceStandard3);
					resistance += per.resistanceStandard3;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("친구를 만나느라 샤샤샤~");
					System.out.printf("기분이 좋아져서 체력 +%d!\n", per.healthStandard3);
					health += per.healthStandard3;
					if (per.select > 60 && per.select < 70) { // 이벤트
						System.out.printf("기분이 좋아져서 저항력 +%d!!!\n", per.resistanceStandard3);
						resistance += per.resistanceStandard3;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("이시국에 꼭 만나야 했을까...");
					System.out.printf("체력 -%d\n", per.healthStandard3);
					System.out.printf("저항력 -%d\n", per.resistanceStandard3);
					health -= per.healthStandard3;
					resistance -= per.resistanceStandard3;
				}

			} else if (dayChoice == 3) { // 운동가기

				if (per.select > 0 && per.select < 40) {
					System.out.println("운동을 갔는데 마스크를 깜빡했다!");
					System.out.printf("마스크가 없어 저항력 -%d!\n", per.resistanceStandard3);
					resistance -= per.resistanceStandard3;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("3대 1000!!!");
					System.out.printf("체력 +%d!!!!!!\n", per.healthStandard3);
					System.out.printf("저항력 +%d!!!!!!\n", per.resistanceStandard3);
					health += per.healthStandard3;
					resistance += per.resistanceStandard3;

				} else if (per.select > 80 && per.select < 120) {
					System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
					System.out.printf("맛있게 먹었지만 체중이 증가해 체력 -%d\n", per.healthStandard3);
					health -= per.healthStandard3;

				}
			}

			status(choice, nurse, athlete, student, health, resistance);// 매턴 스탯을 보여준다.
			check(per, choice, resistance); // 감염여부를 매턴 보여주는 메소드 //확률을 계산해서 코로나 감염 여부와 위험 정도 표시.

			resistance = 0; // 추가 및 감소 저항력 초기화
			health = 0; // 추가 및 감소 체력 초기화
			month++; // 1달씩 증가

		}
	}

	private static void check(Percentage per, int choice, int resistance) {
		int check = per.RePercentage(resistance, choice); // 코로나 감염여부 확인하기.
		if (check == 0) {
			System.out.println("코로나에 감염되셨습니다");
		} else if (check == 1) {
			System.out.println("무사히 하루를 보내셨습니다.");
		} else if (check == 2) {
			System.out.println("===== 경고 =====");
			System.out.println("현재 당신의 저항력은 위험수준 입니다.");
			System.out.println("==============");
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