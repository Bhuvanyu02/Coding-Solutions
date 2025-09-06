class Solution {
    void rev(int i, int[] arr, int n){
        if(i>=n/2){return;}
        
        int t=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=t;
        
        rev(i+1,arr,n);

    }
    public void reverse(int[] arr, int n) {
        rev(0,arr,n);
    }
}

