class Solution {
    void printnum(int i, int n){
      if(i<=n){
        System.out.println(i);
        printnum(i+1,n);
      }
    }
    public void printNumbers(int n) {
        // Your code goes here
        printnum(1,n);
    }
}