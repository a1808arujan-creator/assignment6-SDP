package kz.aitu.registration.strategy.priority;

public class ExchangeStudentpriorityStrategy 
        implements RegistrationPriorityStrategy{

    @Override 
    public int calculatePriority(
        int studyYEar,
        double gpa,
        int waitingMintues) {
            return 500 + waitingMintues;
        }
    
   
}
