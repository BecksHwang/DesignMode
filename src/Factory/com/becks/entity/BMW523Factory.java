package Factory.com.becks.entity;

public class BMW523Factory implements BMWFactory {

	@Override
	public BMW523 createBMW() {

		return new BMW523();
	}

}
