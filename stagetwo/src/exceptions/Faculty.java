package exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		for(Group group:facultySet.values()) {
			
			subjectAssesment.add(group);
		}
		
		System.out.println("list groups is :" + subjectAssesment.toString());
		
		for(Group asses:subjectAssesment) {
			
			facultySubjectAverageAssesment += asses.getSubjectAverageAssesment(subject);
		}
		return facultySubjectAverageAssesment/subjectAssesment.size();
		
	}
	

	public double getSubjectAverageAssesment(Subjects subject,Groups group) {
	
		double facultySubjectAverageAssesment = 0;
		List<Group> subjectAssesment = new ArrayList<>();
	
		for(Group asses:facultySet.values()) {
		
			subjectAssesment.add(asses);
		}
	
		System.out.println("list groups is :" + subjectAssesment.toString());
	
		for(Group asses:subjectAssesment) {
		
			facultySubjectAverageAssesment += asses.getSubjectAverageAssesment(subject);
		}
		return facultySubjectAverageAssesment/subjectAssesment.size();
	
	}

}
