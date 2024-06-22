// prints the sum of nested array having max value

public class A10MaxWealthOfPerson {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{5,9,4},{4,6,8}};
        
        System.out.println(maximunWealth(accounts));
    }

    public static int maximunWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        // for(int person = 0; person<accounts.length; person++){
        // int sum = 0;
        // for(int account=0; account<accounts[person].length; account++){
        // sum += accounts[person][account];
        // }
        // if(sum>max){
        // max = sum;
        // }
        // }

        // by enhanced for loop : | takes less memory 
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}






