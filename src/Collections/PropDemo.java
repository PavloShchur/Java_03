package Collections;

import java.util.Properties;
import java.util.Set;

public class PropDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("��������", "���������");
		properties.put("̳����", "���������-ѳ�");
		properties.put("���������", "�����");
		properties.put("��������", "����������");
		properties.put("������", "����������");
		
		Set<?> states = properties.keySet();
		
		for (Object names : states)
			System.out.println("������ ���� " + names + " - " + properties.getProperty((String)names) + ".");
			
		System.out.println();
		
		String str = properties.getProperty("�������", "�� ��������");
		
		System.out.println("������� ����� ������� " + str + " �� ��������.");
	}

}
