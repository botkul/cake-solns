package com.ryangehring.cake.solns;

/**
 * Created by ryan on 8/28/16.
 * reverse a string in place
 */
public class P26 {

    public char[] reverse(char[] word) {

        char temp = '0';
        for (int i=0; i< (word.length/2) ; i++ ) {
            temp = word[i] ;
            word[i] = word[word.length - i - 1] ;
            word[word.length - i-1] = temp ;
        }
        return word ;
    }

}
