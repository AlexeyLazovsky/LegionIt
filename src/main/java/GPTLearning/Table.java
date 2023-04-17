package GPTLearning;

public class Table {
    public static void main(String[] args) {
        Table table=new Table();
        table.Multiplication(6);


    }

    public void Multiplication(int Inputnumber){
        if(Inputnumber>0 ){
int i=0;
            for ( i =1; i<=10;i++){
                System.out.println(Inputnumber +"x"+ i+"="+Inputnumber*i);
            }
        }


    }
}
