package DecorationClass.com.becks.entity;

public class ActorDecorator3 extends ActorDecorator {

	public ActorDecorator3(Actor actor) {
		super(actor);
	}
	
	public void performance(){
		super.performance();
		this.writing();
	}
	
	public void writing(){
		System.out.println("我是演员，我还会写段子！");
	}
}
