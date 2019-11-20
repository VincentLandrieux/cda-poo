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
	public void setMinute(int minute) {
		if(minute > 59) {
			minute = minute%60;
		}
		this.minute = Math.abs(minute);
	}
	
	public void avancer(int n) {
		for(int i = 0; i < n; i++) {
			this.tic();
		} 
	}

}
