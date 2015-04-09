
public class FactoryProvider {

	public static AbstractFactory getFactory(String factory){
		
		if(factory.equalsIgnoreCase("MONSTER")){
			return new MonsterFactory();
		}else if(factory.equalsIgnoreCase("FORM")){
			return new FormFactory();
		}
		return null;
	}
	
	
}
