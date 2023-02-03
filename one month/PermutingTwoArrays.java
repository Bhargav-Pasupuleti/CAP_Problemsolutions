 public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
     Collections.sort(A);
     Collections.sort(B,Collections.reverseOrder());
     
     int sum=0;
     boolean n=true;
     for(int i=0;i<A.size();i++){
         sum =A.get(i)+B.get(i);
         if(sum<k){
             n= false;
             break;
         }
     }
     if(n==true){
         return "YES";
     }
     return "NO";

    }

}
