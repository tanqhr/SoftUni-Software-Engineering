import java.util.*;

public class SumOfCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]avaibleCoins=scanner.nextLine().substring(7).split(", ");
        int[]coins=new int[avaibleCoins.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i]=Integer.parseInt(avaibleCoins[i]);

        }
        int sum=Integer.parseInt(scanner.nextLine().substring(5));

        Map<Integer,Integer> selectedCoins=ChoosenCoins(coins,sum);
        System.out.println(String.format("Number of coins to take: %d",selectedCoins.values().stream().mapToInt(Integer::intValue).sum()));

        for (Map.Entry<Integer, Integer> usedCoin:selectedCoins.entrySet()) {
            System.out.println(usedCoin.getValue()+" coin(s) with value "+ usedCoin.getKey());
            
        }
    }

    private static Map<Integer, Integer> ChoosenCoins(int[] avaibleCoins, int sum) {
        Map<Integer,Integer>result=new LinkedHashMap<>();

        Set<Integer> coins=new TreeSet<>((f,s)->Integer.compare(s,f));
        Arrays.stream(avaibleCoins).forEach(coins::add);

        for (Integer coin:coins) {
            int countToTake=sum/coin;

            if(countToTake!=0){
                result.put(coin,countToTake);
                sum=sum%coin;
            }
            if(sum==0){
                break;
            }
            
        }return result;
        
    }
}
