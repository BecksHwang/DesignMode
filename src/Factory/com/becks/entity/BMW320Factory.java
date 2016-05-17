package Factory.com.becks.entity;

public class BMW320Factory implements BMWFactory {

	@Override
	public BMW320 createBMW() {

		return new BMW320();
	}

}
