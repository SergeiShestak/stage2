package exceptions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sources.Groups;
import sources.Subjects;

public class Group extends University {
	
	Set<Student> group = new HashSet<>();
	
	public Group () {}
	
	public double getSubjectAverageAssesment(Subjects subject) {
		List<Double> listSubjectAssesments = new ArrayList<>();
		double groupSubjectAverageAssesment = 0;
		
		for(Student student:group) {
			
			listSubjectAssesments.add(student.getSubjectAverageAssesment(subject));
		}
		
		//System.out.println(listSubjectAssesments.toString());
		
		for(Double asses:listSubjectAssesments) {
			
			groupSubjectAverageAssesment += asses;
		}
		
		return groupSubjectAverageAssesment/listSubjectAssesments.size();
		
	}

	public Set<Student> getGroup() {
		return group;
	}
	
	public void setGroup(Student student){
		
		this.group.add(student);
	}

}
