public class Index {
public static Boolean IndexCharacter(String numbers){

int acount = 0;
int bcount = 0;
int ccount = 0;
int dcount = 0;
int ecount = 0;
int fcount = 0;
int gcount = 0;
int hcount = 0;
int icount = 0;
int jcount = 0;

for(int i = 0; i < numbers.length(); i++){
  char ch =numbers.charAt(i);
  if (ch == '0'){
    acount++;
  //System.out.print("at index 0, the digit 0 appears  " + acount + "times");
}
  if(ch == '1'){
    bcount++;
 //System.out.print("at index 1, the digit 1 appears  " + bcount + "times");
}
  if(ch == '2'){
    ccount++;
 //System.out.print("at index 2, the digit 2 appears  " + ccount + "times");
}
if(ch == '3'){
    dcount++;
 //System.out.print("at index 3, the digit 3 appears  " + dcount + "times");
}
if(ch == '4'){
    ecount++;
// System.out.print("at index 4, the digit 4 appears  " + ecount + "times");
}

if(ch == '5'){
    fcount++;
 //System.out.print("at index 5, the digit 5 appears  " + fcount + "times");
}

if(ch == '6'){
    gcount++;
// System.out.print("at index 6, the digit 6 appears  " + gcount + "times");
}
if(ch == '7'){
    hcount++;
 //System.out.print("at index 7, the digit 7 appears  " + hcount + "times");
}
if(ch == '8'){
    icount++;
 //System.out.print("at index 8, the digit 8 appears  " + icount + "times");
}
if(ch == '9'){
    jcount++;
 //System.out.print("at index 9, the digit 9 appears  " + jcount + "times");
}

}
 return true;





 










}
public static void main(String[] args){
System.out.print(IndexCharacter("030"));


}
}

