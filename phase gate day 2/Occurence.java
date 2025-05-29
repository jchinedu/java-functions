public class Occurence{
public static int Character(String word, char ch){
 int index = 0;
 int length = word.length();
 for(int john = 0; john < length; john++){
   if(ch == word.charAt(john)){
  	index++;
     
}
}
	return index;
	
}

public static void main(String[] args){
System.out.print(Character("hello", 'o'));
}
}

    
