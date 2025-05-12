package Backtracking;

import java.util.ArrayList;
import java.util.List;

import static java.io.IO.print;

public class GenerateSubsequence {

    List<String> res = new ArrayList<>();
    void main(){
        String text1 = "abcd";
        //String text2 = "bcfdje";
        int N = text1.length()-1;
        //int length2 = text2.length();
        //println(text1.charAt(4));
        List<Character> list1 = new ArrayList<>();
        generateAllSubsequence(text1.toCharArray(),0,N,list1);

//        for(String s:list1)
//            println(s +" ");
        for(String element: res)
            print(element+ " ");

    }

    void generateAllSubsequence(char[] text,int i, int N,List<Character> list) {


        if(i>N){
            StringBuilder s = new StringBuilder();

            for(char c:list)
                s = s.append(c);
            //if(!res.contains(s.toString()))
            res.add(s.toString());

            //list.clear();
            return;
        }


//        for(String s:list)
//            print(s +" ");

        //print(i+" ");
        list.add(text[i]);
        generateAllSubsequence(text,i+1,N,list);
        list.remove(list.size()-1);
        generateAllSubsequence(text,i+1,N,list);



    }
}
