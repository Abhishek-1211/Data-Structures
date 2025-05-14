

import static java.io.IO.print;/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
more than once.

Input: s = "IceCreAm"
Output: "AceCreIm"


 */
void main(){
    String s ="IceCreAm";
    String ans = reverseVowels(s);
    print(ans);
}

String reverseVowels(String s){

    //StringBuilder str = new StringBuilder(s);
    char [] str = s.toCharArray();
    int start =0;
    int end = s.length()-1;

    while (start<=end){

        if(isVowel(str[start]) && isVowel(str[end])){
            char temp = str[start];
            str[start]= str[end];
            str[end]=temp;
            start++;
            end--;
        }
        else {
            if(!isVowel(str[start]))
                start++;
            if(!isVowel(str[end]))
                end--;
        }
    }

    return String.valueOf(str);

}

boolean isVowel(char ch){
    char chr = Character.toLowerCase(ch);
    if (chr=='a'|| chr =='e'|| chr =='i'|| chr == 'o' || chr =='u')
        return true;
    return false;
}