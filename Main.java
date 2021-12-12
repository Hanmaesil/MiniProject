import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Nurse nu = new Nurse(); // ��ȣ�� Ŭ����
		Athlete at = new Athlete(); // ����� Ŭ����
		Student stu = new Student(); // ����л� Ŭ����
		Percentage per = new Percentage(); // Ȯ���� ��ġ�� Ŭ����

		Character nurse = nu; // ��ĳ����
		Character athlete = at; // ��ĳ����
		Character student = stu; // ��ĳ����

		int choice; // ĳ���� �����ϱ�
		int world; // ���� ����
		int finChoice; // ���� ����
		int cnt = 0; // while ���� ���������� ����.
		// ĳ���� ��ġ
		int health = 0; // �߰� �� ���ҵǴ� ü�¼�ġ ����
		int resistance = 0; // �߰� �� ���ҵǴ� ���׷� ����

		while (true) { // ĳ���� �����ϱ�!
			System.out.println("===== ĳ���͸� �����ϼ��� ======");
			System.out.print("1. ��ȣ�� 2. ����� 3. ����л� >>>>");
			choice = sc.nextInt(); // ĳ���͸� ���ÿ�.
			if (choice == 1) {
				System.out.println("��ȣ��� �������� �����Ͽ� �ٸ� ĳ���ͺ��� �ڷγ� �������׷��� �����ϴ�!.");
				nurse.selectCharcter(); // ������ �����ش�.
				System.out.print("1. ���� 2. �ڷΰ���. >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (choice == 2) {
				System.out.println("������� ö���� �������� �ٸ� ĳ���ͺ��� ü���� �����ϴ�!");
				athlete.selectCharcter(); // ������ �����ش�.
				System.out.print("1. ���� 2. �ڷΰ���. >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (choice == 3) {
				System.out.println("����л��� �ڷγ� ������� �Ѵ��� ��ŵ �����մϴ�!.");
				student.selectCharcter(); // ������ �����ش�.
				System.out.print("1. ���� 2. �ڷΰ��� >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else {
				System.out.println("�ٽ� �����ϼ���!");
			}
			if (cnt != 0) {
				System.out.println("���ÿϷ�.");
				cnt = 0;
				break;
			}

		}

		while (true) { // ���������ϱ�.
			System.out.println("===== ���� ���� =====");
			System.out.print("1. ������ 2. ����� 3. ������ �θ޻�� >>>>");
			world = sc.nextInt();

			if (world == 1) {
				System.out.println("�������� �ٸ��������� �ڷγ��� �ɸ� Ȯ���� �����ϴ�.");
				System.out.print("1. ���� 2. �ڷΰ��� >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (world == 2) {
				System.out.println("������� �����Ǻ��� �ڷγ��� �ɸ� Ȯ���� ������ ������ �����̴ϴ�.");
				System.out.println("1. ���� 2. �ڷΰ��� >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else if (world == 3) {
				System.out.println("������ �θ޻���� �ڷγ��� ���� ���� ���ϴ� û�������Դϴ�.");
				System.out.print("1. ���� 2. �ڷΰ��� >>>>");
				finChoice = sc.nextInt();
				if (finChoice == 1) {
					cnt++;
				}
			} else {
				System.out.println("�ٽ� �����ϼ���!");
			}
			if (cnt != 0) {
				System.out.println("���ÿϷ�.");
				cnt = 0;
				break;
			}

		}
		status(choice, nurse, athlete, student, health, resistance); // ĳ������ ����â�� �����ִ� �޼ҵ�

		int month = 1; // 1, 2, 3 ... 12��° ��
		int day = 1; // ��ħ ���� ���� ������.

	
		int dayChoice; // ������ ���� ����
		while (true) {
			System.out.println("������ ���� ��Ƴ����ʽÿ�.");  //��ũ��Ʈ ���� Ŭ������ ����

			if (month == 1) {
				System.out.println("1��");
				System.out.println("�������� ������");
				System.out.print("1. 10�� ���ڰ� ����ϱ�, 2. �İ� ����ϱ� 3. ��԰� ����ϱ� >>>>");
				dayChoice = sc.nextInt();
				if (dayChoice == 1) {
					if (per.select > 0 && per.select < 40) {
						System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
						System.out.printf("��ǿ��� �̲����� ü�� -%d!\n", per.healthStandard1); //�������� �ٽ� �̴¹�� ã�ƺ���
						health -= per.healthStandard1;
						} 
					else if (per.select > 40 && per.select < 80) {
						System.out.println("������ �ڰ� ��������� ��������� ��������� �Ǿ���!");
						System.out.printf("ǫ �ڰ� �Ͼ�� ü�� +%d!\n", per.healthStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // �̺�Ʈ
							System.out.printf("�߰��� ���׷� +%d!!!", per.resistanceStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("�����Ͽ� �������� ��翡�� �ô޷ȴ�.");
						System.out.printf("�������� Ÿ������ ü�� -%d\n", per.healthStandard1);
						health -= per.healthStandard1;
						
					}

				} else if (dayChoice == 2) {

				} else if (dayChoice == 3) {

				}
			}
			System.out.println("�������� ������");
			System.out.print("1. �����Ĵ簡�� 2. ���� ã�ư��� 3. «���� ��ϱ� >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) {
				if (per.select > 0 && per.select < 40) {
					System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
					System.out.printf("��ǿ��� �̲����� ü�� -%d!\n", per.healthStandard2);
					health -= per.healthStandard2;
					
				} else if (per.select > 40 && per.select < 80) {
					System.out.println("������ �ڰ� ��������� ��������� ��������� �Ǿ���!");
					System.out.printf("ǫ �ڰ� �Ͼ�� ü�� +%d!\n", per.healthStandard2);
					health += per.healthStandard2;
					if (per.select > 60 && per.select < 70) { // �̺�Ʈ
						System.out.printf("�߰��� ���׷� +%d!!!", per.resistanceStandard2);
						resistance += per.resistanceStandard2;
						
					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("�����Ͽ� �������� ��翡�� �ô޷ȴ�.");
					System.out.printf("�������� Ÿ������ ü�� -%d\n", per.healthStandard2);
					health -= per.healthStandard2;
					
				}

			} else if (dayChoice == 2) {

			} else if (dayChoice == 3) {

			}
			
			System.out.println("�������� ������");
			System.out.print("1. Į���ϰ� ǫ ����! 2. ģ�������� 3. ����� >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) {
				if (per.select > 0 && per.select < 40) {
					System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
					System.out.printf("��ǿ��� �̲����� ü�� -%d!\n", per.healthStandard3);
					health -= per.healthStandard3;
					
				} else if (per.select > 40 && per.select < 80) {
					System.out.println("������ �ڰ� ��������� ��������� ��������� �Ǿ���!");
					System.out.printf("ǫ �ڰ� �Ͼ�� ü�� +%d!\n", per.healthStandard3);
					health += per.healthStandard3;
					if (per.select > 60 && per.select < 70) { // �̺�Ʈ
						System.out.printf("�߰��� ���׷� +%d!!!", per.resistanceStandard3);
						resistance += per.resistanceStandard3;
						
					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("�����Ͽ� �������� ��翡�� �ô޷ȴ�.");
					System.out.printf("�������� Ÿ������ ü�� -%d\n", per.healthStandard3);
					health -= per.healthStandard3;
					
				}

			} else if (dayChoice == 2) {

			} else if (dayChoice == 3) {

			}
			
			status(choice, nurse, athlete, student, health, resistance);
			break;
			
		}
		
		
		
		
	}

	// ĳ������ ����â�� �����ִ� �޼ҵ�.
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
