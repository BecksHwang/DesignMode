package Factory.com.becks.entity;

public class BMW523Factory2 implements AbstractFactory {

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}

}
