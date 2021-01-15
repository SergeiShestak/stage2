package exceptions;

import java.util.HashSet;
import java.util.Set;

import sources.StudyState;
import sources.Subjects;

public class University implements StudyState{
	
	Set<Faculty> faculties = new HashSet<>();
	
	
	
public Set<Faculty> getFaculties() {
		return faculties;
	}



	public void setFaculties(Set<Faculty> faculties) {
		this.faculties = faculties;
	}



public double getSubjectAverageAssesment(Subjects subject) {
		
		double universitySubjectAverageAssesment = 0;
		
		for(Faculty faculty:faculties) {
			
			universitySubjectAverageAssesment += faculty.getSubjectAverageAssesment(subject);
		}
		return universitySubjectAverageAssesment;
		
	}

}
