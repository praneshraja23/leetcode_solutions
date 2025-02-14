class ProductOfNumbers {

    public List<Integer> list;
    public int product=1;
    public ProductOfNumbers() {
       this.list=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0)
        {
            this.list=new ArrayList<>();
            product=1;
            return;
        }
        product*=num;
        list.add(product);
    }
    
    public int getProduct(int k) {
        int len=list.size();
        if(k>len) return 0;
        int ans=list.get(len-1);
        if(k==len) return ans;
        return ans/list.get(len-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */