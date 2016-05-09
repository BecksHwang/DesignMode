package DecorationClass.com.becks.entity;

public class ActorDecorator extends Actor {
	private Actor actor;

	public ActorDecorator(Actor actor) {
		this.actor = actor;
	}
	
	public void performance(){
		actor.performance();
	}
	
}
