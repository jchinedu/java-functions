public class ClassTaskSecondLargest{
public static int SecondLargest(int[] number){
int largest = number[0];
int secondlargest = number[0];
 for(int i = 0; i < number.length; i++){
    if(number[i] > largest) {
      secondlargest = largest;
      largest = number[i];
     }else if(number[i] >= secondlargest && number[i] != largest){
        secondlargest = number[i];
      }
}
 return secondlargest;
 }
  
}       
       