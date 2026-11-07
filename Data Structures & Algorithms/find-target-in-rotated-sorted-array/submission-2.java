class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        return search(start,end,target,nums);
    }
    static int search(int start,int end,int target,int arr[]){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2 ;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] >= arr[start]){
            if(target > arr[mid] || target < arr[start]){
                return search(mid + 1,end,target,arr);
            }else{
                return search(start,mid - 1,target,arr);
            }
        }else{
            if(target < arr[mid] || target > arr[end]){
                return search(start,mid - 1,target,arr);
            }else{
                return search(mid + 1,end,target,arr);
            }
        }
    }
}
