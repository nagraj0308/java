class KadaneAlgo {
    public static void main(String[] args){
     System.out.println("x");
    }
}

class Output {
    int[] data;
    int start;
    int end;

    public Output(int[] data) {
        this.data = data;
    }

    public int getMaxSum() {
        int psum = 0;
        int tsum = 0;
        int index = 0 ;
        for (int val : data) {
            start = index;

            tsum += val;
            if (tsum < psum) {
                psum = tsum;
                end = index;
            }
            if (tsum < 1 && val < 1) {
                tsum = 0;
            }
        }
    }
}