class Scratch {
    public static void main(String[] args) {
        System.out.print(solution(123456789));
    }

    public static int solution (int n) {
        // write code here
        StringBuffer sb = new StringBuffer();
            for(int i =9;i>1;i--){
                while(n%i==0){
                    sb.insert(0,i);
                    n = n/i;
                }
            }
            if(n!=1){
                return -1;
            }
        int result = Integer.parseInt(sb.toString());
        return result;
    }
}