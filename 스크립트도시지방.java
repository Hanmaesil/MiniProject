package minimini;

import java.util.Random;

public class ��ũ��Ʈ�������� {
	//��ȣ��� �����
	Random ran = new Random();

	
	//month �� 369�� ��ȸ�� �Ÿ��α� ��ũ��Ʈ, �������� �Ϲ� ��ũ��Ʈ
	
	
	// ��ȣ�� ������
		// ��ħ
		// 1. 10�� ���ڰ� ����ϱ� 2. �İ� ����ϱ� 3. ��԰� ����ϱ�
		// ����
		// 1. �����Ĵ簡�� 2. ���� ã�ư��� 3. «���� ��ϱ�
		// ����
		// 1. Į���ϰ� ǫ���� 2. ģ�������� 3. �����
		
	public int NurseMoring1(int month) { // ���ϰ��� �༭ �� ���ϰ��� �°� ü���̳� ���׷� ���� �� ����

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
				System.out.print("��ǿ��� �̲����� ü�� "); // ������¹��� ���� 
			} else if (select == 1) {
				System.out.println("������ �ڰ� ��������� ��������� ��������� �Ǿ���!");
				System.out.print("ǫ �ڰ� �Ͼ�� ü�� ");
				System.out.print("�߰��� ���׷� ");
			} else if (select == 2) {
				System.out.println("�����Ͽ� �������� ��翡�� �ô޷����� ���Ž¸��Ͽ���!");
				System.out.print("���Ž¸��� ���� ���׷� ");
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
				System.out.print("��ǿ��� �̲����� ü�� "); // ������¹��� ����
			} else if (select == 1) {
				System.out.println("������ ������ ��ȸ�� �Ÿ��α�� ���ñٹ��� �Ͽ���.");
				System.out.print("ǫ �ڰ� �Ͼ�� ü�� ");
				System.out.print("�߰��� ���׷� ");
			} else if (select == 2) {
				System.out.println("�����Ͽ� �������� ��翡�� �ô޷����� ���Ž¸��Ͽ���!");
				System.out.print("���Ž¸��� ���� ���׷� ");
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
				System.out.println("��ǿ��� �ų��� �뷡 �θ��� �غ��ϴٰ� ���� �Ͽ���!");
				System.out.print("��翡�� ȥ�� ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("�ǵ������� �Ҹ��� �������� �����ϰ� �ľ���!");
				System.out.print("�����ϰ� �ľ ���׷� "); // ���׷� ����

			} else if (select == 2) {
				System.out.println("�������� �İ� ������ ���!");
				System.out.printf("����������� ü�� "); // ü�� ����
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��ǿ��� �ų��� �뷡 �θ��� �غ��ϴٰ� ���� �Ͽ���!");
				System.out.print("��翡�� ȥ�� ü�� ");
			} else if (select == 1) {
				System.out.println("�ǵ������� �Ҹ��� �������� �����ϰ� �ľ���!");
				System.out.print("�����ϰ� �ľ ���׷� ");
			} else if (select == 2) {
				System.out.println("���ϰ� �İ� �������� ����ũ�� �� ì���");
				System.out.printf("����ũ�� ���� ���׷� "); // ���׷� ����
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
			System.out.println("���� ���ϰ� �Ծ� ü�ع��ȴ�!");
			System.out.print("���� ����ؼ� ü�� "); // ü�°���
		} else if (select == 1) {
			System.out.println("��ħ�� �����!");
			System.out.print("���� ����ؼ� ü�� "); // ü�� ����
			System.out.print("�߰��� ���׷� "); //���׷� ����
		} else if (select == 2) {
			System.out.println("���� ����� �����Ŀ� ���̽� �Ƹ޸�ī����!");
			System.out.print("ī���� ����� ���� ���׷� "); //���׷� ����
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("���� ���ϰ� �Ծ� ü�ع��ȴ�!");
			System.out.print("���� ����ؼ� ü�� ");
		} else if (select == 1) {
			System.out.println("��ħ�� �����!");
			System.out.print("���� ����ؼ� ü�� ");
			System.out.print("�߰��� ���׷� ");
		} else if (select == 2) {
			System.out.println("��ٱ濡 ���ְ��� ī�䰡 �ڷγ��� ���� ���ߴ�");
			System.out.print("ī���� ���븦 ���� ���׷� "); //���׷� ����
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
			System.out.println("�����Ĵ� ����� ���� ������ �� �Ծ���.");
			System.out.print("���� ���� ü�� "); // ü�� ����
		} else if (select == 1) {
			System.out.println("18ø �ݻ��� ���Դ�!");
			System.out.print("��Ҹ� �Ծ� ü�� "); // ü�� ����
			System.out.print("����� ������ �߰��� ���׷� "); //���׷� ����
		} else if (select == 2) {
			System.out.println("�������� ���� ���޽Ƿ� �Ƿ�����.");
			System.out.print("���޽ǿ� ���� ���׷� "); //���׷� ����
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("�����Ĵ� ����� ���� ������ �� �Ծ���.");
			System.out.print("���� ���� ü�� ");
		} else if (select == 1) {
			System.out.println("�ڷγ��� ������ ĭĭ�� ��� �ɾҴ�");
			System.out.println("ȥ�� �Ա� �ܷο� ���׷� ");// ���׷� ����
		} else if (select == 2) {
			System.out.println("�������� ���� ���޽Ƿ� �Ƿ�����.");
			System.out.print("���޽ǿ� ���� ���׷� ");
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
			System.out.println("������ ���µ� �������� ��� ���� ���Ծ���.");
			System.out.print("���� ���� ü�� "); //ü�� ����
		} else if (select == 1) {
			System.out.println("......�̳� ���־�");
			System.out.print("��Ҹ� �Ծ� ü�� "); //ü�� ����
			System.out.print("������ ���׷��� "); //���׷� ����
		} else if (select == 2) {
			System.out.println("������ ���ǿ� ��÷�Ǿ� �Ѵ� ���� �̿���� �����!");
			System.out.print("����� ������ ���׷� "); //���׷� ����
		}
		return select;
	} else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("������ ���µ� �������� ��� ���� ���Ծ���.");
			System.out.print("���� ���� ü�� ");
		} else if (select == 1) {
			System.out.println("......�̳� ���־�");
			System.out.print("��Ҹ� �Ծ� ü�� ");
			System.out.print("����� ������ �߰��� ���׷� ");
		} else if (select == 2) {
			System.out.println("�Ÿ��α��ε� ������ ��??????");
			System.out.print("��?! "); //���׷� ����
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
			System.out.println("��� ������ ������ ��ٽð��� �����ߴ�!");
			System.out.print("��翡�� ȥ�� ���׷� ");
		} else if (select == 1) {
			System.out.println("����Ʈ 1000��!!!!!");
			System.out.print("������ �ʹ� �߸Ծ� �鿪�� ");
			System.out.print("����� ������ �߰��� ���׷� ");
		} else if (select == 2) {
			System.out.println("��Ŀ� �ܹ�������ũ��!");
			System.out.printf("��� �ߵǼ� �鿪���� ");
		}
		return select;
	} else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("��� ������ ������ ��ٽð��� �����ߴ�!");
			System.out.print("��翡�� ȥ�� ���׷� ");
		} else if (select == 1) {
			System.out.println("����Ʈ 1000��!!!!!");
			System.out.print("������ �ʹ� �߸Ծ� �鿪�� ");
			System.out.print("����� ������ �߰��� ���׷� ");
		} else if (select == 2) {
			System.out.println("�����̿�ü� �̿� ����!!!!");
			System.out.printf("�����ض�... ");//���׷� ����
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
			System.out.println("������ īǮ�� ������ ���ϰ� ����!");
			System.out.print("���������� ���� ü���� "); // ü������
		} else if (select == 1) {
			System.out.println("Į�� �ϴ� �߿� ��翡�� ������ �߱��� �ϰ� �Ǿ���");
			System.out.print("���� ��綧���� ü�� "); // ü�� ����
			System.out.print("��Ʈ������ ���� ���׷� "); // ���׷� ����
		} else if (select == 2) {
			System.out.println("���� ���±濡 ���� ������ �����Ͽ���.");
			System.out.printf("���ִ� �������� ���� ü�� "); // ü������
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("������ īǮ�� ������ ���ϰ� ����!");
			System.out.print("���������� ���� ü���� "); // ü������
		} else if (select == 1) {
			System.out.println("Į�� �ϴ� �߿� ��翡�� ������ �߱��� �ϰ� �Ǿ���");
			System.out.print("���� ��綧���� ü�� "); // ü�� ����
			System.out.print("��Ʈ������ ���� ���׷� "); // ���׷� ����
		} else if (select == 2) {
			System.out.println("���� ���±濡 ���� ������ �����Ͽ���.");
			System.out.printf("���ִ� �������� ���� ü�� "); // ü������
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
			System.out.println("��� ���� ���� ���� ģ�� ������ ���� ���� �Ծ���!");
			System.out.printf("��� ���� ���� ���� ���׷��� "); // ���׷� ����
		} else if (select == 1) {
			System.out.println("ģ���� �������� ������~");
			System.out.print("����� �������� ü�� "); // ü������
		} else if (select == 2) {
			System.out.println("�̽ñ��� �� ������ ������...");
			System.out.print("ü�� "); // ü�� ����
			System.out.print("���׷� "); // ���׷� ����
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("��� ���� ���� ���� ģ�� ������ ���� ���� �Ծ���!");
			System.out.printf("��� ���� ���� ���� ���׷��� "); // ���׷� ����
		} else if (select == 1) {
			System.out.println("ģ���� �������� ������~");
			System.out.println("...�� ����!"); //������ �ֱ�
			System.out.print("�濪��Ģ!!!! "); // ���׷� ����
		} else if (select == 2) {
			System.out.println("�̽ñ��� �� ������ ������...");
			System.out.print("ü�� "); // ü�� ����
			System.out.print("���׷� "); // ���׷� ����
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
			System.out.println("��� ���µ� ����ũ�� �����ߴ�!");
			System.out.print("����ũ�� ���� ���׷� "); // ���׷� ����
		} else if (select == 1) {
			System.out.println("3�� 1000!!!");
			System.out.print("ü�� "); // ü�� ����
			System.out.print("���׷� "); // ���׷� ����
		} else if (select == 2) {
			System.out.println("�ｺ�� Ʈ���̳ʿ� � ������ ���ָ� ���̴�!");
			System.out.print("���ְ� �Ծ����� ü���� ������ ü�� "); // ü�°���
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("��� ���µ� ����ũ�� �����ߴ�!");
			System.out.print("����ũ�� ���� ���׷� "); // ���׷� ����
		} else if (select == 1) {
			System.out.println("3�� 1000!!!");
			System.out.print("ü�� "); // ü�� ����
			System.out.print("���׷� "); // ���׷� ����
		} else if (select == 2) {
			System.out.println("�ｺ�� Ʈ���̳ʿ� � ������ ���ָ� ���̴�!");
			System.out.print("�濪 ��Ģ�� ���Ѷ�! "); // ���׷°���
		}
		return select;
	}else {
		return select;
	}
	}
	
	//����� ������
	//��ħ
	//// 1. 10�� ���ڰ� ����ϱ� 2. �İ� ����ϱ� 3. ��ħ��ϱ� //��ȣ��� ����
	//���� 
	//1. ��Ա� 2. ��ϱ� 3. ��Ȱġ��
	//����
	//1. Į���ϰ� ǫ���� 2. ģ�������� 3. ����� 
	
	
	public int AthleteMoring1(int month) { // ���ϰ��� �༭ �� ���ϰ��� �°� ü���̳� ���׷� ���� �� ����
		
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
				System.out.print("��ǿ��� �̲����� ü�� "); // ������¹��� ���� 
			} else if (select == 1) {
				System.out.println("������ �ڰ� ��������� ��������� ��������� �Ǿ���!");
				System.out.print("ǫ �ڰ� �Ͼ�� ü�� ");
				System.out.print("�߰��� ���׷� ");
			} else if (select == 2) {
				System.out.println("�����Ͽ� �������� ��翡�� �ô޷����� ���Ž¸��Ͽ���!");
				System.out.print("���Ž¸��� ���� ���׷� ");
			}
			return select;
			
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�����ڴٰ� ���ϰ� �غ��ϴ��� ��ǿ��� �̲�������!");
				System.out.print("��ǿ��� �̲����� ü�� "); // ������¹��� ����
			} else if (select == 1) {
				System.out.println("������ ������ ��ȸ�� �Ÿ��α�� ���ñٹ��� �Ͽ���.");
				System.out.print("ǫ �ڰ� �Ͼ�� ü�� ");
				System.out.print("�߰��� ���׷� ");
			} else if (select == 2) {
				System.out.println("�����Ͽ� �������� ��翡�� �ô޷����� ���Ž¸��Ͽ���!");
				System.out.print("���Ž¸��� ���� ���׷� ");
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
				System.out.println("��ǿ��� �ų��� �뷡 �θ��� �غ��ϴٰ� ���� �Ͽ���!");
				System.out.print("��翡�� ȥ�� ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("�ǵ������� �Ҹ��� �������� �����ϰ� �ľ���!");
				System.out.print("�����ϰ� �ľ ���׷� "); // ���׷� ����
				
			} else if (select == 2) {
				System.out.println("�������� �İ� ������ ���!");
				System.out.printf("����������� ü�� "); // ü�� ����
			}
			return select;
			
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��ǿ��� �ų��� �뷡 �θ��� �غ��ϴٰ� ���� �Ͽ���!");
				System.out.print("��翡�� ȥ�� ü�� ");
			} else if (select == 1) {
				System.out.println("�ǵ������� �Ҹ��� �������� �����ϰ� �ľ���!");
				System.out.print("�����ϰ� �ľ ���׷� ");
			} else if (select == 2) {
				System.out.println("���ϰ� �İ� �������� ����ũ�� �� ì���");
				System.out.printf("����ũ�� ���� ���׷� "); // ���׷� ����
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
				System.out.println("���� �����!");
				System.out.print("�谡 ���ļ� ü�� "); // ü�°���
			} else if (select == 1) {
				System.out.println("��ħ�� �����!!");
				System.out.print("��� ����� �ؼ� ü�� "); // ü�� ����
				System.out.print("�߰��� ���׷� "); //���׷� ����
			} else if (select == 2) {
				System.out.println("��� ������ �ܹ��� ����ũ��!");
				System.out.print("�ܹ��� ����ũ ����� ���� ü�� "); //ü�� ����
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("���� �����!");
				System.out.print("�谡 ���ļ� ü�� "); // ü�°���
			} else if (select == 1) {
				System.out.println("��ħ�� �����!!");
				System.out.print("��� ����� �ؼ� ü�� "); // ü�� ����
				System.out.print("�߰��� ���׷� "); //���׷� ����
			} else if (select == 2) {
				System.out.println("��� ������ �ܹ��� ����ũ��!");
				System.out.print("�ܹ��� ����ũ ����� ���� ���׷� "); //ü�� ����
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
				System.out.println("�ܰ񰡰� ����� ���� ������ �� �Ծ���.");
				System.out.print("���� ���� ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("�߰�����! �ܹ���!!!");
				System.out.print("��Ҹ� �Ծ� ü�� "); // ü�� ����
				System.out.print("����� ������ �߰��� ���׷� "); //���׷� ����
			} else if (select == 2) {
				System.out.println("�߰������� �ʹ� �Ծ� ���޽Ƿ� �Ƿ�����.");
				System.out.print("���޽ǿ� ���� ���׷� "); //���׷� ����
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�ܰ񰡰� ����� ���� ������ �� �Ծ���.");
				System.out.print("���� ���� ü�� ");
			} else if (select == 1) {
				System.out.println("�ڷγ��� ������ ĭĭ�� ��� �ɾҴ�");
				System.out.println("ȥ�� �Ա� �ܷο� ���׷� ");// ���׷� ����
			} else if (select == 2) {
				System.out.println("�������� ���� ���޽Ƿ� �Ƿ�����.");
				System.out.print("���޽ǿ� ���� ���׷� ");
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
				System.out.println("��������! ��������!");
				System.out.print("���� �����! "); //ü�� ����
			} else if (select == 1) {
				System.out.println("��������! ��������!");
				System.out.print("���� �����! "); //ü�� ����
			} else if (select == 2) {
				System.out.println("3�� 1000 ������!!!!");
				System.out.print("�㸮�� �߲��� ü�� "); //ü�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��������! ��������!");
				System.out.print("���� �����! "); //ü�� ����
			} else if (select == 1) {
				System.out.println("����ũ�� �����Ͽ� ��� ���� ���� �ܼӿ� �ɷȴ�.");
				System.out.print("�ѹ��� ���ּ���....�Ф� "); //���׷� ����
			} else if (select == 2) {
				System.out.println("3�� 1000 ������!!!!");
				System.out.print("�㸮�� �߲��� ü�� "); //ü�� ����
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
				System.out.println("��ҿ� �����Ҵ� �㸮�� ��Ȱġ�� �޾Ҵ�!");
				System.out.print("�����Ѱ� �ذ�Ǿ� ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("����Ʈ 1000��!!!!!... �Ͻø� �ȵǴٰ��!!!");
				System.out.print("ġ��翡�� ȥ�� ���׷� "); //���׷� ����
			} else if (select == 2) {
				System.out.println("��Ŀ� �ܹ�������ũ��! ...� ���� ������!!!");
				System.out.printf("ġ��翡�� ȥ�� ü�� "); // ü�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("������ ����ũ�� �Ⱦ� ȯ�ڰ� �⿬�ߴ�!");
				System.out.print("�濪��Ģ��.... "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("����Ʈ 1000��!!!!!... �Ͻø� �ȵǴٰ��!!!");
				System.out.print("ġ��翡�� ȥ�� ���׷� "); //���׷� ����
			} else if (select == 2) {
				System.out.println("��Ŀ� �ܹ�������ũ��! ...� ���� ������!!!");
				System.out.printf("ġ��翡�� ȥ�� ü�� "); // ü�� ����
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
				System.out.println("������ īǮ�� ������ ���ϰ� ����!");
				System.out.print("���������� ���� ü���� "); // ü������
			} else if (select == 1) {
				System.out.println("Į�� �ϴ� �߿� ��翡�� ������ �ܾ��� �ϰ� �Ǿ���");
				System.out.print("���� ��綧���� ü�� "); // ü�� ����
				System.out.print("��Ʈ������ ���� ���׷� "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("���� ���±濡 ���� ������ �����Ͽ���.");
				System.out.printf("���ִ� �������� ���� ü�� "); // ü������
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("������ īǮ�� ������ ���ϰ� ����!");
				System.out.print("���������� ���� ü���� "); // ü������
			} else if (select == 1) {
				System.out.println("Į�� �ϴ� �߿� ��翡�� ������ �ܾ��� �ϰ� �Ǿ���");
				System.out.print("���� ��綧���� ü�� "); // ü�� ����
				System.out.print("��Ʈ������ ���� ���׷� "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("���� ���±濡 ���� ������ �����Ͽ���.");
				System.out.printf("���ִ� �������� ���� ü�� "); // ü������
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
				System.out.println("ģ���� ����! ��� �� ģ����!!!");
				System.out.printf("��� �ؼ� ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("ģ���� �������� ������~");
				System.out.print("����� �������� ü�� "); // ü������
			} else if (select == 2) {
				System.out.println("�̽ñ��� �� ������ ������...");
				System.out.print("ü�� "); // ü�� ����
				System.out.print("���׷� "); // ���׷� ����
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("ģ���� ����! ��� �� ģ����!!!");
				System.out.printf("��� �ؼ� ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("ģ���� �������� ������~");
				System.out.println("...�� ����!"); //������ �ֱ�
				System.out.print("�濪��Ģ!!!! "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("�̽ñ��� �� ������ ������...");
				System.out.print("ü�� "); // ü�� ����
				System.out.print("���׷� "); // ���׷� ����
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
				System.out.println("��� ���µ� ����ũ�� �����ߴ�!");
				System.out.print("����ũ�� ���� ���׷� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("3�� 1000!!!");
				System.out.print("ü�� "); // ü�� ����
				System.out.print("���׷� "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("�ｺ�� Ʈ���̳ʿ� � ������ ���ָ� ���̴�!");
				System.out.print("���ְ� �Ծ����� ü���� ������ ü�� "); // ü�°���
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��� ���µ� ����ũ�� �����ߴ�!");
				System.out.print("����ũ�� ���� ���׷� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("3�� 1000!!!");
				System.out.print("ü�� "); // ü�� ����
				System.out.print("���׷� "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("�ｺ�� Ʈ���̳ʿ� � ������ ���ָ� ���̴�!");
				System.out.print("�濪 ��Ģ�� ���Ѷ�! "); // ���׷°���
			}
			return select;
		}else {
			return select;
		}
	}

}
