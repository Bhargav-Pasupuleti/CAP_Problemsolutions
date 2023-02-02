 public static void miniMaxSum(List<Integer> arr) {
    
    Collections.sort(arr);
    long min=0,max=0;
    for(int i=0; i<arr.size()-1;i++){
        min+=arr.get(i);
    }
    for(int j=arr.size()-1;j>0;j--){
        max+=arr.get(j);
    }
     System.out.println(min + " "+ max);

}
