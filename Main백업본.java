
import java.util.Scanner;

public class Main����� {

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
			System.out.println("������ ���� ��Ƴ����ʽÿ�."); // ��ũ��Ʈ ���� Ŭ������ ����
			
			if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11 || month == 12) {
				System.out.println(month + "��");
				System.out.println("===== ��ħ =====");
				System.out.println("�������� ������");
				System.out.print("1. 10�� ���ڰ� ����ϱ�, 2. �İ� ����ϱ� 3. ��԰� ����ϱ� >>>>");
				dayChoice = sc.nextInt();
				if (dayChoice == 1) { // 10�� ���ڰ� ����ϱ�
					if (per.select > 0 && per.select < 40) {
						System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
						System.out.printf("��ǿ��� �̲����� ü�� -%d!\n", per.healthStandard1); // �������� �ٽ� �̴¹�� ã�ƺ���
						health -= per.healthStandard1;
					} else if (per.select > 40 && per.select < 80) {
						System.out.println("������ �ڰ� ��������� ��������� ��������� �Ǿ���!");
						System.out.printf("ǫ �ڰ� �Ͼ�� ü�� +%d!\n", per.healthStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // �̺�Ʈ
							System.out.printf("�߰��� ���׷� +%d!!!\n", per.resistanceStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("�����Ͽ� �������� ��翡�� �ô޷����� ���Ž¸��Ͽ���!");
						System.out.printf("���Ž¸��� ���� ���׷� +%d\n", per.resistanceStandard1);
						resistance += per.resistanceStandard1;

					}

				} else if (dayChoice == 2) { // �İ� ����ϱ�
					if (per.select > 0 && per.select < 40) {
						System.out.println("��ǿ��� �ų��� �뷡 �θ��� �غ��ϴٰ� ���� �Ͽ���!");
						System.out.printf("��翡�� ȥ�� ü�� -%d!\n", per.healthStandard1); // �������� �ٽ� �̴¹�� ã�ƺ���
						health -= per.healthStandard1;
					} else if (per.select > 40 && per.select < 80) {
						System.out.println("�ǵ������� �Ҹ��� �������� �����ϰ� �ľ���!");
						System.out.printf("�����ϰ� �ľ ���׷� +%d!\n", per.resistanceStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // �̺�Ʈ
							System.out.printf("�߰��� ü�� +%d!!!\n", per.healthStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("�������� �İ� ������ ���!");
						System.out.printf("����������� ü�� +%d\n", per.healthStandard1);
						health += per.healthStandard1;

					}

				} else if (dayChoice == 3) { // ��԰� ����ϱ�
					if (per.select > 0 && per.select < 40) {
						System.out.println("���� ���ϰ� �Ծ� ü�ع��ȴ�!");
						System.out.printf("���� ����ؼ� ü�� -%d!\n", per.healthStandard1); // �������� �ٽ� �̴¹�� ã�ƺ���
						health -= per.healthStandard1;
					} else if (per.select > 40 && per.select < 80) {
						System.out.println("��ħ�� �����!");
						System.out.printf("���� ����ؼ� ü�� +%d!\n", per.healthStandard1);
						health += per.healthStandard1;
						if (per.select > 60 && per.select < 70) { // �̺�Ʈ
							System.out.printf("�߰��� ���׷� +%d!!!\n", per.resistanceStandard1);
							resistance += per.resistanceStandard1;
						}
					} else if (per.select > 80 && per.select < 120) {
						System.out.println("���� ����� �����Ŀ� ���̽� �Ƹ޸�ī����!");
						System.out.printf("ī���� ����� ���� ���׷� +%d\n", per.resistanceStandard1);
						resistance += per.resistanceStandard1;

					}

				}
			}
			System.out.println("===== ���� =====");
			System.out.println("�������� ������");
			System.out.print("1. �����Ĵ簡�� 2. ���� ã�ư��� 3. «���� ��ϱ� >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) { // �����Ĵ簡��
				if (per.select > 0 && per.select < 40) {
					System.out.println("�����Ĵ� ����� ���� ������ �� �Ծ���.");
					System.out.printf("���� ���� ü�� -%d!\n", per.healthStandard2);
					health -= per.healthStandard2;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("18ø �ݻ��� ���Դ�!");
					System.out.printf("��Ҹ� �Ծ� ü�� +%d!\n", per.healthStandard2);
					health += per.healthStandard2;
					if (per.select > 60 && per.select < 70) { // �̺�Ʈ
						System.out.printf("����� ������ �߰��� ���׷� +%d!!!\n", per.resistanceStandard2);
						resistance += per.resistanceStandard2;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("�������� ���� ���޽Ƿ� �Ƿ�����.");
					System.out.printf("���޽ǿ� ���� ���׷� -%d\n", per.resistanceStandard2);
					resistance -= per.resistanceStandard2;

				}

			} else if (dayChoice == 2) {// ���� ã�ư���
				if (per.select > 0 && per.select < 40) {
					System.out.println("������ ���µ� �������� ��� ���� ���Ծ���.");
					System.out.printf("���� ���� ü�� -%d!\n", per.healthStandard2);
					health -= per.healthStandard2;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("......�̳� ���־�");
					System.out.printf("��Ҹ� �Ծ� ü�� +%d!\n", per.healthStandard2);
					health += per.healthStandard2;
					if (per.select > 40 && per.select < 70) { // �̺�Ʈ
						System.out.printf("����� ������ �߰��� ���׷� +%d!!!\n", per.resistanceStandard2);
						resistance += per.resistanceStandard2;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("������ ���ǿ� ��÷�Ǿ� �Ѵ� ���� �̿���� �����!");
					System.out.printf("����� ������ ���׷� +%d\n", per.resistanceStandard2);
					resistance += per.resistanceStandard2;

				}

			} else if (dayChoice == 3) {// «���� ��ϱ�
				if (per.select > 0 && per.select < 40) {
					System.out.println("��� ������ ������ ��ٽð��� �����ߴ�!");
					System.out.printf("��翡�� ȥ�� ���׷� -%d!\n", per.resistanceStandard2);
					resistance -= per.resistanceStandard2;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("����Ʈ 1000��!!!!!");
					System.out.printf("������ �ʹ� �߸Ծ� �鿪�� +%d!\n", per.resistanceStandard2);
					resistance += per.resistanceStandard2;
					if (per.select > 50 && per.select < 70) { // �̺�Ʈ
						System.out.printf("����� ������ �߰��� ���׷� +%d!!!\n", per.resistanceStandard2);
						resistance += per.resistanceStandard2;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("��Ŀ� �ܹ�������ũ��!");
					System.out.printf("��� �ߵǼ� �鿪���� +%d\n", per.resistanceStandard2);
					resistance += per.resistanceStandard2;

				}

			}

			System.out.println("===== ���� =====");
			System.out.println("�������� ������");
			System.out.print("1. Į���ϰ� ǫ ����! 2. ģ�������� 3. ����� >>>>");
			dayChoice = sc.nextInt();
			if (dayChoice == 1) { // Į���ϰ� ǫ����
				if (per.select > 0 && per.select < 40) {
					System.out.println("������ īǮ�� ������ ���ϰ� ����!");
					System.out.printf("���������� ���� ü���� +%d!\n", per.healthStandard3);
					health += per.healthStandard3;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("Į�� �ϴ� �߿� ��翡�� ������ �߱��� �ϰ� �Ǿ���");
					System.out.printf("���� ��綧���� ü�� -%d!\n", per.healthStandard3);
					health -= per.healthStandard3;
					if (per.select > 50 && per.select < 70) { // �̺�Ʈ
						System.out.printf("��Ʈ������ ���� ���׷� -%d!!!\n", per.resistanceStandard3);
						resistance -= per.resistanceStandard3;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("���� ���±濡 ���� ������ �����Ͽ���.");
					System.out.printf("���ִ� �������� ���� ü�� +%d\n", per.healthStandard3);
					health += per.healthStandard3;

				}

			} else if (dayChoice == 2) { // ģ��������
				if (per.select > 0 && per.select < 40) {
					System.out.println("��� ���� ���� ���� ģ�� ������ ���� ���� �Ծ���!");
					System.out.printf("��� ���� ���� ���� ���׷��� +%d!\n", per.resistanceStandard3);
					resistance += per.resistanceStandard3;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("ģ���� �������� ������~");
					System.out.printf("����� �������� ü�� +%d!\n", per.healthStandard3);
					health += per.healthStandard3;
					if (per.select > 60 && per.select < 70) { // �̺�Ʈ
						System.out.printf("����� �������� ���׷� +%d!!!\n", per.resistanceStandard3);
						resistance += per.resistanceStandard3;

					}
				} else if (per.select > 80 && per.select < 120) {
					System.out.println("�̽ñ��� �� ������ ������...");
					System.out.printf("ü�� -%d\n", per.healthStandard3);
					System.out.printf("���׷� -%d\n", per.resistanceStandard3);
					health -= per.healthStandard3;
					resistance -= per.resistanceStandard3;
				}

			} else if (dayChoice == 3) { // �����

				if (per.select > 0 && per.select < 40) {
					System.out.println("��� ���µ� ����ũ�� �����ߴ�!");
					System.out.printf("����ũ�� ���� ���׷� -%d!\n", per.resistanceStandard3);
					resistance -= per.resistanceStandard3;

				} else if (per.select > 40 && per.select < 80) {
					System.out.println("3�� 1000!!!");
					System.out.printf("ü�� +%d!!!!!!\n", per.healthStandard3);
					System.out.printf("���׷� +%d!!!!!!\n", per.resistanceStandard3);
					health += per.healthStandard3;
					resistance += per.resistanceStandard3;

				} else if (per.select > 80 && per.select < 120) {
					System.out.println("�ｺ�� Ʈ���̳ʿ� � ������ ���ָ� ���̴�!");
					System.out.printf("���ְ� �Ծ����� ü���� ������ ü�� -%d\n", per.healthStandard3);
					health -= per.healthStandard3;

				}
			}

			status(choice, nurse, athlete, student, health, resistance);// ���� ������ �����ش�.
			check(per, choice, resistance); // �������θ� ���� �����ִ� �޼ҵ� //Ȯ���� ����ؼ� �ڷγ� ���� ���ο� ���� ���� ǥ��.

			resistance = 0; // �߰� �� ���� ���׷� �ʱ�ȭ
			health = 0; // �߰� �� ���� ü�� �ʱ�ȭ
			month++; // 1�޾� ����

		}
	}

	private static void check(Percentage per, int choice, int resistance) {
		int check = per.RePercentage(resistance, choice); // �ڷγ� �������� Ȯ���ϱ�.
		if (check == 0) {
			System.out.println("�ڷγ��� �����Ǽ̽��ϴ�");
		} else if (check == 1) {
			System.out.println("������ �Ϸ縦 �����̽��ϴ�.");
		} else if (check == 2) {
			System.out.println("===== ��� =====");
			System.out.println("���� ����� ���׷��� ������� �Դϴ�.");
			System.out.println("==============");
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