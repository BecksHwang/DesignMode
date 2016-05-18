package Factory.com.becks.test;

import Factory.com.becks.entity.BMW320Factory2;
import Factory.com.becks.entity.BMW523Factory2;

public class Customer3 {
	public static void main(String[] args) {
		// 生产宝马320系列配件
		BMW320Factory2 BMW320factory = new BMW320Factory2();
		BMW320factory.createEngine();
		BMW320factory.createAircondition();

		// 生产宝马523系列配件
		BMW523Factory2 BMW523factory = new BMW523Factory2();
		BMW523factory.createEngine();
		BMW523factory.createAircondition();
	}
}
