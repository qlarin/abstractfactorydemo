
public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory monsterFactory = FactoryProvider.getFactory("MONSTER");
		AbstractFactory formFactory = FactoryProvider.getFactory("FORM");
		
		Monster mon1 = monsterFactory.getMonster("WOLF");
		Form form1 = formFactory.getForm("Elite");
		
		mon1.spawn();
		form1.mark();

	}

}
