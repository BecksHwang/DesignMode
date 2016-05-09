package DecorationClass.com.becks.entity;

public class Actor3 extends Actor {
	public void performance(){
		this.writing();
		super.performance();;
	}
	
	public void writing(){
		System.out.println("我是演员，我还会写段子！");
	}
}
