package managment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import exceptions.Student;
import sources.Subjects;

public class Managment {
	
	public static void main(String[] args) {
		
		Student ivanPetrov = new Student("Ivan Petrov");
		Student petrIvanov = new Student("Petr Ivanov");
		
		ivanPetrov.setAssesments("Ivan Petrov",Subjects.MATH,10);
		ivanPetrov.setAssesments("Ivan Petrov",Subjects.ECONOMICS,8);
		ivanPetrov.setAssesments("Ivan Petrov",Subjects.MATH,10);
		ivanPetrov.setAssesments("Ivan Petrov",Subjects.MATH,10);
		petrIvanov.setAssesments("Petr Ivanov", Subjects.JAVA, 7);
		petrIvanov.setAssesments("Petr Ivanov",Subjects.ENGLISH,7);
		petrIvanov.setAssesments("Petr Ivanov",Subjects.ENGLISH,8);
		petrIvanov.setAssesments("Petr Ivanov",Subjects.ENGLISH,7);
		
		
		System.out.println(ivanPetrov.toString());
		System.out.println(petrIvanov.toString());
		System.out.println(petrIvanov.getOverallAverageAssesment());
		System.out.println(ivanPetrov.getSubjectAverageAssesment(Subjects.MATH));
		System.out.println(petrIvanov.getSubjectAverageAssesment(Subjects.MATH));
		
	}

}
