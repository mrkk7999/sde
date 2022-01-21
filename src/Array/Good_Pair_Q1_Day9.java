package Array;

//question
//Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B).
// Check if any good pair exist or not.


//https://www.scaler.com/academy/mentee-dashboard/class/9581/assignment/problems/11160?navref=cl_tt_nv

public class Good_Pair_Q1_Day9 {
    public int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++)
        {
            for(int j=1;j<A.length;j++)
            {
                if(i!=j && A[i]+A[j]==B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

    }
}
