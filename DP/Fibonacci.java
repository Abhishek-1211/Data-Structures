import java.util.HashMap;

import static java.io.IO.print;
import static java.io.IO.println;

int fibonaci(int n){
    int []temp =new int[n+1];
    temp[0]=0;
    temp[1]=1;
    for(int i=2;i<=n;i++){
        temp[i]=temp[i-2]+temp[i-1];
        print(temp[i]+" ");
    }
    println("");
    return temp[n];
}

int fibonaciRecursive(int n){

    HashMap<Integer,Integer> map = new HashMap<>();
    return fibUtil(map,n);
}

int fibUtil(HashMap<Integer,Integer> map, int n){

    if(n<=1)
        return n;

    if(!map.containsKey(n))
        map.put(n,fibUtil(map,n-1)+ fibUtil(map,n-2));

    return map.get(n);
}
void main(){
    int n = 11;
    //int res= fibonaci(n);
    int recursiveAns= fibonaciRecursive(11);
    println(recursiveAns);



}
