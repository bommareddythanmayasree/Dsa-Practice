class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse=reverse(num);
        if(reverse(reverse)==num)
        {
            return true;
        }
        else
        {
            return false;
        }
        

    }
    public int reverse(int x) {
        int r = 0;
        long res = 0;

        while (x != 0) {
            r = x % 10;
            res = res * 10 + r;
            x = x / 10;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }


        return (int) res;
    }
}