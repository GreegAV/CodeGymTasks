package com.codegym.task.task14.task1414;

/* 
MovieFactory
Read from the console to extend the functionality by analogy:
1. Figure out what the program does.
2. All classes must be inside the Solution class.
3. Add Cartoon and Thriller classes.
4. Understand how we get a SoapOpera object using the key "soapOpera".

Following the pattern used to obtain a SoapOpera object:
5. Add to MovieFactory.getMovie the ability to get a Cartoon object using the key "cartoon".
6. Add to MovieFactory.getMovie the ability to get a Thriller object using the key "thriller".
7. Read several keys (strings) from the console.
7.1. Stop reading in strings as soon as a string is entered that does not match one of the following:
 "cartoon", "thriller", "soapOpera".
8. Create a Movie movie variable, and for each entered string (key):
8.1. Get an object using MovieFactory.getMovie and assign it to the variable movie.
8.2. Display the result of calling movie.getClass().getSimpleName().


Requirements:
1. The Cartoon and Thriller classes must be static and be located inside the Solution class.
2. The MovieFactory.getMovie method must return a Cartoon object if "cartoon" is passed as an argument.
3. The MovieFactory.getMovie method must return a Thriller object if "thriller" is passed as an argument.
4. The main method must read strings from the keyboard.
5. The main method should stop reading strings from the keyboard if an invalid string is entered
(i.e. something other than "cartoon", "thriller", or "soapOpera").
6. For each string entered (including the invalid string), you must call the MovieFactory.getMovie method.
7. For each valid string entered, you need to display the simple name
(movie.getClass().getSimpleName()) of the object types returned by the MovieFactory.getMovie method.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        Movie movie;
        // User input other string, break.
        do {
            s = reader.readLine();
            movie = MovieFactory.getMovie(s);
            if (movie != null)
                System.out.println(movie.getClass().getSimpleName());
        } while (s.equals("cartoon") | s.equals("thriller") | s.equals("soapOpera"));
    }
    /*
    8. Create a variable movie in the Movie class, and for each entered string (key):
     8.1. Get an object using MovieFactory.getMovie and assign it to the variable movie.
     8.2. Display the result of calling movie.getClass().getSimpleName().
    */
    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
