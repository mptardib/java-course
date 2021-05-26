
class HollowDiamondPattern{
public static void main(String args[]){
int i,j;
int rows = 12;

//print upper triangle
for(i=1; i<=rows; i++){
    for(j=rows; j>i; j--){
       System.out.print(" ");//print space
    }
    
    System.out.print("*");  //print star
    for(j=1; j<(i-1)*2; j++){
       System.out.print(" ");
    }
    if(i==1){
      System.out.print("\n");//move to next line
    }
    else{
      System.out.print("*\n");
    }
}
    //print lower triangle
for(i=rows-1; i>=1; i--){
    for(j=rows; j>i; j--){
       System.out.print(" ");
    }
    System.out.print("*");
    for(j=1; j<(i-1)*2; j++){
       System.out.print(" ");
    }
    if(i==1){
      System.out.print("\n");
    }
    else{
      System.out.print("*\n");
    }
   }
  }
}