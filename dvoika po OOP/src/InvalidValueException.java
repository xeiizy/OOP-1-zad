public class InvalidValueException extends RuntimeException{
    public InvalidValueException (String className,String methodName,String valueName) {
        super("The value of the variable "+valueName+" invalid in method "+methodName+" of class "+className);
    }
}
