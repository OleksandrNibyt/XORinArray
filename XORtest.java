class Solution {
    public static int xorOperation(int n, int start) {
        int resultXOR = 0;
        for(int i=0;i<n;i++){
            resultXOR = resultXOR^start+2*i;
        }


        return resultXOR;
    }
}


public class XORtest {

    public static void main(String[] args) {
        int start = 0;
        int input = 5;

        int result = Solution.xorOperation(input, start);
        System.out.println(String.valueOf(result));
    }


}
