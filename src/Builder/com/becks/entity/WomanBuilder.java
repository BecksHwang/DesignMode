package Builder.com.becks.entity;

public class WomanBuilder implements PersonBuilder {
	Person person;

	public WomanBuilder() {
		person = new Woman();
	}

	public void buildbody() {
		person.setBody("建造女人的身体");
	}

	public void buildFoot() {
		person.setFoot("建造女人的脚");
	}

	public void buildHead() {
		person.setHead("建造女人的头");
	}

	public Person buildPerson() {
		return person;
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		
	}
}
