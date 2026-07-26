package com.hibernate.mapping.main;
import com.hibernate.mapping.dao.PersonDao;
import com.hibernate.mapping.entity.AadharCard;
import com.hibernate.mapping.entity.Person;

public class FetchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao pd = new PersonDao();
		
		Person p =pd.fetchPerson(1);
		if(p!=null) {
			System.out.println(p.getId()+" "+p.getName()+" "+ p.getAge()+ " "+ p.getPhone());
			
			AadharCard a =p.getAadharCard();
			
			System.out.println(a.getId()+" "+a.getAadharNumber()+" "+a.getAddress()+" "+a.getDateOfBirth()+" "+a.getState());
		}
		else {
			System.out.println("id not exists");
		}

	}

}
