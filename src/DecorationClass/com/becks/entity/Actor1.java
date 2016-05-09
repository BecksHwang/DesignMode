package DecorationClass.com.becks.entity;

public class Actor1 extends Actor {
	public void performance(){
		this.dance();
		super.performance();;
	}
	
	public void dance(){
		System.out.println("我是演员，我还会各种舞蹈！");
	}
}
