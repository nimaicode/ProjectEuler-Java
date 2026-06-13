
public class PE0002{

    public static void main(String args[]){

        int term1 = 0;

        int term2 = 1;
    
        int temp;


        int sum = 0;



        

        for(int i = 0 ; sum < 4000000; i++){
            
            temp = term2;

            term2 += term1;

            term1 = temp;

            if(term2 % 2 ==0){
                sum+= term2;
            }
        }

        System.out.println(sum);


    }





}