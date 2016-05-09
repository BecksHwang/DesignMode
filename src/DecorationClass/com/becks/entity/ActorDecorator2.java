package DecorationClass.com.becks.entity;

public class ActorDecorator2 extends ActorDecorator {

	public ActorDecorator2(Actor actor) {
		super(actor);
	}
	
	public void performance(){
		super.performance();
		this.sing();
	}
	
	public void sing(){
		System.out.println("我是演员，我还会唱歌！流行的，美声的，摇滚的!");
	}
}
