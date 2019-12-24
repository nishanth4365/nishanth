public int countHi(String str) {
int c =0;
  if (str.length() ==1 && str.charAt(0) == 'h')
  c = 0;
  else
  {
  for(int i = 0;i<str.length();i++) {
    if ( (str.charAt(i) == 'h') && (str.charAt(i+1) == 'i') )
     c+=1;
     }
     }
     return c;
}
