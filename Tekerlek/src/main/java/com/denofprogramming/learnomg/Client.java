package com.denofprogramming.learnomg;

import org.neo4j.ogm.MetaData;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

import com.denofprogramming.learnomg.domain.Expertise;
import com.denofprogramming.learnomg.domain.Interest;
import com.denofprogramming.learnomg.domain.Money;
import com.denofprogramming.learnomg.domain.Person;
import com.denofprogramming.learnomg.domain.Student;

public final class Client {

	public static void main(String[] args) {	


		SessionFactory sf = new SessionFactory("com.denofprogramming.learnomg.domain");
		final Session session =	sf.openSession();
		Interest i = session.load(Interest.class, Long.valueOf(56));

		
		Person Hanifi = new Person("Hanifi", 21);
		Hanifi.addExpertise(new Expertise("Java", 3));
		Hanifi.addExpertise(new Expertise("Neo4j", 3));
		Hanifi.addInterest(i);
		//session.save(Hanifi);
		//Student s = session.load(Student.class, Long.valueOf(4));
		System.out.print(i);
		
		
			
	}
	

}
