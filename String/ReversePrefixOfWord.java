package String;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch){
        int idx ;
        idx = calculateIdx(word, ch);
        System.out.println("idx" +idx);
        if(idx == -1)
            return word;
        return reversedWord(word,idx);
    }

    private String reversedWord(String word, int idx) {

        int start =0, end = idx;


        char[] charArray = new char[word.length()];
        charArray = word.toCharArray();
        //System.out.println(charArray.length);
        for(char ch : charArray){
            System.out.print(ch+" ");
        }
        System.out.println();
        char temp ='a';

        while(start<=end){
            temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        String res = new String(charArray);
        System.out.println(res);
        return res;

    }

    private int calculateIdx(String word, char ch) {
//        for(char c : word.toCharArray()){
//            if(c==ch)
//        }
        for(int i =0; i< word.length();i++){
            if(word.charAt(i)==ch)
                return i;
        }
        return -1;
    }

    public static void main(String [] args){
        ReversePrefixOfWord obj = new ReversePrefixOfWord();
        String res = obj.reversePrefix("abcdefd",'d');
        System.out.println(res);
    }
}
