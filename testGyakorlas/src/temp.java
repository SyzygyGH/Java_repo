public class temp {
    public static void main(String[] args) {
        int[] n={1,2,2};
        int[] npow = new int[3];
        for (int i=0; i<n.length; i++){
            npow[i]=(int)Math.pow(n[i],2);
        }

        int x=0;

        for (int i=0; i<n.length; i++){
            x+=npow[i];
        }
        System.out.println(x);
    }
}
