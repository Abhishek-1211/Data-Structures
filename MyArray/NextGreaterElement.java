package MyArray;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int []ans =new int[nums1.length];
        Stack<Integer> stack = new Stack<> ();
        HashMap<Integer,Integer> map = new HashMap<> ();

        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }

        int value;
        for(int i =nums2.length-1;i>=0;i--){
            value =-1;
            while(!stack.isEmpty()){
                if(stack.peek()>nums2[i]){
                    value=stack.peek();
                    break;
                }
                stack.pop();
            }

            stack.push(nums2[i]);
            nums2[i]=value;

        }
        stack.clear();

        for(int i =0;i<nums1.length;i++){
            int idx = map.get(nums1[i]);
            ans[i]=nums2[idx];
        }
        return ans;
    }

    public static void main(String []args){
        //contraint 1<=nums[i]<=100
        int [] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        NextGreaterElement obj = new NextGreaterElement();
        int [] ans =obj.nextGreaterElement(nums1,nums2);
        for(int i =0 ;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
}
