package aman;

import com.sun.jdi.PathSearchingVirtualMachine;

public class MAIN {
    public static void main(String[] args) {
        int[] nums={23,45,65,78,98};
        int target=45;
        int ans=linearsearch(nums,target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element = arr[i];
            if(element==target)
            {
                return i;
            }
        }
        //if target is not found i in given array
        return -1;
    }
}
