package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import exceptions.AssesmentException;
import sources.Subjects;


public class Student extends University{
	
	
	String namePlusSurname;
	
	
	Map<String,MultiValuedMap<Subjects,Integer>> studentObject = new HashMap<>(); 
	MultiValuedMap<Subjects,Integer> assesments = new ArrayListValuedHashMap<>();
	
	
	public Student(String namePlusSurname) {
		
		studentObject.put(namePlusSurname, assesments);
	}
	
	public void setAssesments (Subjects subject,Integer gottenAssesment) throws AssesmentException{ 
		
		if(gottenAssesment > 0 && gottenAssesment <=10) {
			assesments.put(subject,gottenAssesment);
		}else {
			throw new AssesmentException("Invalid assesment, it must be between 1 to 10 ");
		}
	}
	
	
	public double getOverallAverageAssesment() {
		
		List<Integer> overallAssesments = new ArrayList<>();
		double sumAssesments = 0;
		
		try {
			if(assesments.isEmpty())
				throw new IllegalArgumentException("Must have at least one subject");
		
			for(int asses:assesments.values()) {
				
				overallAssesments.add(asses);
				}
				for(int res:overallAssesments) {
				
					sumAssesments += res;
				}
			
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}
		return sumAssesments/overallAssesments.size();
		
	}
	
	
	public double getSubjectAverageAssesment(Subjects subject) {
		
		double sumAssesments = 0;
		List<Integer> subjectAssesments = new ArrayList<>();
		
		try {
			if(assesments.isEmpty())
				throw new IllegalArgumentException("Must have at least one subject");
			for(Integer key:assesments.get(subject)) {
				
			    subjectAssesments.add(key);	
			}
			for(Integer asses:subjectAssesments) {
			
				sumAssesments += asses;
			
		}
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}
		return sumAssesments/subjectAssesments.size();
    }
	
	
	public String toString() {
		
		return "Student: " + studentObject;
	}



}


