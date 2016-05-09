package DecorationClass.com.becks.entity;

public class Star {

	public static void main(String[] args) {
		Actor actor = new Actor();
		ActorDecorator actorDecorator = new ActorDecorator(actor);
		//动态为actorDecorator添加舞蹈技能
		actorDecorator = new ActorDecorator1(actorDecorator);
		//动态在添加了舞蹈技能的基础上添加唱歌技能
		actorDecorator = new ActorDecorator2(actorDecorator);
		//动态在跳舞唱歌的基础上添加写段子技能
		actorDecorator = new ActorDecorator3(actorDecorator);
		//这个时候演员调用表演的方法，发现还多了跳舞，唱歌，写段子的技能
		actorDecorator.performance();
	}

}
