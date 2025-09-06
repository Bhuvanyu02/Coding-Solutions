class Solution {
    boolean res(String s,int i, int n){
        if(i>=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
       return res(s,i+1,n);
    }
