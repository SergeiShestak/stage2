package managment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import exceptions.Faculty;
import exceptions.Group;
import exceptions.Student;
import exceptions.University;
import sources.Faculties;
import sources.Groups;
import sources.Subjects;

public class Managment {
	
	public static void main(String[] args) {
		
		Student ivanPetrov = new Student("Ivan Petrov");
		Student petrIvanov = new Student("Petr Ivanov");
		Student apetDima = new Student("Apet Dima");
		Student galkevichIvan = new Student("Galkevich Ivan");
		Student bondarevAleksey = new Student("Bondarev Aleksey");
		Student plutMaria = new Student("Plut Maria");
		Student sidorenkoKsenia = new Student("Sidorenko Ksenia");
		Student nichipurchikAleksey = new Student("Nichipurchik Aleksey");
		Student lastovkaValeria = new Student("Lastovka Valeria");
		Student mironchikovaViktoria = new Student("Mironchikova Viktoria");
		Student demeshMaria = new Student("Demesh Maria");
		Student kripanValentin = new Student("Kripan Valentin");
		Student nehaySemen = new Student("Nehay Semen");
		Student deraboNikita = new Student("Derabo Nikita");
		Student kondratovichGordey = new Student("Kondratovich Gordey");
		Student borodavkoKsenia = new Student("Borodavko Ksenia");
		
		
		ivanPetrov.setAssesments(Subjects.MATH,10);
		ivanPetrov.setAssesments(Subjects.MATH,9);
		ivanPetrov.setAssesments(Subjects.MATH,10);
		ivanPetrov.setAssesments(Subjects.MATH,10);
		ivanPetrov.setAssesments(Subjects.ENGLISH, 9);
		ivanPetrov.setAssesments(Subjects.ENGLISH, 10);
		ivanPetrov.setAssesments(Subjects.ENGLISH, 7);
		ivanPetrov.setAssesments(Subjects.ENGLISH, 8);
		ivanPetrov.setAssesments(Subjects.ECONOMICS,8);
		ivanPetrov.setAssesments(Subjects.ECONOMICS,9);
		ivanPetrov.setAssesments(Subjects.ECONOMICS,10);
		ivanPetrov.setAssesments(Subjects.ECONOMICS,7);
		ivanPetrov.setAssesments(Subjects.JAVA,10);
		ivanPetrov.setAssesments(Subjects.JAVA,8);
		ivanPetrov.setAssesments(Subjects.JAVA,9);
		ivanPetrov.setAssesments(Subjects.JAVA,10);
		
		
		petrIvanov.setAssesments(Subjects.JAVA, 7);
		petrIvanov.setAssesments(Subjects.JAVA, 10);
		petrIvanov.setAssesments(Subjects.JAVA, 9);
		petrIvanov.setAssesments(Subjects.JAVA, 8);
		petrIvanov.setAssesments(Subjects.ENGLISH,7);
		petrIvanov.setAssesments(Subjects.ENGLISH,8);
		petrIvanov.setAssesments(Subjects.ENGLISH,9);
		petrIvanov.setAssesments(Subjects.ENGLISH,7);
		petrIvanov.setAssesments(Subjects.MATH, 9);
		petrIvanov.setAssesments(Subjects.MATH, 7);
		petrIvanov.setAssesments(Subjects.MATH, 8);
		petrIvanov.setAssesments(Subjects.MATH, 10);
		petrIvanov.setAssesments(Subjects.ECONOMICS, 5);
		petrIvanov.setAssesments(Subjects.ECONOMICS, 7);
		petrIvanov.setAssesments(Subjects.ECONOMICS, 6);
		petrIvanov.setAssesments(Subjects.ECONOMICS, 9);
		
		
		plutMaria.setAssesments(Subjects.ECONOMICS, 9);
		plutMaria.setAssesments(Subjects.ECONOMICS, 7);
		plutMaria.setAssesments(Subjects.ECONOMICS, 10);
		plutMaria.setAssesments(Subjects.ECONOMICS, 10);
		plutMaria.setAssesments(Subjects.MATH, 9);
		plutMaria.setAssesments(Subjects.MATH, 7);
		plutMaria.setAssesments(Subjects.MATH, 8);
		plutMaria.setAssesments(Subjects.MATH, 10);
		plutMaria.setAssesments(Subjects.ENGLISH, 10);
		plutMaria.setAssesments(Subjects.ENGLISH, 10);
		plutMaria.setAssesments(Subjects.ENGLISH, 10);
		plutMaria.setAssesments(Subjects.ENGLISH, 9);
		plutMaria.setAssesments(Subjects.JAVA, 7);
		plutMaria.setAssesments(Subjects.JAVA, 5);
		plutMaria.setAssesments(Subjects.JAVA, 8);
		plutMaria.setAssesments(Subjects.JAVA, 7);
		
		
		
		
		Group groupFirstMath = new Group();
		groupFirstMath.setGroup(petrIvanov);
		Group groupSecondMath = new Group();
		groupSecondMath.setGroup(borodavkoKsenia);
		Group groupThirdMath = new Group();
		groupThirdMath.setGroup(kondratovichGordey);
		Group groupFourthMath = new Group();
		groupFourthMath.setGroup(deraboNikita);
		
		Faculty mathematicalFaculty =new Faculty();
		mathematicalFaculty.setFaculty(Groups.FIRST, groupFirstMath);
		mathematicalFaculty.setFaculty(Groups.SECOND, groupSecondMath);
		mathematicalFaculty.setFaculty(Groups.THIRD, groupThirdMath);petrIvanov.setAssesments(Subjects.ECONOMICS, 7);
		mathematicalFaculty.setFaculty(Groups.FOURTH, groupFourthMath);
		
		Group groupFirstChemical = new Group();
		groupFirstChemical.setGroup(nehaySemen);
		Group groupSecondChemical = new Group();
		groupSecondChemical.setGroup(kripanValentin);
		Group groupThirdChemical = new Group();
		groupThirdChemical.setGroup(demeshMaria);
		Group groupFourthChemical = new Group();
		groupFourthChemical.setGroup(mironchikovaViktoria);
		
		petrIvanov.setAssesments(Subjects.ECONOMICS, 7);
		Faculty chemicalFaculty = new Faculty();
		chemicalFaculty.setFaculty(Groups.FIRST, groupFirstChemical);
		chemicalFaculty.setFaculty(Groups.SECOND, groupSecondChemical);
		chemicalFaculty.setFaculty(Groups.THIRD, groupThirdChemical);
		chemicalFaculty.setFaculty(Groups.FOURTH, groupFourthChemical);
		
		Group groupFirstPhysics = new Group();
		groupFirstPhysics.setGroup(lastovkaValeria);
		Group groupSecondPhysics = new Group();
		groupSecondPhysics.setGroup(nichipurchikAleksey);
		Group groupThirdPhysics = new Group();
		groupThirdPhysics.setGroup(sidorenkoKsenia);
		Group groupFourthPhysics = new Group();
		groupFourthPhysics.setGroup(plutMaria);
		
		Faculty physicsFaculty = new Faculty();
		physicsFaculty.setFaculty(Groups.FIRST, groupFirstPhysics);
		physicsFaculty.setFaculty(Groups.SECOND, groupSecondPhysics);
		physicsFaculty.setFaculty(Groups.THIRD, groupThirdPhysics);
		physicsFaculty.setFaculty(Groups.FOURTH, groupFourthPhysics);
		
		
		University university = new University();
		university.setUnivetsity(Faculties.CHEMICAL, chemicalFaculty);
		university.setUnivetsity(Faculties.MATHEMATICAL, mathematicalFaculty);
		university.setUnivetsity(Faculties.PHYSICS, physicsFaculty);
		
		
		System.out.println(mathematicalFaculty.getSubjectAverageAssesment(Subjects.MATH, Groups.FIRST));
		System.out.println(groupFirstMath.getSubjectAverageAssesment(Subjects.MATH));
		System.out.println(mathematicalFaculty.getFaculty().toString());
		
		System.out.println(mathematicalFaculty.getSubjectAverageAssesment(Subjects.MATH, Groups.FIRST));
		System.out.println(university.getSubjectAverageAssesment(Subjects.MATH,Faculties.CHEMICAL));
		
		
	
		
	}

}
