import java.util.Random;

public class Percentage {
	// �⺻���� ��ġ�� Ŭ����.
	Random ran = new Random();
	// ü�°� ���׷� ���ҿ� ���� ��ġ
	//��ħ
	int healthStandard1 = ran.nextInt(20) + 1;
	int resistanceStandard1 = ran.nextInt(15)+1;
	//����
	int healthStandard2 = ran.nextInt(20) + 1;
	int resistanceStandard2 = ran.nextInt(15)+1;
	//����
	int healthStandard3 = ran.nextInt(20) + 1;
	int resistanceStandard3 = ran.nextInt(15)+1;
	
	// ������ ��ġ
	int select = ran.nextInt(120)+ 1; //3���� 1Ȯ���� ������ ���
	
	

	// �⺻ ������ : 60%
	int percentage = ran.nextInt(100) + 1;

	// ������� ������ �߰�(4,8��° ��)
	int vogue = 20;

	//��ȸ�� �Ÿ��α�� �߰� �鿪�� ���� ��ġ(3, 6, 9��° ��)
	int keepDistance1 = 10; //��ȸ���Ÿ��α� 1�ܰ�
	int keepDistance2 = 20; //��ȸ���Ÿ��α� 2�ܰ� 
	int keepDistance3 = 30; //��ȸ���Ÿ��α� 3�ܰ� 
	
	
	//��� ������ �߰� ���׷�
	//1������(5��° ��)
	int noVaccine1 = 0;
	int vaccineAz1 = 5;
	int vaccinePfizer1 = 10;
	int vaccineModerna1 = 15;
	//2������(10��° ��)
	int noVaccine2 = -10; //����н��� ���� �������� �޾Ҵ�.
	int vaccineAz2 = 10;
	int vaccinePfizer2 = 15;
	int vaccineModerna2 = 20;
	
	//��� ������ ���ۿ����� ü�� ���� ��
	//1������
	int sideEffectAz1 = 5;
	int sideEffectPfizer1 = 10;
	int sideEffectMorderna1 = 15;
	//2������
	int sideEffectAz2 = 10;
	int sideEffectPfizer2 = 15;
	int sideEffectMorderna2 = 20;
	
	//12�� ���� �̺�Ʈ
	
	
	//�������� �⿬
//	if(percentage == 20 && 40 && 60 && 80) {
//		System.out.println("������!"); //������� �ڷγ� ������ 30�ۼ�Ʈ ����
//	}
	
	

	
	
}
