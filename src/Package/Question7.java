package Package;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 2;
        int n = 3;
        while(true){
            double t = Math.sqrt(n);
            int m = (int)t;
            for(int i=2; i<=m; i++){
                int r = n % i;
                if(r==0)
                    break;
                if(i==m)
                    p = 97;
            }
            n++;
            if(n>100)
                break;
        }
        System.out.printf("%d\n", p);
	}

}
