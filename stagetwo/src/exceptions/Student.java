package exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import sources.Subjects;


public class Student extends University{
	
	
	String namePlusSurname;
	
	
	Map<String,MultiValuedMap<Subjects,Integer>> studentObj = new HashMap<>(); 
	MultiValuedMap<Subjects,Integer> assesments = new ArrayListValuedHashMap<>();
	
	
	public Student(String namePlusSurname) {
		
		studentObj.put(namePlusSurname, assesments);
	}
	
	public void setAssesments (Subjects subject,Integer gottenAssesment) {  
		
		assesments.put(subject,gottenAssesment);
	}
	
	public double getOverallAverageAssesment() {
		
		List<Integer> overallAssesments = new ArrayList<>();
		
		double sumAssesments = 0;
		
		for(int asses:assesments.values()) {
			
			overallAssesments.add(asses);
			}
			for(int res:overallAssesments) {
				
				sumAssesments += res;
			}
			return sumAssesments/overallAssesments.size();
		
	}
	
	
	public double getSubjectAverageAssesment(Subjects subject) {
		
		double sumAssesments = 0;
		List<Integer> subjectAssesments = new ArrayList<>();
		
		
		for(Integer key:assesments.get(subject)) {
				
			    subjectAssesments.add(key);	
		}
		for(Integer asses:subjectAssesments) {
			
			sumAssesments += asses;
		}
		return sumAssesments/subjectAssesments.size();
    }
	
	
	public String toString() {
		
		return "Student: " + studentObj;
	}



}


