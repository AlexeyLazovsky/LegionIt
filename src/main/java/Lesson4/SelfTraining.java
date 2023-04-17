package Lesson4;

public class SelfTraining {
    public static void main(String[] args) {
SelfTraining selfTraining=new SelfTraining();
        int [] inputNumbers={1,2,3,4,9};
       // System.out.println(selfTraining.has22(inputNumbers));
        System.out.println(selfTraining.arrayFront9(inputNumbers));
    }


   /* public boolean has22 (int [] inputNumbers){
        int size=inputNumbers.length;


        for (int i=0;i<size-1;i++){
            if (inputNumbers[i]==2&& inputNumbers[i+1]==2){
                return true;
            }

        }
return false;
    }
*/
  /*  public boolean lucky13 (int [] inputNumbers){
        int size=inputNumbers.length;


        for (int i=0;i<size;i++){
            if (inputNumbers[i] ==1 || inputNumbers[i]==3){
                return false;
            }

        }
        return true;
    }

*/

/*
public int  maxTriple(int [] inputnumbers){
    int size= inputnumbers.length;
    int maxNumber=inputnumbers[0];
    for (int i=1;i<size;i++){
        if (inputnumbers [i]>maxNumber) {
            maxNumber=inputnumbers[i];
        }
    }
    return  maxNumber;

}

*/

    public boolean arrayFront9(int [] inputNumbers){
        int size= inputNumbers.length;
        for (int i=0; i<size-1;i++){
            if(inputNumbers[i] ==9) {return
                    true;}
        }

        return false;
    }


}
