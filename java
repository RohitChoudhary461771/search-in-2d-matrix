class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        int s=0;
        int e=(row*col)-1;
        int mid=s+(e-s)/2;
        //use '/' to find row and '%' to find coloumn
        while(s<=e){
            if(matrix[mid/col][mid%col]==target){
                return true;
            }
            else if(matrix[mid/col][mid%col]<target){
                s=mid+1;
                mid=s+(e-s)/2;
            }
            else{
                e=mid-1;
                mid=s+(e-s)/2;
            }
        }
        return false;
    }
}
