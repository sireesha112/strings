public boolean catDog(String str) {
 int s1=0;int s2=0;
  int n=str.length();
  for(int i=0;i<n-2;i++){
     if(str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t')
   s1++;
   if(str.charAt(i)=='d' && str.charAt(i+1)=='o' && str.charAt(i+2)=='g')
   s2++;
 }
 if(s1==s2)
 return true;
 else
 return false;
}  

