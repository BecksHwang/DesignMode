package Factory.com.becks.entity;

public class BMW320Factory2 implements AbstractFactory {

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionA();
	}

}
