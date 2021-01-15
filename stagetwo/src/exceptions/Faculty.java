package exceptions;

import java.util.HashSet;
import java.util.Set;

import sources.Subjects;

public class Faculty extends University {
	
	Set<Group> groupes = new HashSet<>();
	
	
	
public Set<Group> getGroupes() {
		return groupes;
	}



	public void setGroupes(Set<Group> groupes) {
		this.groupes = groupes;
	}



public double getSubjectAverageAssesment(Subjects subject) {
		
		double facultySubjectAverageAssesment = 0;
		
		for(Group group:groupes) {
			
			facultySubjectAverageAssesment += group.getSubjectAverageAssesment(subject);
		}
		return facultySubjectAverageAssesment;
		
	}
	

}
