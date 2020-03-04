package chris;

import java.util.ArrayDeque;

public class ParGroupeIterator extends PersonnelTypeIterator {

	public ParGroupeIterator(PersonnelGroupe personnelGroupe) {
		super(personnelGroupe, new ArrayDeque<PersonnelType>());
	}
	
	@Override
	protected PersonnelType getFromCollection() {
		return ((ArrayDeque<PersonnelType>) collection).remove();
	}

}
