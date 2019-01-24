package com.codegym.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Catching custom exceptions
1. Analyze the exceptions thrown by the BEAN.throwExceptions method.
2. The handleExceptions method must call the BEAN.throwExceptions method and handle exceptions:
2.1. if there is a FileSystemException, then log it (call the BEAN.log method) and rethrow
2.2. if there is a CharConversionException or any other IOException, then just log it (call the BEAN.log method)
3. Add to the handleExceptions method signature the exception class you throw in Item 2.1.
4. In the main method, handle the remaining exception by logging it. Use try-catch

Hint:
If you capture a MyException and you didn't want to catch it, you can rethrow it using code like:
catch (MyException e) {
throw e;
}

Requirements:
1. The handleExceptions method must call the BEAN.throwExceptions method.
2. The handleExceptions method should log the FileSystemException (call the BEAN.log method), and then rethrow it.
3. The handleExceptions method should only log (call the BEAN.log method) the CharConversionException.
4. The handleExceptions method should only log any IOException.
5. Add the FileSystemException class to the signature of the handleExceptions method.
6. The main method should use try-catch.
7. The main method should log the exceptions thrown by the handleExceptions method.

*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
        } catch (FileSystemException fse) {
            BEAN.log(fse);
        }
    }

    public static void handleExceptions() throws FileSystemException {
        try {
            BEAN.throwExceptions();
        } catch (FileSystemException fse) {
            BEAN.log(fse);
            throw fse;
        } catch (CharConversionException cce) {
            BEAN.log(cce);
        } catch (IOException ioe) {
            BEAN.log(ioe);
        }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
