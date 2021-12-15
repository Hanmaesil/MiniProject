package minimini;

import java.util.Random;

public class 스크립트도시지방 {
	//간호사랑 운동선수
	Random ran = new Random();

	
	//month 가 369는 사회적 거리두기 스크립트, 나머지는 일반 스크립트
	
	
	// 간호사 선택지
		// 아침
		// 1. 10분 더자고 출근하기 2. 씻고 출근하기 3. 밥먹고 출근하기
		// 점심
		// 1. 구내식당가기 2. 맛집 찾아가기 3. 짬내서 운동하기
		// 저녁
		// 1. 칼퇴하고 푹쉬기 2. 친구만나기 3. 운동가기
		
	public int NurseMoring1(int month) { // 리턴값을 줘서 그 리턴값에 맞게 체력이나 저항력 증가 및 감소

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자 
			} else if (select == 1) {
				System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자
			} else if (select == 1) {
				System.out.println("늦잠을 잤지만 사회적 거리두기로 재택근무를 하였다.");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseMoring2(int month) {

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 "); // 체력 감소
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 "); // 저항력 증가

			} else if (select == 2) {
				System.out.println("부지런히 씻고 무사히 출근!");
				System.out.printf("정시출근으로 체력 "); // 체력 증가
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 ");
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 ");
			} else if (select == 2) {
				System.out.println("급하게 씻고 나오느라 마스크를 못 챙겼다");
				System.out.printf("마스크가 없어 저항력 "); // 저항력 감소
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseMoring3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("밥을 급하게 먹어 체해버렸다!");
			System.out.print("속이 답답해서 체력 "); // 체력감소
		} else if (select == 1) {
			System.out.println("아침엔 고기지!");
			System.out.print("속이 든든해서 체력 "); // 체력 증가
			System.out.print("추가로 저항력 "); //저항력 증가
		} else if (select == 2) {
			System.out.println("밥을 든든히 먹은후엔 아이스 아메리카노지!");
			System.out.print("카페인 섭취로 인한 저항력 "); //저항력 증가
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("밥을 급하게 먹어 체해버렸다!");
			System.out.print("속이 답답해서 체력 ");
		} else if (select == 1) {
			System.out.println("아침엔 고기지!");
			System.out.print("속이 든든해서 체력 ");
			System.out.print("추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("출근길에 자주가는 카페가 코로나로 인해 망했다");
			System.out.print("카페인 섭취를 못해 저항력 "); //저항력 감소
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseLaunch1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("구내식당 공사로 인해 점심을 못 먹었다.");
			System.out.print("쫄쫄 굶어 체력 "); // 체력 감소
		} else if (select == 1) {
			System.out.println("18첩 반상이 나왔다!");
			System.out.print("배불리 먹어 체력 "); // 체력 증가
			System.out.print("기분이 좋아져 추가로 저항력 "); //저항력 증가
		} else if (select == 2) {
			System.out.println("과식으로 인해 응급실로 실려갔다.");
			System.out.print("응급실에 가서 저항력 "); //저항력 감소
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("구내식당 공사로 인해 점심을 못 먹었다.");
			System.out.print("쫄쫄 굶어 체력 ");
		} else if (select == 1) {
			System.out.println("코로나가 심해져 칸칸이 띄어 앉았다");
			System.out.println("혼자 먹기 외로워 저항력 ");// 저항력 감소
		} else if (select == 2) {
			System.out.println("과식으로 인해 응급실로 실려갔다.");
			System.out.print("응급실에 가서 저항력 ");
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseLaunch2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("맛집을 갔는데 웨이팅이 길어 밥을 못먹었다.");
			System.out.print("쫄쫄 굶어 체력 "); //체력 감소
		} else if (select == 1) {
			System.out.println("......겁나 맛있어");
			System.out.print("배불리 먹어 체력 "); //체력 증가
			System.out.print("하지만 저항력은 "); //저항력 감소
		} else if (select == 2) {
			System.out.println("맛집의 행운권에 당첨되어 한달 무료 이용권을 얻었다!");
			System.out.print("기분이 좋아져 저항력 "); //저항력 증가
		}
		return select;
	} else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("맛집을 갔는데 웨이팅이 길어 밥을 못먹었다.");
			System.out.print("쫄쫄 굶어 체력 ");
		} else if (select == 1) {
			System.out.println("......겁나 맛있어");
			System.out.print("배불리 먹어 체력 ");
			System.out.print("기분이 좋아져 추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("거리두기인데 맛집을 가??????");
			System.out.print("하?! "); //저항력 감소
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseLaunch3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("운동에 열중한 나머지 퇴근시간에 복귀했다!");
			System.out.print("상사에게 혼나 저항력 ");
		} else if (select == 1) {
			System.out.println("스쿼트 1000개!!!!!");
			System.out.print("근육이 너무 잘먹어 면역력 ");
			System.out.print("기분이 좋아져 추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("운동후엔 단백질쉐이크지!");
			System.out.printf("운동이 잘되서 면역력이 ");
		}
		return select;
	} else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("운동에 열중한 나머지 퇴근시간에 복귀했다!");
			System.out.print("상사에게 혼나 저항력 ");
		} else if (select == 1) {
			System.out.println("스쿼트 1000개!!!!!");
			System.out.print("근육이 너무 잘먹어 면역력 ");
			System.out.print("기분이 좋아져 추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("다중이용시설 이용 자제!!!!");
			System.out.printf("자제해라... ");//저항력 감소
		}
		return select;

	}else {
		return select;
	}
	}

	public int NurseNight1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		
		if (select == 0) {
			System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
			System.out.print("만원버스를 피해 체력이 "); // 체력증가
		} else if (select == 1) {
			System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 야근을 하게 되었다");
			System.out.print("망할 상사때문에 체력 "); // 체력 감소
			System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
			System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
			System.out.print("만원버스를 피해 체력이 "); // 체력증가
		} else if (select == 1) {
			System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 야근을 하게 되었다");
			System.out.print("망할 상사때문에 체력 "); // 체력 감소
			System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
			System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseNight2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("사람 많은 곳을 피해 친구 집으로 가서 술을 먹었다!");
			System.out.printf("사람 많은 곳을 피해 저항력이 "); // 저항력 증가
		} else if (select == 1) {
			System.out.println("친구를 만나느라 샤샤샤~");
			System.out.print("기분이 좋아져서 체력 "); // 체력증가
		} else if (select == 2) {
			System.out.println("이시국에 꼭 만나야 했을까...");
			System.out.print("체력 "); // 체력 감소
			System.out.print("저항력 "); // 저항력 감소
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("사람 많은 곳을 피해 친구 집으로 가서 술을 먹었다!");
			System.out.printf("사람 많은 곳을 피해 저항력이 "); // 저항력 증가
		} else if (select == 1) {
			System.out.println("친구를 만나느라 샤샤샤~");
			System.out.println("...는 무슨!"); //딜레이 주기
			System.out.print("방역수칙!!!! "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("이시국에 꼭 만나야 했을까...");
			System.out.print("체력 "); // 체력 감소
			System.out.print("저항력 "); // 저항력 감소
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseNight3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("운동을 갔는데 마스크를 깜빡했다!");
			System.out.print("마스크가 없어 저항력 "); // 저항력 감소
		} else if (select == 1) {
			System.out.println("3대 1000!!!");
			System.out.print("체력 "); // 체력 증가
			System.out.print("저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
			System.out.print("맛있게 먹었지만 체중이 증가해 체력 "); // 체력감소
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("운동을 갔는데 마스크를 깜빡했다!");
			System.out.print("마스크가 없어 저항력 "); // 저항력 감소
		} else if (select == 1) {
			System.out.println("3대 1000!!!");
			System.out.print("체력 "); // 체력 증가
			System.out.print("저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
			System.out.print("방역 수칙좀 지켜라! "); // 저항력감소
		}
		return select;
	}else {
		return select;
	}
	}
	
	//운동선수 선택지
	//아침
	//// 1. 10분 더자고 출근하기 2. 씻고 출근하기 3. 아침운동하기 //간호사랑 동일
	//점심 
	//1. 밥먹기 2. 운동하기 3. 재활치료
	//저녁
	//1. 칼퇴하고 푹쉬기 2. 친구만나기 3. 운동가기 
	
	
	public int AthleteMoring1(int month) { // 리턴값을 줘서 그 리턴값에 맞게 체력이나 저항력 증가 및 감소
		
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자 
			} else if (select == 1) {
				System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;
			
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자
			} else if (select == 1) {
				System.out.println("늦잠을 잤지만 사회적 거리두기로 재택근무를 하였다.");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;
		} else {
			return select;
		}
	}
	
	public int AthleteMoring2(int month) {
		
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 "); // 체력 감소
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 "); // 저항력 증가
				
			} else if (select == 2) {
				System.out.println("부지런히 씻고 무사히 출근!");
				System.out.printf("정시출근으로 체력 "); // 체력 증가
			}
			return select;
			
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 ");
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 ");
			} else if (select == 2) {
				System.out.println("급하게 씻고 나오느라 마스크를 못 챙겼다");
				System.out.printf("마스크가 없어 저항력 "); // 저항력 감소
			}
			return select;
		} else {
			return select;
		}
	}
	
	public int AthleteMoring3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("밥대신 운동이지!");
				System.out.print("배가 고파서 체력 "); // 체력감소
			} else if (select == 1) {
				System.out.println("아침엔 운동이지!!");
				System.out.print("운동을 든든히 해서 체력 "); // 체력 증가
				System.out.print("추가로 저항력 "); //저항력 증가
			} else if (select == 2) {
				System.out.println("운동을 했으면 단백질 쉐이크지!");
				System.out.print("단백질 쉐이크 섭취로 인한 체력 "); //체력 증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("밥대신 운동이지!");
				System.out.print("배가 고파서 체력 "); // 체력감소
			} else if (select == 1) {
				System.out.println("아침엔 운동이지!!");
				System.out.print("운동을 든든히 해서 체력 "); // 체력 증가
				System.out.print("추가로 저항력 "); //저항력 증가
			} else if (select == 2) {
				System.out.println("운동을 했으면 단백질 쉐이크지!");
				System.out.print("단백질 쉐이크 섭취로 인한 저항력 "); //체력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteLaunch1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("단골가게 공사로 인해 점심을 못 먹었다.");
				System.out.print("쫄쫄 굶어 체력 "); // 체력 감소
			} else if (select == 1) {
				System.out.println("닭가슴살! 단백질!!!");
				System.out.print("배불리 먹어 체력 "); // 체력 증가
				System.out.print("기분이 좋아져 추가로 저항력 "); //저항력 증가
			} else if (select == 2) {
				System.out.println("닭가슴살을 너무 먹어 응급실로 실려갔다.");
				System.out.print("응급실에 가서 저항력 "); //저항력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("단골가게 공사로 인해 점심을 못 먹었다.");
				System.out.print("쫄쫄 굶어 체력 ");
			} else if (select == 1) {
				System.out.println("코로나가 심해져 칸칸이 띄어 앉았다");
				System.out.println("혼자 먹기 외로워 저항력 ");// 저항력 감소
			} else if (select == 2) {
				System.out.println("과식으로 인해 응급실로 실려갔다.");
				System.out.print("응급실에 가서 저항력 ");
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteLaunch2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("후하후하! 후하후하!");
				System.out.print("밥대신 운동이지! "); //체력 증가
			} else if (select == 1) {
				System.out.println("후하후하! 후하후하!");
				System.out.print("밥대신 운동이지! "); //체력 증가
			} else if (select == 2) {
				System.out.println("3대 1000 도저언!!!!");
				System.out.print("허리를 삐끗해 체력 "); //체력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("후하후하! 후하후하!");
				System.out.print("밥대신 운동이지! "); //체력 증가
			} else if (select == 1) {
				System.out.println("마스크를 깜빡하여 운동을 가다 경찰 단속에 걸렸다.");
				System.out.print("한번만 봐주세요....ㅠㅠ "); //저항력 감소
			} else if (select == 2) {
				System.out.println("3대 1000 도저언!!!!");
				System.out.print("허리를 삐끗해 체력 "); //체력 감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteLaunch3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("평소에 안좋았던 허리를 재활치료 받았다!");
				System.out.print("뻐근한게 해결되어 체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("스쿼트 1000개!!!!!... 하시면 안되다고요!!!");
				System.out.print("치료사에게 혼나 저항력 "); //저항력 감소
			} else if (select == 2) {
				System.out.println("운동후엔 단백질쉐이크지! ...운동 하지 말라고요!!!");
				System.out.printf("치료사에게 혼나 체력 "); // 체력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("병원에 마스크를 안쓴 환자가 출연했다!");
				System.out.print("방역수칙좀.... "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("스쿼트 1000개!!!!!... 하시면 안되다고요!!!");
				System.out.print("치료사에게 혼나 저항력 "); //저항력 감소
			} else if (select == 2) {
				System.out.println("운동후엔 단백질쉐이크지! ...운동 하지 말라고요!!!");
				System.out.printf("치료사에게 혼나 체력 "); // 체력 감소
			}
			return select;
			
		}else {
			return select;
		}
	}
	
	public int AthleteNight1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			
			if (select == 0) {
				System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
				System.out.print("만원버스를 피해 체력이 "); // 체력증가
			} else if (select == 1) {
				System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 잔업을 하게 되었다");
				System.out.print("망할 상사때문에 체력 "); // 체력 감소
				System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
				System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
				System.out.print("만원버스를 피해 체력이 "); // 체력증가
			} else if (select == 1) {
				System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 잔업을 하게 되었다");
				System.out.print("망할 상사때문에 체력 "); // 체력 감소
				System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
				System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteNight2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("친구는 무슨! 운동이 내 친구다!!!");
				System.out.printf("운동을 해서 체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.print("기분이 좋아져서 체력 "); // 체력증가
			} else if (select == 2) {
				System.out.println("이시국에 꼭 만나야 했을까...");
				System.out.print("체력 "); // 체력 감소
				System.out.print("저항력 "); // 저항력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("친구는 무슨! 운동이 내 친구다!!!");
				System.out.printf("운동을 해서 체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.println("...는 무슨!"); //딜레이 주기
				System.out.print("방역수칙!!!! "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("이시국에 꼭 만나야 했을까...");
				System.out.print("체력 "); // 체력 감소
				System.out.print("저항력 "); // 저항력 감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteNight3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("운동을 갔는데 마스크를 깜빡했다!");
				System.out.print("마스크가 없어 저항력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("3대 1000!!!");
				System.out.print("체력 "); // 체력 증가
				System.out.print("저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
				System.out.print("맛있게 먹었지만 체중이 증가해 체력 "); // 체력감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("운동을 갔는데 마스크를 깜빡했다!");
				System.out.print("마스크가 없어 저항력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("3대 1000!!!");
				System.out.print("체력 "); // 체력 증가
				System.out.print("저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
				System.out.print("방역 수칙좀 지켜라! "); // 저항력감소
			}
			return select;
		}else {
			return select;
		}
	}

}
