package DP;

import java.util.ArrayList;
import java.util.List;

import static java.io.IO.print;
import static java.io.IO.println;

/*
Problem:Given two strings text1 and text2, return the length of their longest common subsequence.
If there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters (can be none)
 deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 */
public class LongestCommonSubsequence {

    void main(){

        String text1= "abcde";
        String text2 = "ace";
        println(longestCommonSubsequence(text1,text2,text1.length()-1,text2.length()-1));
    }

    int longestCommonSubsequence(String text1, String text2, int N, int M) {
        if(N<0 || M<0)
            return 0;

        if(text1.charAt(N)==text2.charAt(M))
            return 1+ longestCommonSubsequence(text1,text2, N-1,M-1);

        return Math.max(longestCommonSubsequence(text1,text2,N,M-1),
                longestCommonSubsequence(text1,text2,N-1,M));
    }
}
