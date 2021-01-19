package objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exceptions.AssessmentException;
import sources.StudyState;
import sources.Subjects;

public class Group implements StudyState {
	
	Set<Student> group = new HashSet<>();
	
	public Group () {}
	
	public double getSubjectAverageAssessment(Subjects subject) throws AssessmentException {
		List<Double> listSubjectAssessments = new ArrayList<>();
		double groupSubjectAverageAssessment = 0;
		try {
			if(group.isEmpty())
				throw new IllegalArgumentException("Must have at least one student");
			for(Student student:group) {
			
				listSubjectAssessments.add(student.getSubjectAverageAssessment(subject));
			}
		
			for(Double asses:listSubjectAssessments) {
			
				groupSubjectAverageAssessment += asses;
			}
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}catch (IllegalArgumentException e){
			System.out.println("Please add a student: " + e.getMessage());
		}
		
		return groupSubjectAverageAssessment/listSubjectAssessments.size();
		
	}

	public Set<Student> getGroup() {
		return group;
	}
	
	public void setGroup(Student student){
		
		this.group.add(student);
	}

}
