package d33Exceptions_Enum;

public class InvalidStudentGradeException extends Exception{
    //by inheriting, I can make this class exception class

    public InvalidStudentGradeException(String message){

        super(message);
    }
}