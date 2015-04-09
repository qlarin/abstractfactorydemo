
public class MonsterFactory extends AbstractFactory {

	public Monster getMonster(String monsterType){
		if(monsterType == null){
			return null;
		}
		
		if(monsterType.equalsIgnoreCase("WOLF")){
			return new Wolf();
		}else if(monsterType.equalsIgnoreCase("BEARMAN")){
			return new Bearman();
		}else if(monsterType.equalsIgnoreCase("HARPY")){
			return new Harpy();
		}
		return null;
	}

	@Override
	Form getForm(String form) {
		return null;
	}
}
