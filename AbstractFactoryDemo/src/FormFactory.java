
public class FormFactory extends AbstractFactory {

	@Override
	Monster getMonster(String monster) {
		return null;
	}

	@Override
	Form getForm(String form) {
		
		if(form == null){
			return null;
		}
		
		if(form.equalsIgnoreCase("NORMAL")){
			return new Normal();
		}else if(form.equalsIgnoreCase("ELITE")){
			return new Elite();
		}
		return null;
	}

	
}
