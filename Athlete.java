
public class Athlete extends Character{
	
	
	String name = "�����";
	int health = 100 + 20; //�⺻ ü�� + �߰�ü��
	int resistance = 10; //�⺻ �ڷγ� ���� ���׷�
	
	
	@Override
	public void selectCharcter() {
		System.out.printf("ü�� : %d\n",health);
		System.out.printf("�ڷγ� ���� ���׷� : %d\n", resistance);		
	}


	@Override
	public void status(int health, int resistance) { //�������� ���� �� ���ҵǴ� ��ġ�� �޴� �Ű�����
		this.health += health;
		this.resistance += resistance;
		System.out.println("===== ���� ���� =====");
		System.out.println(name);
		System.out.printf("ü�� : %d\n", this.health);
		System.out.printf("�ڷγ� ���� ���׷� : %d\n", this.resistance);
		System.out.println("=================");		
	}
	
	


}
