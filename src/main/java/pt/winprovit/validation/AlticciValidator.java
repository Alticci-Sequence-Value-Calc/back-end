package pt.winprovit.validation;

import pt.winprovit.exception.AlticciException;

public class AlticciValidator
{    
    public static final String ONLY_POSITIVE_NUMBER_ARE_ALLOWED = "Only positive number are allowed";

    public static void validate(int n) throws AlticciException {
        //Validate proper format
        if(n < 0) {
            throw new AlticciException(ONLY_POSITIVE_NUMBER_ARE_ALLOWED);
        }
    }
}