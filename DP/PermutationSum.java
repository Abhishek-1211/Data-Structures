package DP;

import static java.io.IO.println;

/*
You are required to find all possible permutation to make 'N' as sum of 1,3,5
e.g if N=6 then no. of  possible permutation =8
[1,1,1,1,1,1]
[1,1,1,3]
[1,1,3,1]
[1,3,1,1]
[3,1,1,1]
[3,3]
[1,5]
[5,1]
 */
public class PermutationSum {
    void main(){
        int N=8;
        println(permutationSum(N));
    }

    int permutationSum(int N){

        if(N==0)
            return 1;

        if(N<0)
            return 0;

        return permutationSum(N-5)
                + permutationSum(N-3)
                + permutationSum(N-1);
    }
}
