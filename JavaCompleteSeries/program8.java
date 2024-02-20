import java.io.*;

class program8 {

    public static void main(String[] args) throws IOException {
        int ar[];
        ar = new int[5];
        BufferedReader br;
        int n = Integer.parseInt((br = new BufferedReader(new InputStreamReader(System.in))).readLine());
        for (int i = 0; i < 5; i++) {
            ar[i] = i * i;
            System.out.println(ar[i]);
        }

    }

}