public static void plusMinus(List<Integer> arr) {
    
    float j=0,l=0,m=0;
    float n = arr.size();
    for(int i=0; i<n;i++){
        int k = arr.get(i);
        if(k>0){
            j++;
        }else if(k<0){
            l++;
        }else{
            m++;
        }
    }
    DecimalFormat df= new DecimalFormat("#.000000");
    System.out.println(df.format(j/n));
    System.out.println(df.format(l/n));
    System.out.println(df.format(m/n));
    

    }
