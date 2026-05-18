class linearsearch{
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[]array={25,65,78,98,19,1};
        int num=76;
        int result = linearSearch(array,num);
        System.out.println(result);
    }
}