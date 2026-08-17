class Solution {
    public int subtractProductAndSum(int n) {
        int p=product(n);
        int s=sum(n);
        int r=p-s;
        return r;
    }
    public int product(int x)
    {
        int res=1;
        while(x!=0)
        {
            int d=x%10;
            res=res*d;
            x=x/10;

        }
        return res;
    }
    public int sum(int x)
    {
        int res=0;
        while(x!=0)
        {
            int d=x%10;
            res=res+d;
            x=x/10;

        }
        return res;
    }
}