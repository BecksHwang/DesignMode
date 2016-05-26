package Builder.com.becks.test;

import Builder.com.becks.entity.ManBuilder;
import Builder.com.becks.entity.Person;
import Builder.com.becks.entity.PersonDirector;
import Builder.com.becks.entity.WomanBuilder;

public class Test {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person manPerson = pd.constructPerson(new WomanBuilder());
	}
}
