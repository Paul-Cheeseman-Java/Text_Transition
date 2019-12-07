package com.paulc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {

    /*
        Aim:
        To read in a text file (from a user selected source, with exception handling)
        Reverse all the words (read into an array, then run through that array in reverse for output array.length)
        Output to a text file

        Also one for reading and writing objects

     */


    /*
        JDK7 introduced the try-with-resources statement, which simplifies the process of
        closing streams. You no longer need to write explicit code to close streams because
        the JVM will automatically close the stream for you, whether an exception occurred
        or not. All examples used in this article use the try-with-resources statement for
        importing, loading, parsing and closing files.

     */


      /*
        Have a text file, user selects own (or option 1,2,3) and then has to guess word
        that appears in the most amount of line.
        Have a text file, user selects own (or option 1,2,3) and then has to guess word
        that appears within the most amount of lines.
        Read a a whole file (buffered reader), can use contains() as returns a string
        Use scanner to read in

        Word (apart from 'the', 'a', 'I', 'and') that appear the most in text

        Show word and count after each guess (also list out on file read in)


        Read in/out - saving state of something? (list of tried words)
        --------------------------------------------------------------------
        Read in a text file of vowels separated by comma (scanner)
        Read in a text file of vowels con by comma (scanner)
        Computer picks a random word from input?
        Read whole file in for something? - when complete, read in whole file so user can check results?
        Different version which counts individual amount of words (scanner?)
        Have a explanatory note that what to use contrived case of using a non-tokenised input and tokenised input
        Have a BufferedReader version that does the "most amount of lines) lines
        Have a Scanner that does most amount of words


     */

    public static void main(String[] args) {
	// write your code here

        //FileReader = Char at a time
        //BufferedReader = Line at a time
        //FileInputStream = Byte at a time, used for images/audio (can be used as FileReader but need ot cast to ASCII
        //Files.readAllLines() = Reads all
        //Scanner

        //System.out.println("Separator: " + System.getProperty("file.separator"));

        // ****************************************************************
        // Need to do a character read in, word and also line for examples!
        // ****************************************************************
        // Put above into own classes (the could do different things to text file
        // ****************************************************************


        Game game = new Game();
        //game.menu();
        //System.out.println("Appears: " +game.countWords("baaap"));
        //game.reverseWord("Babbblooo!");

        //game.writeWordsToFile(game.reverseLettersOfWords(game.readLinesFromFile()));
        //game.writeWordsToFile(game.reverseWordsOrder(game.readLinesFromFile()));
        game.writeWordsToFile(game.wordsToLines(game.reverseWordsOrder(game.readLinesFromFile())));

        

        /*
        final String FILENAME = "C:\\Users\\Monkey\\Java11Projects\\Text Transition\\input.txt";
        //using try with resources so the *stream?* is auto closed (no need to close in a finally block)
        //try(BufferedReader inputSource = new BufferedReader(new FileReader(FILENAME))){



        //https://www.baeldung.com/java-scanner
        //String result = scanner.findInLine("wo..d");


         */

        System.out.println("\u00BF");


    }

}







