public int countHi(String str)
{
  int c=0;
String s1=new String("hi");
int n=str.length();
for(int i=0;i<n-1;i++)
{
if(str.charAt(i)=='h'&&str.charAt(i+1)=='i')
c++;
}
return c;
}