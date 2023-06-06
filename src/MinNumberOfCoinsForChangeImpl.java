import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinNumberOfCoinsForChangeImpl {

    /**
     * Brainstorming here: let's say I have
     * n = 127
     * denoms = [1, 5, 10]
     * int indexDesc = denoms.length - 1;
     * int numberOfCoins = 0;
     * remainder = n;
     *
     * is(127 >= ){
     *     numberOfCoins += 127 / 10;   // numberOfCoins = 0 + 12 = 12
     *     remainder = 127 % 10;     //remainder = 7
     * }
     *
     *
     */

    public static int findMinNumberOfCoins(int target, int[] coins){

        //First Thing I will do is Sort the Array.
        Arrays.sort(coins);

        //Let's use an array to store the values of all integers
        //from 0 up to target value
        int[] numOfCoinsForAmounts = new int[target + 1];
        //Set each value to the Maximum Integer value possible
        for(int i =0; i < numOfCoinsForAmounts.length; i++){
            numOfCoinsForAmounts[i] = Integer.MAX_VALUE;
        }
        //For 0 amount we need zero coins
        numOfCoinsForAmounts[0] = 0;

        //Let's traverse each coin value
        for(int i = 0; i < coins.length; i++){
            int coin = coins[i];
            //for each coin, let's calculate the number of coins required to make up
            //amount from 0 to n amount.
            for (int thisAmount = 0; thisAmount < numOfCoinsForAmounts.length; thisAmount++){
                if (coin <= thisAmount){
                    if(numOfCoinsForAmounts[thisAmount - coin] == Integer.MAX_VALUE){
                        //We can not use this coin for this amount. Since the remainder of
                        // thisAmount - coin is invalid.
                        numOfCoinsForAmounts[thisAmount] = Integer.min(Integer.MAX_VALUE, numOfCoinsForAmounts[thisAmount]);
                    }else {
                        numOfCoinsForAmounts[thisAmount] =
                                Integer.min(numOfCoinsForAmounts[thisAmount],
                                        (1 + numOfCoinsForAmounts[(thisAmount - coin)]));
                    }
                }
            }
        }

        return numOfCoinsForAmounts[target] == Integer.MAX_VALUE ? -1 : numOfCoinsForAmounts[target];
    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {

        //First Thing I will do is Sort the Array.
        Arrays.sort(denoms);

        ArrayList<Integer> numberOfCoinsList = new ArrayList<>();

        for(int j = denoms.length - 1; j >=0; j--){
            int numberOfCoins = 0;
            int remainder = n;

            for(int i = j; i >= 0; i--){
                int coinsToAdd = 0;
                if (remainder >= denoms[i]){
                    coinsToAdd = remainder / denoms[i];
                    remainder = remainder % denoms[i];
                    numberOfCoins += coinsToAdd;
                }
                if (remainder == 0){
                    numberOfCoinsList.add(numberOfCoins);
                    break;
                }
            }
        }

        if (numberOfCoinsList.isEmpty())
            return -1;
        else{
            Collections.sort(numberOfCoinsList);
            return numberOfCoinsList.get(0);
        }

    }

    public static int minNumberOfCoinsForChange1(int n, int[] denoms) {

        int numberOfCoins = 0;
        int remainder = n;
        //this represents the last index of the sorted array
        int indexDesc = denoms.length - 1;

        //First Thing I will do is Sort the Array.
        Arrays.sort(denoms);

        for(int i = indexDesc; i >= 0; i--){
            int coinsToAdd = 0;
            if (remainder >= denoms[i]){
                coinsToAdd = remainder / denoms[i];
                remainder = remainder % denoms[i];
                numberOfCoins += coinsToAdd;
            }
            if (remainder == 0)
                break;
        }

        if(remainder != 0)
            return -1;
        else
            return numberOfCoins;

    }
}
