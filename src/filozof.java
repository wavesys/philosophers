import java.util.Random;

public class filozof implements Runnable {
	widelec Widelec1, Widelec2;

	public filozof(widelec widelec1, widelec widelec2) {
		Widelec1 = widelec1;
		Widelec2 = widelec2;
	}

	@Override
	public void run() {
		Random x = new Random();
		// TODO Auto-generated method stub
		while (true) {
			// podnosi widelce
			Widelec1.podnies_widelec();
			
			
			if (Widelec2.stan_widelca() == 0){
				Widelec2.podnies_widelec();
				System.out.println(Thread.currentThread().getName()
						+ " Rozpoczo³ jedzenie");
				int czas_jedzenia = x.nextInt(1000);
				try {
					Thread.sleep(czas_jedzenia);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// je... jeee i je
				// skonczyl jesc
				System.out.println(Thread.currentThread().getName()
						+ " Zakoñczy³ jedzenie po czasie: " + czas_jedzenia + " ms");

				// odklada widelce
				Widelec1.odloz_widelec();
				Widelec2.odloz_widelec();

			}
			else
			{
				Widelec1.odloz_widelec();
			}

			// rozmyslanie filozofa :P
			System.out.println(Thread.currentThread().getName()
					+ " rozpoczo³ rozmyœlanie");
			int czas_rozmyslania = x.nextInt(1000);
			try {
				Thread.sleep(czas_rozmyslania);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ " zakoñczy³ rozmyœlanie po czasie: " + czas_rozmyslania);

		}

	}
}
