import java.util.Random;

import sun.awt.windows.ThemeReader;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random x = new Random(System.currentTimeMillis());
		// TODO Auto-generated method stub
		//tworzmy 5 widelcy
		widelec Widelec01 = new widelec(1);
		widelec Widelec02 = new widelec(2);
		widelec Widelec03 = new widelec(3);
		widelec Widelec04 = new widelec(4);
		widelec Widelec05 = new widelec(5);
		//tworzymy 5 filozofow i przypisujemy im widelce
		filozof Filozof01 = new filozof(Widelec05, Widelec01);
		filozof Filozof02 = new filozof(Widelec01, Widelec02);
		filozof Filozof03 = new filozof(Widelec02, Widelec03);
		filozof Filozof04 = new filozof(Widelec03, Widelec04);
		filozof Filozof05 = new filozof(Widelec04, Widelec05);
		//tworzymy watki filozofow
		Thread filozof_pierwszy = new Thread(Filozof01,
				"Pierwszy filozof");
		Thread filozof_drugi = new Thread(Filozof02, "Drugi filozof");
		Thread filozof_trzeci = new Thread(Filozof03,
				"Trzeci filozof");
		Thread filozof_czwarty = new Thread(Filozof04,
				"Czwarty filozof");
		Thread filozof_piaty = new Thread(Filozof05, "Pi¹ty filozof");
		//startujemy watki filozofow
		filozof_pierwszy.start();
		filozof_drugi.start();
		filozof_trzeci.start();
		filozof_czwarty.start();
		filozof_piaty.start();

	}

}
