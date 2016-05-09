package DecorationClass.com.becks.entity;

public class ActorDecorator1 extends ActorDecorator {

	public ActorDecorator1(Actor actor) {
		super(actor);
	}
	
	public void performance(){
		super.performance();
		this.dance();
	}
	
	public void dance(){
		System.out.println("我是演员，我还会各种舞蹈！");
	}
}
