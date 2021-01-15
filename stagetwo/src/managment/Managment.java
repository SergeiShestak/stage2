package managment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import exceptions.Faculty;
import exceptions.Group;
import exceptions.Student;
import sources.Groups;
import sources.Subjects;

public class Managment {
	
	public static void main(String[] args) {
		
		Student ivanPetrov = new Student("Ivan Petrov");
		Student petrIvanov = new Student("Petr Ivanov");
		
		ivanPetrov.setAssesments(Subjects.MATH,10);
		ivanPetrov.setAssesments(Subjects.ECONOMICS,8);
		ivanPetrov.setAssesments(Subjects.MATH,10);
		ivanPetrov.setAssesments(Subjects.MATH,10);
		petrIvanov.setAssesments(Subjects.JAVA, 7);
		petrIvanov.setAssesments(Subjects.ENGLISH,7);
		petrIvanov.setAssesments(Subjects.ENGLISH,8);
		petrIvanov.setAssesments(Subjects.ENGLISH,7);
		petrIvanov.setAssesments(Subjects.MATH, 7);
		ivanPetrov.setAssesments(Subjects.ENGLISH, 9);
		
		
		System.out.println(ivanPetrov.toString());
		System.out.println(petrIvanov.toString());
		System.out.println(petrIvanov.getOverallAverageAssesment());
		System.out.println(ivanPetrov.getSubjectAverageAssesment(Subjects.MATH));
		System.out.println(petrIvanov.getSubjectAverageAssesment(Subjects.MATH));
		
		Group group = new Group();
		group.setGroup(petrIvanov);
		group.setGroup(ivanPetrov);
		
		Faculty mathematicalFaculty =new Faculty();
		mathematicalFaculty.setFaculty(Groups.FIRST, group);
		Faculty chemicalFaculty = new Faculty();
		
		System.out.println(  "  It's" + mathematicalFaculty.getSubjectAverageAssesment(Subjects.MATH, Groups.FIRST));
		System.out.println(group.getSubjectAverageAssesment(Subjects.MATH));
		System.out.println(mathematicalFaculty.getFaculty().toString());
		
	
		
	}

}
