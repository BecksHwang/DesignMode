package Builder.com.becks.test;

import Builder.com.becks.entity.Man;
import Builder.com.becks.entity.ManBuilder;

public class Test2 {
	public static void main(String[] args) {
		ManBuilder builder = new ManBuilder();
		Man man = builder.builderMan();
	}
}
