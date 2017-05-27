package Collections;

import java.util.Properties;
import java.util.Set;

public class PropDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("Ільлінойс", "Спрінгфілд");
		properties.put("Міссурі", "Джеферсон-Сіті");
		properties.put("Вашингтон", "Олімпія");
		properties.put("Каліфорнія", "Сакраменто");
		properties.put("Індіана", "Індіанаполіс");
		
		Set<?> states = properties.keySet();
		
		for (Object names : states)
			System.out.println("Століця штат " + names + " - " + properties.getProperty((String)names) + ".");
			
		System.out.println();
		
		String str = properties.getProperty("Флорида", "Не знайдено");
		
		System.out.println("Столиця штату флорида " + str + " не знайдено.");
	}

}
