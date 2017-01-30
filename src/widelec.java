public class widelec {
	int widelec_w_uzyciu = 0;
	
	int nrWidelca;
	
	

	public widelec(int nrWidelca) {
		super();
		this.nrWidelca = nrWidelca;
	}

	public synchronized void podnies_widelec() {
		if (widelec_w_uzyciu == 1) { //jesli widelec jest w uzyciu informuj filozosfa aby czekal az sie zwolni widelec
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
			}
			;
		}
		System.out.println("widelec.podnies_widelec() " + nrWidelca + " przez " + Thread.currentThread());
		widelec_w_uzyciu = 1;
		
	}

	public synchronized void odloz_widelec() {
		System.out.println("widelec.odloz_widelec() " + nrWidelca + " przez "  + Thread.currentThread());
		widelec_w_uzyciu = 0;
		notify();
	}

	public synchronized int stan_widelca() {
		return widelec_w_uzyciu;

	}

}
