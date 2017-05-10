
public class Ball {
	
	public static int totalBounces = 0;
	public int bounces = 0;
	public int Id;
	
	public Ball(int IdIn, int bouncesIn) {
		Id = IdIn;
		bounces = bouncesIn;
	}
	public static int getTotalBounces() {
		return totalBounces;
	}
	public static void setTotalBounces(int totalBounces) {
		Ball.totalBounces = totalBounces;
	}
	public int getBounces() {
		return bounces;
	}
	public void setBounces(int bounces) {
		this.bounces = bounces;
	}
	public int getId() {
		return Id;
	}
	public void setID(int Id) {
		this.Id = Id;
	}

	

}
