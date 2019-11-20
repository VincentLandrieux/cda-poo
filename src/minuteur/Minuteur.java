package minuteur;

public class Minuteur {
	
	private int minute;

	public Minuteur() {
		this.minute = 0;
	}
	
	public void tic() {
		if(this.minute == 59 ) {
			this.minute = 0;   
		}else {
			this.minute += 1;
		}
		
		System.out.println(this.minute + " min ");
	}
	
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int pMinute) {
		if(pMinute > 59) {
			pMinute = pMinute%60;
		}else if(pMinute < 0) {
			pMinute = 0;
		}
		this.minute = Math.abs(pMinute);
	}
	
	public void avancer(int n) {
		for(int i = 0; i < n; i++) {
			this.tic();
		} 
	}

}
