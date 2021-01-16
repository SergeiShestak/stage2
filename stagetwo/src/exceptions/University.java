package exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sources.Faculties;
import sources.StudyState;
import sources.Subjects;

public class University implements StudyState{
	
	Map<Faculties,Faculty> universitySet = new HashMap<>();
	
	
	
public Map<Faculties,Faculty> getFaculties() {
		return universitySet;
	}



	public void setUnivetsity(Faculties key,Faculty faculty ) {
		universitySet.put(key, faculty);
	}



public double getSubjectAverageAssesment(Subjects subject) {
		
		double universitySubjectAverageAssesment = 0;
		List<Faculty> assesFaculty = new ArrayList<>();
		
		for(Faculty faculty:universitySet.values()) {
			
			assesFaculty.add(faculty);
		}
		
		for(Faculty listFaculty:assesFaculty) {
			
			universitySubjectAverageAssesment += listFaculty.getSubjectAverageAssesment(subject);
		}
		return universitySubjectAverageAssesment/assesFaculty.size();
		
	}
public double getSubjectAverageAssesment(Subjects subject,Faculties faculty) {
	
		double univerFacultySubjectAverageAssesment = 0;
		List<Faculty> assesRefinedFaculty = new ArrayList<>();
		
		//assesRefinedFaculty.add(universitySet.get(faculty));
		
		//for(Faculty assesRefined:assesRefinedFaculty) {
			
		//	univerFacultySubjectAverageAssesment += assesRefined.getSubjectAverageAssesment(subject, faculty);
		//}
		univerFacultySubjectAverageAssesment = universitySet.get(faculty).getSubjectAverageAssesment(subject, faculty);
		System.out.println("Average  sub facul: " + univerFacultySubjectAverageAssesment);
		
		return univerFacultySubjectAverageAssesment;///assesRefinedFaculty.size();
    }
}
