package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sources.Groups;
import sources.Subjects;

public class Faculty extends University {
	
	Map<Groups,Group> facultySet = new HashMap<>();
	
	
public Map<Groups,Group> getFaculty() {
		return facultySet;
	}



	public void setFaculty(Groups key,Group group) {
		facultySet.put(key,group);
	}



	public double getSubjectAverageAssesment(Subjects subject) {
		
		double facultySubjectAverageAssesment = 0;
		List<Group> subjectAssesment = new ArrayList<>();
		
		try {
			if(facultySet.isEmpty())
				throw new IllegalArgumentException("Must have at least one group on the faculty");
			subjectAssesment.addAll(facultySet.values());
			for(Group asses:subjectAssesment) {
			
				facultySubjectAverageAssesment += asses.getSubjectAverageAssesment(subject);
			}
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}catch (IllegalArgumentException e){
			System.out.println("Please add a group: " + e.getMessage());
		}
		return facultySubjectAverageAssesment/subjectAssesment.size();
		
	}
	

	public double getSubjectAverageAssesment(Subjects subject,Groups key) {
	
		double facultySubjectAverageAssesment = 0;
		List<Group> subjectAssesment = new ArrayList<>();
		try {
			if(facultySet.isEmpty())
				throw new IllegalArgumentException("Must have at least one group on the faculty");
			subjectAssesment.add(facultySet.get(key));
	
			for(Group asses:subjectAssesment) {
		
				facultySubjectAverageAssesment += asses.getSubjectAverageAssesment(subject);
		}
		}catch(NullPointerException e) {
			System.err.println("Exception e" + e.getMessage());
		}catch (IllegalArgumentException e){
			System.out.println("Please add a group: " + e.getMessage());
		}
		return facultySubjectAverageAssesment/subjectAssesment.size();
	
	}

}
