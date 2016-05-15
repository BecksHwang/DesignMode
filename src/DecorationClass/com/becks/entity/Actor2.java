package DecorationClass.com.becks.entity;

public class Actor2 extends Actor {
	public void performance(){
		this.sing();
		super.performance();
	}
	
	public void sing(){
		System.out.println("我是演员，我还会唱歌！流行的，美声的，摇滚的。");
	}
}
