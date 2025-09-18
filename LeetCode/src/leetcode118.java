//Leetcode 118. Pascal's Triangle

//Given an integer numRows, return the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//
//
//
//Example 1:
//
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//Example 2:
//
//Input: numRows = 1
//Output: [[1]]
//
//
//Constraints:
//
//        1 <= numRows <= 30

import java.util.*;

class leetcode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int n = 0; n < numRows; n++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int val = 1;
            for(int i = 1; i <= n; i++){
                val = val * (n - i + 1)/i;
                row.add(val);
            }
            res.add(row);
        }
        return res;
    }
}