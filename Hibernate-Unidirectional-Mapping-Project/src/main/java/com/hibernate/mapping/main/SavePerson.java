package com.hibernate.mapping.main;
import com.hibernate.mapping.dao.PersonDao;
import com.hibernate.mapping.entity.AadharCard;
import com.hibernate.mapping.entity.Person;

public class SavePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AadharCard a = new AadharCard();
		a.setId(101);
		a.setAadharNumber(779990187913L);
		a.setAddress("Belagavi");
		a.setState("Karnataka");
		a.setDateOfBirth("05-06-2004");
		
		Person p = new Person();
		
		p.setId(1);
		p.setName("ShivaBasava");
		p.setAge(23);
		p.setPhone(98452356545L);
		
		p.setAadharCard(a);
		
		PersonDao pd = new PersonDao();
		pd.savePerson(p);

	}

}
