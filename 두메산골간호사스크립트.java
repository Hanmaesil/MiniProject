package minimini;

import java.util.Random;
import java.util.Scanner;

public class �θ޻��ȣ�罺ũ��Ʈ {
	Random ran = new Random();
	Scanner in = new Scanner(System.in);

	public void dume_morning() {
		int rancnt = ran.nextInt(3);
		System.out.println("��ħ�� ������ �� �ǰ���?");
		System.out.println("1. ����ϱ� 2. �� �԰� ����ϱ� 3. 10�� �� �ڰ� �����ϱ�");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�ǰ��� �Ф� ����ϱ� �Ⱦ�");
				System.out.println("ü���� %d ����");
				System.out.println("����� ���������� �鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("����ϴ� �濡 �Ϳ��� ����̸� �ô�");
				System.out.println("����� �������� �鿪�� %d ����");
			} else {
				System.out.println("����Ϸ��µ� ������� ������");
				System.out.println("������� ���� �¿��̴ּ�");
				System.out.println("���ϰ� ����ߴ� ü���� %d ����");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� �ʹ� ���ϰ� �Դٰ� ü�ߴ�!");
				System.out.println("ü���� %d ����");
			} else if (rancnt == 1) {
				System.out.println("������ ���ڷ� �ظԴ� ����¥����");
				System.out.println("���� �䵵�����ݾ�?");
				System.out.println("ü���� %d ����");
				System.out.println("����� �������� �鿪�� %d ����");
			} else {
				System.out.println("���� ���� �Ծ �谡 �ٸ��� �Ÿ��� ��");
				System.out.println("�鿪�� %d ����");
			}

		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("������ �ߴµ� �ƹ��� ��ġä�� ���ߴ�!");
				System.out.println("10�� ���ڼ� �Ƿΰ� Ǯ�ȴ�");
				System.out.println("ü���� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�����ؼ� ��������� ���� �����٤̤�");
				System.out.println("�ܼҸ� 30�� �� ����� ����������...");
				System.out.println("�鿪�� %d ����");
			} else {
				System.out.println("10�� �� �ܴٴ°� 2�ð� �� �ڹ��ȴ�");
				System.out.println("������ 15��...");
				System.out.println("�� ���� �������� �帥��...");
				System.out.println("�Ƿΰ� ��Ǯ���� ü�� %d ����");
				System.out.println("�鿪�� %d ����");
			}
		}
	}

	public void dume_afternoon() {
		int rancnt = ran.nextInt(3);

		System.out.println("���ɿ� ������ �ұ��?");
		System.out.println("1. ��Ա� 2. �����ڱ� 3. ����ȸ������ ���ٶ���");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�θ޻�� �ְ��� �������� �� �Ծ���");
				System.out.println("ü���� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�� ������ ���µ� ������ ��� 30�� �ɾ��");
				System.out.println("����� �Ф�");
				System.out.println("ü���� %d ����");
			} else {
				System.out.println("����ȸ���� ��ġ�� �־ �ű⼭ ������ �Ծ���");
				System.out.println("���� ��ŵ��� ���ɸ����� �ʹ� ���� �ּŤ��������ض�..");
				System.out.println("�鿪�� %d ����");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�ʹ��ǰ���~ ���� ��ŵ�Ѵ�");
				System.out.println("zzZZ~ �� �����ϴ�!");
				System.out.println("ü���� %d ����");

			} else if (rancnt == 1) {
				System.out.println("���� �ڼ� �����ϱ��ѵ� �ʹ� ����ļ� ���� ����...");
				System.out.println("ü���� %d ����");
			} else {
				System.out.println("�����ڷ��µ� ������� ������ �ɺθ��� ���״�");
				System.out.println(" ^_^ �ϴð��� ����� ���� ������");
				System.out.println("�ǰ��� ü�� %d ����");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� ��ŵ����� �̻ݹ޴´�");
				System.out.println("�뵷�� ����ֽŴ�");
				System.out.println("��� �ְ��� �鿪�� %d ����!");
			} else if (rancnt == 1) {
				System.out.println("���� ��ŵ����� ��ȥ�� ������? �󶼴� ���� �޺��� �¾Ҵ�");
				System.out.println("����ȸ������ �����ƴ�!");
				System.out.println("����� ������ �鿪�� %d ����");
			} else {
				System.out.println("����ȸ�� ���±濡 ���� ���ָӴ����� ��������");
				System.out.println("���ָӴ����� 1�ð� ���� �ܼҸ��� �����");
				System.out.println("�ǰ��� ü�� %d ����");
			}
		}

	}

	public void dume_night() {
		int rancnt = ran.nextInt(3);

		System.out.println("�㿣 ������ �ұ��?");
		System.out.println("1. ���ڱ� 2. �����ñ� 3. ���ø�������");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("ǫ ���");
				System.out.println("���� ����������~");
				System.out.println("ü�� %d ����");
				System.out.println("�鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�� �ڴٰ� ������ ���ȴ�!");
				System.out.println("�ͽ� ������!");
				System.out.println("�ǰ��ϴ� ü�� %d ����");
			} else {
				System.out.println("���Ϸ��� ���峵�� ���� �ʹ� ���");
				System.out.println("������� ���鼭 ��� ���� �ɷȳ�..?");
				System.out.println("�鿪�� %d ����");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� ���ڿ��� ������ ģ��");
				System.out.println("���ַ� ���� ������ �ҵ��ߴ�");
				System.out.println("�鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("��... ���� �����..?");
				System.out.println("����.. ���� ��� ���Դ���...?");
				System.out.println("���� �ʹ� ���ż� �Ӹ��� ���� �� ����");
				System.out.println("ü�� %d ����");
			} else {
				System.out.println("ģ����� ������ ũ��");
				System.out.println("�� ���� ����!");
				System.out.println("ü�� %d ����");
				System.out.println("�鿪�� %d ����");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� ������ ���ø��� ���°� �ְ���~");
				System.out.println("ü���� %d ����");
				System.out.println("�濪��Ģ�� ���� �鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�ƴ� �ð��� ����..?");
				System.out.println("���ø��� ���ٰ� �����̴�!");
				System.out.println("�ǰ��� �Ф� ü���� %d ����");
			} else {
				System.out.println("���ø��� ���ٰ� ��û�Ҹ� �ϳ��� ���ߴ�");
				System.out.println("���ȿ� �ĸ��� ���δ�");
				System.out.println("�鿪�� %d ����");
			}
		}

	}

	public void dume_�Ÿ��α�morning() {
		int rancnt = ran.nextInt(3);
		System.out.println("��ħ�� ������ �� �ǰ���?");
		System.out.println("1. ����ϱ� 2. �� �԰� ����ϱ� 3. 10�� �� �ڰ� �����ϱ�");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�ⲯ ����ߴµ� ����ũ�� �Ȱ����� �Դ�!");
				System.out.println("�ٽ� ���� ���� ����ũ�� �����Դ�...");
				System.out.println("ü���� %d ����");
				System.out.println("����� ���������� �鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("����ϴ� �濡 �Ϳ��� ����̸� �ô�");
				System.out.println("����� �������� �鿪�� %d ����");
			} else {
				System.out.println("����Ϸ��µ� ������� ������");
				System.out.println("������� ���� �¿��̴ּ�");
				System.out.println("���ϰ� ����ߴ� ü���� %d ����");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�Ÿ��α� ������ ������ ���� �ݾҴ�...");
				System.out.println("�����!");
				System.out.println("ü���� %d ����");
			} else if (rancnt == 1) {
				System.out.println("������ ���ڷ� �ظԴ� ����¥����");
				System.out.println("���� �䵵�����ݾ�?");
				System.out.println("ü���� %d ����");
				System.out.println("����� �������� �鿪�� %d ����");
			} else {
				System.out.println("���� ���� �Ծ �谡 �ٸ��� �Ÿ��� ��");
				System.out.println("�鿪�� %d ����");
			}

		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("������ �ߴµ� �ƹ��� ��ġä�� ���ߴ�!");
				System.out.println("10�� ���ڼ� �Ƿΰ� Ǯ�ȴ�");
				System.out.println("ü���� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�����ؼ� ��������� ���� �����٤̤�");
				System.out.println("�ܼҸ� 30�� �� ����� ����������...");
				System.out.println("�鿪�� %d ����");
			} else {
				System.out.println("10�� �� �ܴٴ°� 2�ð� �� �ڹ��ȴ�");
				System.out.println("������ 15��...");
				System.out.println("�� ���� �������� �帥��...");
				System.out.println("�Ƿΰ� ��Ǯ���� ü�� %d ����");
				System.out.println("�鿪�� %d ����");
			}
		}
	}

	public void dume_�Ÿ��α�afternoon() {
		int rancnt = ran.nextInt(3);

		System.out.println("���ɿ� ������ �ұ��?");
		System.out.println("1. ��Ա� 2. �����ڱ� 3. ����ȸ������ ���ٶ���");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�θ޻�� �ְ��� �������� �� �Ծ���");
				System.out.println("ü���� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�Ÿ��α� ������ ������ �� ���� �ݾ� �� ������ �ߴ�");
				System.out.println("����� �Ф�");
				System.out.println("ü���� %d ����");
			} else {
				System.out.println("����ȸ���� ��ġ�� �־ �ű⼭ ������ �Ծ���");
				System.out.println("���� ��ŵ��� ���ɸ����� �ʹ� ���� �ּŤ��������ض�..");
				System.out.println("�鿪�� %d ����");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("�ʹ��ǰ���~ ���� ��ŵ�Ѵ�");
				System.out.println("zzZZ~ �� �����ϴ�!");
				System.out.println("ü���� %d ����");

			} else if (rancnt == 1) {
				System.out.println("���� �ڼ� �����ϱ��ѵ� �ʹ� ����ļ� ���� ����...");
				System.out.println("ü���� %d ����");
			} else {
				System.out.println("�����ڷ��µ� ������� ������ �ɺθ��� ���״�");
				System.out.println(" ^_^ �ϴð��� ����� ���� ������");
				System.out.println("�ǰ��� ü�� %d ����");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� ��ŵ����� �̻ݹ޴´�");
				System.out.println("�뵷�� ����ֽŴ�");
				System.out.println("��� �ְ��� �鿪�� %d ����!");
			} else if (rancnt == 1) {
				System.out.println("���� ��ŵ����� ��ȥ�� ������? �󶼴� ���� �޺��� �¾Ҵ�");
				System.out.println("����ȸ������ �����ƴ�!");
				System.out.println("����� ������ �鿪�� %d ����");
			} else {
				System.out.println("����ȸ�� ������� ����ũ�� �ȳ��� ��ȭ�� �Ѵ�");
				System.out.println("�Ÿ��α� �� ����!");
				System.out.println("�鿪�� %d ����");
			}
		}

	}

	public void dume_�Ÿ��α�night() {
		int rancnt = ran.nextInt(3);

		System.out.println("�㿣 ������ �ұ��?");
		System.out.println("1. ���ڱ� 2. �����ñ� 3. ���ø�������");
		String choice = in.next();
		if (choice.equals("1")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("ǫ ���");
				System.out.println("���� ����������~");
				System.out.println("ü�� %d ����");
				System.out.println("�鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�� �ڴٰ� ������ ���ȴ�!");
				System.out.println("�ͽ� ������!");
				System.out.println("�ǰ��ϴ� ü�� %d ����");
			} else {
				System.out.println("���Ϸ��� ���峵�� ���� �ʹ� ���");
				System.out.println("������� ���鼭 ��� ���� �ɷȳ�..?");
				System.out.println("�鿪�� %d ����");
			}
		} else if (choice.equals("2")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� ���ڿ��� ������ ģ��");
				System.out.println("���ַ� ���� ������ �ҵ��ߴ�");
				System.out.println("�鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("��... ���� �����..?");
				System.out.println("����.. ���� ��� ���Դ���...?");
				System.out.println("���� �ʹ� ���ż� �Ӹ��� ���� �� ����");
				System.out.println("ü�� %d ����");
			} else {
				System.out.println("ģ����� ������ ũ��");
				System.out.println("�� ���� ����!");
				System.out.println("ü�� %d ����");
				System.out.println("�Ÿ��α� ��Ģ �����ߴ� �鿪�� %d ����");
			}
		} else if (choice.equals("3")) {
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("���� ������ ���ø��� ���°� �ְ���~");
				System.out.println("ü���� %d ����");
				System.out.println("�濪��Ģ�� ���� �鿪�� %d ����");
			} else if (rancnt == 1) {
				System.out.println("�ƴ� �ð��� ����..?");
				System.out.println("���ø��� ���ٰ� �����̴�!");
				System.out.println("�ǰ��� �Ф� ü���� %d ����");
			} else {
				System.out.println("���ø��� ���ٰ� ��û�Ҹ� �ϳ��� ���ߴ�");
				System.out.println("���ȿ� �ĸ��� ���δ�");
				System.out.println("�鿪�� %d ����");
			}
		}
	}

}
