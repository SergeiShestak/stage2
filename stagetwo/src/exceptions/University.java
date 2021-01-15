package exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sources.Faculties;
import sources.StudyState;
import sources.Subjects;

public class University implements StudyState{
	
	Map<Faculties,Faculty> university = new HashMap<>();
	
	
	
public Map<Faculties,Faculty> getFaculties() {
		return university;
	}



	public void setFaculties(Faculties faculties,Faculty faculty ) {
		;
	}



public double getSubjectAverageAssesment(Subjects subject) {
		
		double universitySubjectAverageAssesment = 0;
		List<Faculty> assesFaculty = new ArrayList<>();
		
		for(Faculty faculty:university.values()) {
			
			assesFaculty.add(faculty);
		}
		
		for(Faculty listFaculty:assesFaculty) {
			
			universitySubjectAverageAssesment += listFaculty.getSubjectAverageAssesment(subject);
		}
		return universitySubjectAverageAssesment;
		
	}
public double getSubjectAverageAssesment(Subjects subject,Faculties faculty) {
	
	
}

}
