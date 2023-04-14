import java.util.ArrayList;
import java.util.List;

public class QuestionThree {


    public static boolean ifPrime(int n){
        if(n == 0 || n == 1)
            return false;
        if(n == 2)
            return true;

        for(int i = 3; i <= n/2; i++){
            if(i % 2 == 0)
                return false;

        }
        return true;
    }




    public static int [] primeValues(int[] arr){

        List<Integer> prime = new ArrayList<>();

        for(int value : prime){

            if(ifPrime(value))
                prime.add(value);
        }

        int [] finalArr = {prime.size()};
        for(int k =0; k<finalArr.length; k++){
            finalArr[k] = prime.get(k);
        }
        return finalArr;
    }
}
