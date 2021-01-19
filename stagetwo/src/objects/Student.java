package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import exceptions.AssessmentException;
import sources.StudyState;
import sources.Subjects;


public class Student implements StudyState {
	
	
	Map<String,MultiValuedMap<Subjects,Integer>> studentObject = new HashMap<>(); 
	MultiValuedMap<Subjects,Integer> assessment = new ArrayListValuedHashMap<>();
	
	
	public Student(String namePlusSurname) {
		
		studentObject.put(namePlusSurname, assessment);
	}
	
	public void setAssessments(Subjects subject, Integer gottenAssessment) throws AssessmentException {
		
		if(gottenAssessment > 0 && gottenAssessment <=10) {
			assessment.put(subject,gottenAssessment);
		}else {
			throw new AssessmentException("Invalid assessment, it must be between 1 to 10 ");
		}
	}
	
	
	public double getOverallAverageAssessment() {
		
		List<Integer> overallAssessments = new ArrayList<>();
		double sumAssessments = 0;
		
		try {
			if(assessment.isEmpty())
				throw new IllegalArgumentException("Must have at least one subject");
		
			for(int asses: assessment.values()) {
				
				overallAssessments.add(asses);
				}
				for(int res:overallAssessments) {
				
					sumAssessments += res;
				}
			
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}
		return sumAssessments/overallAssessments.size();
		
	}
	
	
	public double getSubjectAverageAssessment(Subjects subject) throws AssessmentException {
		
		double sumAssessments = 0;
		List<Integer> subjectAssesments = new ArrayList<>();
		
		try {
			if(assessment.isEmpty())
				throw new IllegalArgumentException("Must have at least one subject");
			for(Integer key: assessment.get(subject)) {
				
			    subjectAssesments.add(key);	
			}
			for(Integer asses:subjectAssesments) {
			
				sumAssessments += asses;
			
		}
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}catch (IllegalArgumentException e){
			System.out.println("Please add subject for student:  "+ e.getMessage());
		}
		return sumAssessments/subjectAssesments.size();
    }
	
	
	public String toString() {
		
		return "Student: " + studentObject;
	}



}


