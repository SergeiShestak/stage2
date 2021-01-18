package objects;

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
		
		try {
			if(universitySet.isEmpty())
				throw new IllegalArgumentException("Must have at least one faculty");
			assesFaculty.addAll(universitySet.values());
		
			for(Faculty listFaculty:assesFaculty) {
			
				universitySubjectAverageAssesment += listFaculty.getSubjectAverageAssesment(subject);
			}
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}catch(IllegalArgumentException e){
			System.out.println("Please add a faculty:  " + e.getMessage());
		}
		return universitySubjectAverageAssesment/assesFaculty.size();
		
	}
public double getSubjectAverageAssesment(Subjects subject,Faculties faculty) {
	
		double univerFacultySubjectAverageAssesment = 0;
		try {
			if(universitySet.isEmpty())
				throw new IllegalArgumentException("Must have at least one faculty");
		univerFacultySubjectAverageAssesment += universitySet.get(faculty).getSubjectAverageAssesment(subject);
		}catch(NullPointerException e){
			System.err.println("Exception is: "+ e.getMessage());
		}catch (IllegalArgumentException e){
			System.out.println("Please add a faculty: " + e.getMessage());
		}
		
		return univerFacultySubjectAverageAssesment;
    }
}
