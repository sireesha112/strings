public String doubleChar(String str) {
  String ans="";
  int n=str.length();
  for(int i=0; i<n; i++){
    ans=ans+str.charAt(i);
    ans=ans+str.charAt(i);
  }
  return ans;
  }
