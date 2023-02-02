public static String pangrams(String s) {
    
      Set<Character> p = new HashSet<Character>();
     
 char a[] =s.replaceAll("\\s+","").toLowerCase().toCharArray();
      for(int i =0;i<a.length;i++){
          p.add(a[i]);
      }
      if(p.size()==26){
          return "pangram";
      }
      return "not pangram";
    }
