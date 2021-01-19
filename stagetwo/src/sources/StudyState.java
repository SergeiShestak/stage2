package sources;

import exceptions.AssessmentException;

public interface StudyState {
	
	public double getSubjectAverageAssessment(Subjects subject) throws AssessmentException;

}
