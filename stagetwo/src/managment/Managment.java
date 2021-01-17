package managment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import exceptions.AssesmentException;
import objects.Faculty;
import objects.Group;
import objects.Student;
import objects.University;
import sources.Faculties;
import sources.Groups;
import sources.Subjects;

public class Managment {
	
	public static void main(String[] args) throws AssesmentException {
		
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
		
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Please, enter Name and Surname of Student :")
		
		
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
		petrIvanov.setAssesments(Subjects.ECONOMICS, 7);
		
		
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
		
		borodavkoKsenia.setAssesments(Subjects.ECONOMICS, 9);
		borodavkoKsenia.setAssesments(Subjects.ECONOMICS, 8);
		borodavkoKsenia.setAssesments(Subjects.ECONOMICS, 7);
		borodavkoKsenia.setAssesments(Subjects.ECONOMICS, 9);
		borodavkoKsenia.setAssesments(Subjects.JAVA, 9);
		borodavkoKsenia.setAssesments(Subjects.JAVA, 8);
		borodavkoKsenia.setAssesments(Subjects.JAVA, 9);
		borodavkoKsenia.setAssesments(Subjects.JAVA, 10);
		borodavkoKsenia.setAssesments(Subjects.MATH, 9);
		borodavkoKsenia.setAssesments(Subjects.MATH, 9);
		borodavkoKsenia.setAssesments(Subjects.MATH, 9);
		borodavkoKsenia.setAssesments(Subjects.MATH, 9);
		borodavkoKsenia.setAssesments(Subjects.ENGLISH, 9);
		borodavkoKsenia.setAssesments(Subjects.ENGLISH, 6);
		borodavkoKsenia.setAssesments(Subjects.ENGLISH, 10);
		borodavkoKsenia.setAssesments(Subjects.ENGLISH, 9);
		
		
		
		
		
		Group groupFirstMath = new Group();
		groupFirstMath.setGroup(petrIvanov);
		Group groupSecondMath = new Group();
		groupSecondMath.setGroup(borodavkoKsenia);
		Group groupThirdMath = new Group();
		groupThirdMath.setGroup(plutMaria);
		Group groupFourthMath = new Group();
		groupFourthMath.setGroup(ivanPetrov);
		
		Faculty mathematicalFaculty =new Faculty();
		mathematicalFaculty.setFaculty(Groups.FIRST, groupFirstMath);
		mathematicalFaculty.setFaculty(Groups.SECOND, groupSecondMath);
		mathematicalFaculty.setFaculty(Groups.THIRD, groupThirdMath);
		mathematicalFaculty.setFaculty(Groups.FOURTH, groupFourthMath);
		
		nehaySemen.setAssesments(Subjects.ENGLISH, 9);
		nehaySemen.setAssesments(Subjects.ENGLISH, 9);
		nehaySemen.setAssesments(Subjects.ENGLISH, 9);
		nehaySemen.setAssesments(Subjects.ENGLISH, 9);
		nehaySemen.setAssesments(Subjects.MATH, 9);
		nehaySemen.setAssesments(Subjects.ENGLISH, 9);
		nehaySemen.setAssesments(Subjects.MATH, 6);
		nehaySemen.setAssesments(Subjects.MATH, 5);
		nehaySemen.setAssesments(Subjects.MATH, 9);
		nehaySemen.setAssesments(Subjects.JAVA, 9);
		nehaySemen.setAssesments(Subjects.JAVA, 10);
		nehaySemen.setAssesments(Subjects.JAVA, 9);
		nehaySemen.setAssesments(Subjects.JAVA, 9);
		nehaySemen.setAssesments(Subjects.ECONOMICS, 9);
		nehaySemen.setAssesments(Subjects.ECONOMICS, 10);
		nehaySemen.setAssesments(Subjects.ECONOMICS, 7);
		nehaySemen.setAssesments(Subjects.ECONOMICS, 5);
		nehaySemen.setAssesments(Subjects.ECONOMICS, 9);
		
		kripanValentin.setAssesments(Subjects.ENGLISH, 9);
		kripanValentin.setAssesments(Subjects.ENGLISH, 7);
		kripanValentin.setAssesments(Subjects.ENGLISH, 6);
		kripanValentin.setAssesments(Subjects.ENGLISH, 9);
		kripanValentin.setAssesments(Subjects.JAVA, 7);
		kripanValentin.setAssesments(Subjects.JAVA, 9);
		kripanValentin.setAssesments(Subjects.JAVA, 8);
		kripanValentin.setAssesments(Subjects.JAVA, 9);
		kripanValentin.setAssesments(Subjects.MATH, 6);
		kripanValentin.setAssesments(Subjects.MATH, 9);
		kripanValentin.setAssesments(Subjects.MATH, 8);
		kripanValentin.setAssesments(Subjects.MATH, 9);
		kripanValentin.setAssesments(Subjects.ECONOMICS, 9);
		kripanValentin.setAssesments(Subjects.ECONOMICS, 10);
		kripanValentin.setAssesments(Subjects.ECONOMICS, 9);
		kripanValentin.setAssesments(Subjects.ECONOMICS, 9);
		
		demeshMaria.setAssesments(Subjects.ENGLISH, 9);
		demeshMaria.setAssesments(Subjects.ENGLISH, 7);
		demeshMaria.setAssesments(Subjects.ENGLISH, 7);
		demeshMaria.setAssesments(Subjects.ENGLISH, 9);
		demeshMaria.setAssesments(Subjects.MATH, 8);
		demeshMaria.setAssesments(Subjects.MATH, 9);
		demeshMaria.setAssesments(Subjects.MATH, 9);
		demeshMaria.setAssesments(Subjects.MATH, 6);
		demeshMaria.setAssesments(Subjects.JAVA, 9);
		demeshMaria.setAssesments(Subjects.JAVA, 5);
		demeshMaria.setAssesments(Subjects.JAVA, 6);
		demeshMaria.setAssesments(Subjects.JAVA, 9);
		demeshMaria.setAssesments(Subjects.ECONOMICS, 8);
		demeshMaria.setAssesments(Subjects.ECONOMICS, 6);
		demeshMaria.setAssesments(Subjects.ECONOMICS, 9);
		demeshMaria.setAssesments(Subjects.ECONOMICS, 10);
		
		mironchikovaViktoria.setAssesments(Subjects.ENGLISH, 9);
		mironchikovaViktoria.setAssesments(Subjects.ENGLISH, 8);
		mironchikovaViktoria.setAssesments(Subjects.ENGLISH, 7);
		mironchikovaViktoria.setAssesments(Subjects.ENGLISH, 9);
		mironchikovaViktoria.setAssesments(Subjects.ECONOMICS, 9);
		mironchikovaViktoria.setAssesments(Subjects.ECONOMICS, 10);
		mironchikovaViktoria.setAssesments(Subjects.ECONOMICS, 9);
		mironchikovaViktoria.setAssesments(Subjects.ECONOMICS, 9);
		mironchikovaViktoria.setAssesments(Subjects.JAVA, 9);
		mironchikovaViktoria.setAssesments(Subjects.JAVA, 9);
		mironchikovaViktoria.setAssesments(Subjects.JAVA, 9);
		mironchikovaViktoria.setAssesments(Subjects.JAVA, 8);
		mironchikovaViktoria.setAssesments(Subjects.MATH, 9);
		mironchikovaViktoria.setAssesments(Subjects.MATH, 10);
		mironchikovaViktoria.setAssesments(Subjects.MATH, 9);
		mironchikovaViktoria.setAssesments(Subjects.MATH, 9);
		
		
		Group groupFirstChemical = new Group();
		groupFirstChemical.setGroup(nehaySemen);
		Group groupSecondChemical = new Group();
		groupSecondChemical.setGroup(kripanValentin);
		Group groupThirdChemical = new Group();
		groupThirdChemical.setGroup(demeshMaria);
		Group groupFourthChemical = new Group();
		groupFourthChemical.setGroup(mironchikovaViktoria);
		
		
		Faculty chemicalFaculty = new Faculty();
		chemicalFaculty.setFaculty(Groups.FIRST, groupFirstChemical);
		chemicalFaculty.setFaculty(Groups.SECOND, groupSecondChemical);
		chemicalFaculty.setFaculty(Groups.THIRD, groupThirdChemical);
		chemicalFaculty.setFaculty(Groups.FOURTH, groupFourthChemical);
		
		
		lastovkaValeria.setAssesments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssesments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssesments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssesments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssesments(Subjects.JAVA, 7);
		lastovkaValeria.setAssesments(Subjects.JAVA, 7);
		lastovkaValeria.setAssesments(Subjects.JAVA, 7);
		lastovkaValeria.setAssesments(Subjects.JAVA, 7);
		lastovkaValeria.setAssesments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssesments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssesments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssesments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssesments(Subjects.MATH, 7);
		lastovkaValeria.setAssesments(Subjects.MATH, 7);
		lastovkaValeria.setAssesments(Subjects.MATH, 7);
		lastovkaValeria.setAssesments(Subjects.MATH, 7);
		
		nichipurchikAleksey.setAssesments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssesments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssesments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssesments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssesments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssesments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssesments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssesments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssesments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssesments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssesments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssesments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssesments(Subjects.JAVA, 7);
		nichipurchikAleksey.setAssesments(Subjects.JAVA, 7);
		nichipurchikAleksey.setAssesments(Subjects.JAVA, 7);
		nichipurchikAleksey.setAssesments(Subjects.JAVA, 7);
		
		sidorenkoKsenia.setAssesments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssesments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssesments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssesments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssesments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssesments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssesments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssesments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssesments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssesments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssesments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssesments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssesments(Subjects.MATH, 7);
		sidorenkoKsenia.setAssesments(Subjects.MATH, 7);
		sidorenkoKsenia.setAssesments(Subjects.MATH, 7);
		sidorenkoKsenia.setAssesments(Subjects.MATH, 7);
		
		apetDima.setAssesments(Subjects.MATH, 7);
		apetDima.setAssesments(Subjects.MATH, 7);
		apetDima.setAssesments(Subjects.MATH, 7);
		apetDima.setAssesments(Subjects.MATH, 7);
		apetDima.setAssesments(Subjects.ECONOMICS, 7);
		apetDima.setAssesments(Subjects.ECONOMICS, 7);
		apetDima.setAssesments(Subjects.ECONOMICS, 7);
		apetDima.setAssesments(Subjects.ECONOMICS, 7);
		apetDima.setAssesments(Subjects.ENGLISH, 7);
		apetDima.setAssesments(Subjects.ENGLISH, 7);
		apetDima.setAssesments(Subjects.ENGLISH, 7);
		apetDima.setAssesments(Subjects.ENGLISH, 7);
		apetDima.setAssesments(Subjects.JAVA, 7);
		apetDima.setAssesments(Subjects.JAVA, 7);
		apetDima.setAssesments(Subjects.JAVA, 7);
		apetDima.setAssesments(Subjects.JAVA, 7);
		
		
		Group groupFirstPhysics = new Group();
		groupFirstPhysics.setGroup(lastovkaValeria);
		Group groupSecondPhysics = new Group();
		groupSecondPhysics.setGroup(nichipurchikAleksey);
		Group groupThirdPhysics = new Group();
		groupThirdPhysics.setGroup(sidorenkoKsenia);
		Group groupFourthPhysics = new Group();
		groupFourthPhysics.setGroup(apetDima);
		
		Faculty physicsFaculty = new Faculty();
		physicsFaculty.setFaculty(Groups.FIRST, groupFirstPhysics);
		physicsFaculty.setFaculty(Groups.SECOND, groupSecondPhysics);
		physicsFaculty.setFaculty(Groups.THIRD, groupThirdPhysics);
		physicsFaculty.setFaculty(Groups.FOURTH, groupFourthPhysics);
		
		
		University university = new University();
		university.setUnivetsity(Faculties.CHEMICAL, chemicalFaculty);
		university.setUnivetsity(Faculties.MATHEMATICAL, mathematicalFaculty);
		university.setUnivetsity(Faculties.PHYSICS, physicsFaculty);
		
		
		System.out.println("Math for 2 group" + mathematicalFaculty.getSubjectAverageAssesment(Subjects.MATH, Groups.SECOND));
		System.out.println("Math for 1 group" + groupFirstMath.getSubjectAverageAssesment(Subjects.MATH));
		
		System.out.println("Faculty math , JAVA, 3 group: " + mathematicalFaculty.getSubjectAverageAssesment(Subjects.JAVA,Groups.THIRD));
		
		System.out.println("university economics,faculty chemical:  " + university.getSubjectAverageAssesment(Subjects.ECONOMICS, Faculties.CHEMICAL));
		System.out.println("university math: "+ university.getSubjectAverageAssesment(Subjects.MATH));
		
		System.out.println("Chemical faculty , ENGLISH ,1 group: " +  chemicalFaculty.getSubjectAverageAssesment(Subjects.ENGLISH, Groups.FIRST));
		System.out.println("university java: " + university.getSubjectAverageAssesment(Subjects.JAVA));
		System.out.println("university english:  " + university.getSubjectAverageAssesment(Subjects.ENGLISH));
		
		
	
		
	}

}
