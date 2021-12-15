package minimini;

import java.util.Random;
import java.util.Scanner;

public class 두메산골간호사스크립트 {
	Random ran = new Random();
	Scanner in = new Scanner(System.in);

	public void dume_morning() {
		int rancnt = ran.nextInt(3);
		System.out.println("아침에 무엇을 할 건가요?");
		System.out.println("1. 출근하기 2. 밥 먹고 출근하기 3. 10분 더 자고 지각하기");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("피곤해 ㅠㅠ 출근하기 싫어");
				System.out.println("체력이 %d 감소");
				System.out.println("기분이 안좋아져서 면역력 %d 감소");
			} else if (rancnt == 1) {
				System.out.println("출근하는 길에 귀여운 고양이를 봤다");
				System.out.println("기분이 좋아져서 면역력 %d 증가");
			} else {
				System.out.println("출근하려는데 원장님을 만났다");
				System.out.println("원장님이 차를 태워주셨다");
				System.out.println("편하게 출근했다 체력이 %d 증가");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("밥을 너무 급하게 먹다가 체했다!");
				System.out.println("체력이 %d 감소");
			} else if (rancnt == 1) {
				System.out.println("강원도 감자로 해먹는 감자짜글이");
				System.out.println("완전 밥도둑이잖아?");
				System.out.println("체력이 %d 증가");
				System.out.println("기분이 좋아져서 면역력 %d 증가");
			} else {
				System.out.println("상한 밥을 먹어서 배가 꾸르륵 거린다 ㅠ");
				System.out.println("면역력 %d 감소");
			}

		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("지각을 했는데 아무도 눈치채지 못했다!");
				System.out.println("10분 더자서 피로가 풀렸다");
				System.out.println("체력이 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("지각해서 원장님한테 된통 깨졌다ㅜㅜ");
				System.out.println("잔소리 30분 들어서 기분이 안좋아졌다...");
				System.out.println("면역력 %d 감소");
			} else {
				System.out.println("10분 더 잔다는게 2시간 더 자버렸다");
				System.out.println("부재중 15통...");
				System.out.println("온 몸에 식은땀이 흐른다...");
				System.out.println("피로가 싹풀려서 체력 %d 증가");
				System.out.println("면역력 %d 감소");
			}
		}
	}

	public void dume_afternoon() {
		int rancnt = ran.nextInt(3);

		System.out.println("점심엔 무엇을 할까요?");
		System.out.println("1. 밥먹기 2. 낮잠자기 3. 마을회관에서 수다떨기");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("두메산골 최고의 맛집에서 밥 먹었다");
				System.out.println("체력이 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("밥 먹으러 갔는데 밥집이 없어서 30분 걸어갔다");
				System.out.println("힘들어 ㅠㅠ");
				System.out.println("체력이 %d 감소");
			} else {
				System.out.println("마을회관에 잔치가 있어서 거기서 점심을 먹었다");
				System.out.println("마을 어르신들이 막걸리르ㄹ 너무 많이 주셔ㅅ서ㄴ취해띠..");
				System.out.println("면역력 %d 감소");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("너무피곤해~ 밥은 스킵한다");
				System.out.println("zzZZ~ 음 개운하다!");
				System.out.println("체력이 %d 증가");

			} else if (rancnt == 1) {
				System.out.println("낮잠 자서 개운하긴한데 너무 배고파서 힘이 없다...");
				System.out.println("체력이 %d 감소");
			} else {
				System.out.println("낮잠자려는데 원장님이 깨워서 심부름을 시켰다");
				System.out.println(" ^_^ 하늘같은 원장님 말은 들어야지");
				System.out.println("피곤해 체력 %d 감소");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("마을 어르신들한테 이쁨받는다");
				System.out.println("용돈도 쥐어주신다");
				System.out.println("기분 최고조 면역력 %d 증가!");
			} else if (rancnt == 1) {
				System.out.println("마을 어르신들한테 결혼은 언제해? 라떼는 말야 콤보를 맞았다");
				System.out.println("마을회관에서 도망쳤다!");
				System.out.println("기분이 안좋아 면역력 %d 감소");
			} else {
				System.out.println("마을회관 가는길에 옆집 아주머니한테 붙잡혔다");
				System.out.println("아주머니한테 1시간 동안 잔소리를 들었다");
				System.out.println("피곤해 체력 %d 감소");
			}
		}

	}

	public void dume_night() {
		int rancnt = ran.nextInt(3);

		System.out.println("밤엔 무엇을 할까요?");
		System.out.println("1. 잠자기 2. 술마시기 3. 넷플릭스보기");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("푹 잤다");
				System.out.println("아이 개운혀유우~");
				System.out.println("체력 %d 증가");
				System.out.println("면역력 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("잠 자다가 가위에 눌렸다!");
				System.out.println("귀신 무서웡!");
				System.out.println("피곤하다 체력 %d 감소");
			} else {
				System.out.println("보일러가 고장났나 방이 너무 춥다");
				System.out.println("오들오들 떨면서 잤다 감기 걸렸나..?");
				System.out.println("면역력 %d 감소");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("역시 알코올은 영원한 친구");
				System.out.println("소주로 몸과 마음을 소독했다");
				System.out.println("면역력 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("음... 여긴 어디지..?");
				System.out.println("내가.. 집에 어떻게 들어왔더라...?");
				System.out.println("술을 너무 마셔서 머리가 깨질 것 같다");
				System.out.println("체력 %d 감소");
			} else {
				System.out.println("친구들과 술한잔 크으");
				System.out.println("이 맛에 살지!");
				System.out.println("체력 %d 증가");
				System.out.println("면역력 %d 증가");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("역시 집에서 넷플릭스 보는게 최고지~");
				System.out.println("체력이 %d 증가");
				System.out.println("방역수칙도 지켜 면역력 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("아니 시간이 벌써..?");
				System.out.println("넷플릭스 보다가 늦잠이다!");
				System.out.println("피곤해 ㅠㅠ 체력이 %d 감소");
			} else {
				System.out.println("넷플릭스 보다가 집청소를 하나도 안했다");
				System.out.println("집안에 파리가 꼬인다");
				System.out.println("면역력 %d 감소");
			}
		}

	}

	public void dume_거리두기morning() {
		int rancnt = ran.nextInt(3);
		System.out.println("아침에 무엇을 할 건가요?");
		System.out.println("1. 출근하기 2. 밥 먹고 출근하기 3. 10분 더 자고 지각하기");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("기껏 출근했는데 마스크를 안가지고 왔다!");
				System.out.println("다시 집에 가서 마스크를 가져왔다...");
				System.out.println("체력이 %d 감소");
				System.out.println("기분이 안좋아져서 면역력 %d 감소");
			} else if (rancnt == 1) {
				System.out.println("출근하는 길에 귀여운 고양이를 봤다");
				System.out.println("기분이 좋아져서 면역력 %d 증가");
			} else {
				System.out.println("출근하려는데 원장님을 만났다");
				System.out.println("원장님이 차를 태워주셨다");
				System.out.println("편하게 출근했다 체력이 %d 증가");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("거리두기 때문에 밥집이 문을 닫았다...");
				System.out.println("배고파!");
				System.out.println("체력이 %d 감소");
			} else if (rancnt == 1) {
				System.out.println("강원도 감자로 해먹는 감자짜글이");
				System.out.println("완전 밥도둑이잖아?");
				System.out.println("체력이 %d 증가");
				System.out.println("기분이 좋아져서 면역력 %d 증가");
			} else {
				System.out.println("상한 밥을 먹어서 배가 꾸르륵 거린다 ㅠ");
				System.out.println("면역력 %d 감소");
			}

		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("지각을 했는데 아무도 눈치채지 못했다!");
				System.out.println("10분 더자서 피로가 풀렸다");
				System.out.println("체력이 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("지각해서 원장님한테 된통 깨졌다ㅜㅜ");
				System.out.println("잔소리 30분 들어서 기분이 안좋아졌다...");
				System.out.println("면역력 %d 감소");
			} else {
				System.out.println("10분 더 잔다는게 2시간 더 자버렸다");
				System.out.println("부재중 15통...");
				System.out.println("온 몸에 식은땀이 흐른다...");
				System.out.println("피로가 싹풀려서 체력 %d 증가");
				System.out.println("면역력 %d 감소");
			}
		}
	}

	public void dume_거리두기afternoon() {
		int rancnt = ran.nextInt(3);

		System.out.println("점심엔 무엇을 할까요?");
		System.out.println("1. 밥먹기 2. 낮잠자기 3. 마을회관에서 수다떨기");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("두메산골 최고의 맛집에서 밥 먹었다");
				System.out.println("체력이 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("거리두기 때문에 밥집이 다 문을 닫아 헛 걸음만 했다");
				System.out.println("힘들어 ㅠㅠ");
				System.out.println("체력이 %d 감소");
			} else {
				System.out.println("마을회관에 잔치가 있어서 거기서 점심을 먹었다");
				System.out.println("마을 어르신들이 막걸리르ㄹ 너무 많이 주셔ㅅ서ㄴ취해띠..");
				System.out.println("면역력 %d 감소");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("너무피곤해~ 밥은 스킵한다");
				System.out.println("zzZZ~ 음 개운하다!");
				System.out.println("체력이 %d 증가");

			} else if (rancnt == 1) {
				System.out.println("낮잠 자서 개운하긴한데 너무 배고파서 힘이 없다...");
				System.out.println("체력이 %d 감소");
			} else {
				System.out.println("낮잠자려는데 원장님이 깨워서 심부름을 시켰다");
				System.out.println(" ^_^ 하늘같은 원장님 말은 들어야지");
				System.out.println("피곤해 체력 %d 감소");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("마을 어르신들한테 이쁨받는다");
				System.out.println("용돈도 쥐어주신다");
				System.out.println("기분 최고조 면역력 %d 증가!");
			} else if (rancnt == 1) {
				System.out.println("마을 어르신들한테 결혼은 언제해? 라떼는 말야 콤보를 맞았다");
				System.out.println("마을회관에서 도망쳤다!");
				System.out.println("기분이 안좋아 면역력 %d 감소");
			} else {
				System.out.println("마을회관 사람들이 마스크를 안끼고 대화를 한다");
				System.out.println("거리두기 법 위반!");
				System.out.println("면역력 %d 감소");
			}
		}

	}

	public void dume_거리두기night() {
		int rancnt = ran.nextInt(3);

		System.out.println("밤엔 무엇을 할까요?");
		System.out.println("1. 잠자기 2. 술마시기 3. 넷플릭스보기");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("푹 잤다");
				System.out.println("아이 개운혀유우~");
				System.out.println("체력 %d 증가");
				System.out.println("면역력 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("잠 자다가 가위에 눌렸다!");
				System.out.println("귀신 무서웡!");
				System.out.println("피곤하다 체력 %d 감소");
			} else {
				System.out.println("보일러가 고장났나 방이 너무 춥다");
				System.out.println("오들오들 떨면서 잤다 감기 걸렸나..?");
				System.out.println("면역력 %d 감소");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("역시 알코올은 영원한 친구");
				System.out.println("소주로 몸과 마음을 소독했다");
				System.out.println("면역력 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("음... 여긴 어디지..?");
				System.out.println("내가.. 집에 어떻게 들어왔더라...?");
				System.out.println("술을 너무 마셔서 머리가 깨질 것 같다");
				System.out.println("체력 %d 감소");
			} else {
				System.out.println("친구들과 술한잔 크으");
				System.out.println("이 맛에 살지!");
				System.out.println("체력 %d 증가");
				System.out.println("거리두기 수칙 위반했다 면역력 %d 감소");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("역시 집에서 넷플릭스 보는게 최고지~");
				System.out.println("체력이 %d 증가");
				System.out.println("방역수칙도 지켜 면역력 %d 증가");
			} else if (rancnt == 1) {
				System.out.println("아니 시간이 벌써..?");
				System.out.println("넷플릭스 보다가 늦잠이다!");
				System.out.println("피곤해 ㅠㅠ 체력이 %d 감소");
			} else {
				System.out.println("넷플릭스 보다가 집청소를 하나도 안했다");
				System.out.println("집안에 파리가 꼬인다");
				System.out.println("면역력 %d 감소");
			}
		}
	}

}
