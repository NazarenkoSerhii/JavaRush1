package TestExceptionAndStackTraceAndError;

import TestExceptionAndStackTraceAndError.exceptions.BadSqlException;

public class Dbservice {
    public void execute(String sql) throws BadSqlException{
        if(sql.length()<1){
            throw new BadSqlException(String.format("Bad query %s",sql));
        }
    }
}
