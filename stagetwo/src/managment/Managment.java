package managment;

import exceptions.AssessmentException;
import objects.Faculty;
import objects.Group;
import objects.Student;
import objects.University;
import sources.Faculties;
import sources.Groups;
import sources.Subjects;

public class Managment {
	
	public static void main(String[] args) throws AssessmentException {
		
		Student ivanPetrov = new Student("Ivan Petrov");
		Student petrIvanov = new Student("Petr Ivanov");
		Student apetDima = new Student("Apet Dima");
		Student bondarevAleksey = new Student("Bondarev Aleksey");
		Student plutMaria = new Student("Plut Maria");
		Student sidorenkoKsenia = new Student("Sidorenko Ksenia");
		Student nichipurchikAleksey = new Student("Nichipurchik Aleksey");
		Student lastovkaValeria = new Student("Lastovka Valeria");
		Student mironchikovaViktoria = new Student("Mironchikova Viktoria");
		Student demeshMaria = new Student("Demesh Maria");
		Student kripanValentin = new Student("Kripan Valentin");
		Student nehaySemen = new Student("Nehay Semen");
		Student borodavkoKsenia = new Student("Borodavko Ksenia");
		
		
		
		ivanPetrov.setAssessments(Subjects.MATH,10);
		ivanPetrov.setAssessments(Subjects.MATH,9);
		ivanPetrov.setAssessments(Subjects.MATH,10);
		ivanPetrov.setAssessments(Subjects.MATH,10);
		ivanPetrov.setAssessments(Subjects.ENGLISH, 9);
		ivanPetrov.setAssessments(Subjects.ENGLISH, 10);
		ivanPetrov.setAssessments(Subjects.ENGLISH, 7);
		ivanPetrov.setAssessments(Subjects.ENGLISH, 8);
		ivanPetrov.setAssessments(Subjects.ECONOMICS,8);
		ivanPetrov.setAssessments(Subjects.ECONOMICS,9);
		ivanPetrov.setAssessments(Subjects.ECONOMICS,10);
		ivanPetrov.setAssessments(Subjects.ECONOMICS,7);
		ivanPetrov.setAssessments(Subjects.JAVA,10);
		ivanPetrov.setAssessments(Subjects.JAVA,8);
		ivanPetrov.setAssessments(Subjects.JAVA,9);
		ivanPetrov.setAssessments(Subjects.JAVA,10);
		
		
		petrIvanov.setAssessments(Subjects.JAVA, 7);
		petrIvanov.setAssessments(Subjects.JAVA, 10);
		petrIvanov.setAssessments(Subjects.JAVA, 9);
		petrIvanov.setAssessments(Subjects.JAVA, 8);
		petrIvanov.setAssessments(Subjects.ENGLISH,7);
		petrIvanov.setAssessments(Subjects.ENGLISH,8);
		petrIvanov.setAssessments(Subjects.ENGLISH,9);
		petrIvanov.setAssessments(Subjects.ENGLISH,7);
		petrIvanov.setAssessments(Subjects.MATH, 9);
		petrIvanov.setAssessments(Subjects.MATH, 7);
		petrIvanov.setAssessments(Subjects.MATH, 8);
		petrIvanov.setAssessments(Subjects.MATH, 10);
		petrIvanov.setAssessments(Subjects.ECONOMICS, 5);
		petrIvanov.setAssessments(Subjects.ECONOMICS, 7);
		petrIvanov.setAssessments(Subjects.ECONOMICS, 6);
		petrIvanov.setAssessments(Subjects.ECONOMICS, 9);
		petrIvanov.setAssessments(Subjects.ECONOMICS, 7);
		
		
		plutMaria.setAssessments(Subjects.ECONOMICS, 9);
		plutMaria.setAssessments(Subjects.ECONOMICS, 7);
		plutMaria.setAssessments(Subjects.ECONOMICS, 10);
		plutMaria.setAssessments(Subjects.ECONOMICS, 10);
		plutMaria.setAssessments(Subjects.MATH, 9);
		plutMaria.setAssessments(Subjects.MATH, 7);
		plutMaria.setAssessments(Subjects.MATH, 8);
		plutMaria.setAssessments(Subjects.MATH, 10);
		plutMaria.setAssessments(Subjects.ENGLISH, 10);
		plutMaria.setAssessments(Subjects.ENGLISH, 10);
		plutMaria.setAssessments(Subjects.ENGLISH, 10);
		plutMaria.setAssessments(Subjects.ENGLISH, 9);
		plutMaria.setAssessments(Subjects.JAVA, 7);
		plutMaria.setAssessments(Subjects.JAVA, 5);
		plutMaria.setAssessments(Subjects.JAVA, 8);
		plutMaria.setAssessments(Subjects.JAVA, 7);
		
		borodavkoKsenia.setAssessments(Subjects.ECONOMICS, 9);
		borodavkoKsenia.setAssessments(Subjects.ECONOMICS, 8);
		borodavkoKsenia.setAssessments(Subjects.ECONOMICS, 7);
		borodavkoKsenia.setAssessments(Subjects.ECONOMICS, 9);
		borodavkoKsenia.setAssessments(Subjects.JAVA, 9);
		borodavkoKsenia.setAssessments(Subjects.JAVA, 8);
		borodavkoKsenia.setAssessments(Subjects.JAVA, 9);
		borodavkoKsenia.setAssessments(Subjects.JAVA, 10);
		borodavkoKsenia.setAssessments(Subjects.MATH, 9);
		borodavkoKsenia.setAssessments(Subjects.MATH, 9);
		borodavkoKsenia.setAssessments(Subjects.MATH, 9);
		borodavkoKsenia.setAssessments(Subjects.MATH, 9);
		borodavkoKsenia.setAssessments(Subjects.ENGLISH, 9);
		borodavkoKsenia.setAssessments(Subjects.ENGLISH, 6);
		borodavkoKsenia.setAssessments(Subjects.ENGLISH, 10);
		borodavkoKsenia.setAssessments(Subjects.ENGLISH, 9);
		
		
		
		
		
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
		
		nehaySemen.setAssessments(Subjects.ENGLISH, 9);
		nehaySemen.setAssessments(Subjects.ENGLISH, 9);
		nehaySemen.setAssessments(Subjects.ENGLISH, 9);
		nehaySemen.setAssessments(Subjects.ENGLISH, 9);
		nehaySemen.setAssessments(Subjects.MATH, 9);
		nehaySemen.setAssessments(Subjects.ENGLISH, 9);
		nehaySemen.setAssessments(Subjects.MATH, 6);
		nehaySemen.setAssessments(Subjects.MATH, 5);
		nehaySemen.setAssessments(Subjects.MATH, 9);
		nehaySemen.setAssessments(Subjects.JAVA, 9);
		nehaySemen.setAssessments(Subjects.JAVA, 10);
		nehaySemen.setAssessments(Subjects.JAVA, 9);
		nehaySemen.setAssessments(Subjects.JAVA, 9);
		nehaySemen.setAssessments(Subjects.ECONOMICS, 9);
		nehaySemen.setAssessments(Subjects.ECONOMICS, 10);
		nehaySemen.setAssessments(Subjects.ECONOMICS, 7);
		nehaySemen.setAssessments(Subjects.ECONOMICS, 5);
		nehaySemen.setAssessments(Subjects.ECONOMICS, 9);
		
		kripanValentin.setAssessments(Subjects.ENGLISH, 9);
		kripanValentin.setAssessments(Subjects.ENGLISH, 7);
		kripanValentin.setAssessments(Subjects.ENGLISH, 6);
		kripanValentin.setAssessments(Subjects.ENGLISH, 9);
		kripanValentin.setAssessments(Subjects.JAVA, 7);
		kripanValentin.setAssessments(Subjects.JAVA, 9);
		kripanValentin.setAssessments(Subjects.JAVA, 8);
		kripanValentin.setAssessments(Subjects.JAVA, 9);
		kripanValentin.setAssessments(Subjects.MATH, 6);
		kripanValentin.setAssessments(Subjects.MATH, 9);
		kripanValentin.setAssessments(Subjects.MATH, 8);
		kripanValentin.setAssessments(Subjects.MATH, 9);
		kripanValentin.setAssessments(Subjects.ECONOMICS, 9);
		kripanValentin.setAssessments(Subjects.ECONOMICS, 10);
		kripanValentin.setAssessments(Subjects.ECONOMICS, 9);
		kripanValentin.setAssessments(Subjects.ECONOMICS, 9);
		
		demeshMaria.setAssessments(Subjects.ENGLISH, 9);
		demeshMaria.setAssessments(Subjects.ENGLISH, 7);
		demeshMaria.setAssessments(Subjects.ENGLISH, 7);
		demeshMaria.setAssessments(Subjects.ENGLISH, 9);
		demeshMaria.setAssessments(Subjects.MATH, 8);
		demeshMaria.setAssessments(Subjects.MATH, 9);
		demeshMaria.setAssessments(Subjects.MATH, 9);
		demeshMaria.setAssessments(Subjects.MATH, 6);
		demeshMaria.setAssessments(Subjects.JAVA, 9);
		demeshMaria.setAssessments(Subjects.JAVA, 5);
		demeshMaria.setAssessments(Subjects.JAVA, 6);
		demeshMaria.setAssessments(Subjects.JAVA, 9);
		demeshMaria.setAssessments(Subjects.ECONOMICS, 8);
		demeshMaria.setAssessments(Subjects.ECONOMICS, 6);
		demeshMaria.setAssessments(Subjects.ECONOMICS, 9);
		demeshMaria.setAssessments(Subjects.ECONOMICS, 10);
		
		mironchikovaViktoria.setAssessments(Subjects.ENGLISH, 9);
		mironchikovaViktoria.setAssessments(Subjects.ENGLISH, 8);
		mironchikovaViktoria.setAssessments(Subjects.ENGLISH, 7);
		mironchikovaViktoria.setAssessments(Subjects.ENGLISH, 9);
		mironchikovaViktoria.setAssessments(Subjects.ECONOMICS, 9);
		mironchikovaViktoria.setAssessments(Subjects.ECONOMICS, 10);
		mironchikovaViktoria.setAssessments(Subjects.ECONOMICS, 9);
		mironchikovaViktoria.setAssessments(Subjects.ECONOMICS, 9);
		mironchikovaViktoria.setAssessments(Subjects.JAVA, 9);
		mironchikovaViktoria.setAssessments(Subjects.JAVA, 9);
		mironchikovaViktoria.setAssessments(Subjects.JAVA, 9);
		mironchikovaViktoria.setAssessments(Subjects.JAVA, 8);
		mironchikovaViktoria.setAssessments(Subjects.MATH, 9);
		mironchikovaViktoria.setAssessments(Subjects.MATH, 10);
		mironchikovaViktoria.setAssessments(Subjects.MATH, 9);
		mironchikovaViktoria.setAssessments(Subjects.MATH, 9);
		
		
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
		
		
		lastovkaValeria.setAssessments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssessments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssessments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssessments(Subjects.ECONOMICS, 7);
		lastovkaValeria.setAssessments(Subjects.JAVA, 7);
		lastovkaValeria.setAssessments(Subjects.JAVA, 7);
		lastovkaValeria.setAssessments(Subjects.JAVA, 7);
		lastovkaValeria.setAssessments(Subjects.JAVA, 7);
		lastovkaValeria.setAssessments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssessments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssessments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssessments(Subjects.ENGLISH, 7);
		lastovkaValeria.setAssessments(Subjects.MATH, 7);
		lastovkaValeria.setAssessments(Subjects.MATH, 7);
		lastovkaValeria.setAssessments(Subjects.MATH, 7);
		lastovkaValeria.setAssessments(Subjects.MATH, 7);
		
		nichipurchikAleksey.setAssessments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssessments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssessments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssessments(Subjects.MATH, 7);
		nichipurchikAleksey.setAssessments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssessments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssessments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssessments(Subjects.ENGLISH, 7);
		nichipurchikAleksey.setAssessments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssessments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssessments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssessments(Subjects.ECONOMICS, 7);
		nichipurchikAleksey.setAssessments(Subjects.JAVA, 7);
		nichipurchikAleksey.setAssessments(Subjects.JAVA, 7);
		nichipurchikAleksey.setAssessments(Subjects.JAVA, 7);
		nichipurchikAleksey.setAssessments(Subjects.JAVA, 7);
		
		sidorenkoKsenia.setAssessments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssessments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssessments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssessments(Subjects.JAVA, 7);
		sidorenkoKsenia.setAssessments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssessments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssessments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssessments(Subjects.ECONOMICS, 7);
		sidorenkoKsenia.setAssessments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssessments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssessments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssessments(Subjects.ENGLISH, 7);
		sidorenkoKsenia.setAssessments(Subjects.MATH, 7);
		sidorenkoKsenia.setAssessments(Subjects.MATH, 7);
		sidorenkoKsenia.setAssessments(Subjects.MATH, 7);
		sidorenkoKsenia.setAssessments(Subjects.MATH, 7);
		
		apetDima.setAssessments(Subjects.MATH, 7);
		apetDima.setAssessments(Subjects.MATH, 7);
		apetDima.setAssessments(Subjects.MATH, 7);
		apetDima.setAssessments(Subjects.MATH, 7);
		apetDima.setAssessments(Subjects.ECONOMICS, 7);
		apetDima.setAssessments(Subjects.ECONOMICS, 7);
		apetDima.setAssessments(Subjects.ECONOMICS, 7);
		apetDima.setAssessments(Subjects.ECONOMICS, 7);
		apetDima.setAssessments(Subjects.ENGLISH, 7);
		apetDima.setAssessments(Subjects.ENGLISH, 7);
		apetDima.setAssessments(Subjects.ENGLISH, 7);
		apetDima.setAssessments(Subjects.ENGLISH, 7);
		apetDima.setAssessments(Subjects.JAVA, 7);
		apetDima.setAssessments(Subjects.JAVA, 7);
		apetDima.setAssessments(Subjects.JAVA, 7);
		apetDima.setAssessments(Subjects.JAVA, 7);
		
		
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

		
		try {
			System.out.printf("\n Bondarev's assess : %.2f", bondarevAleksey.getOverallAverageAssessment());
			System.out.printf("\n Math for 2 group: \t%.2f", mathematicalFaculty.getSubjectAverageAssesment(Subjects.MATH, Groups.SECOND));
			System.out.printf("\n Math for 1 group: \t%.2f", groupFirstMath.getSubjectAverageAssessment(Subjects.MATH));

			System.out.printf("\n Faculty math , java , 3 group: \t%.2f", mathematicalFaculty.getSubjectAverageAssesment(Subjects.JAVA, Groups.THIRD));

			System.out.printf("\n university, economics faculty, chemical:\t%.2f", university.getSubjectAverageAssesment(Subjects.ECONOMICS, Faculties.CHEMICAL));
			System.out.printf("\n university math: \t%.2f", university.getSubjectAverageAssessment(Subjects.MATH));

			System.out.printf("\n Chemical faculty , ENGLISH ,1 group: \t%.2f", chemicalFaculty.getSubjectAverageAssesment(Subjects.ENGLISH, Groups.FIRST));
			System.out.printf("\n university java: \t%.2f", university.getSubjectAverageAssessment(Subjects.JAVA));
			System.out.printf("\n university english: \t%.2f ", university.getSubjectAverageAssessment(Subjects.ENGLISH));
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		
	
		
	}

}
