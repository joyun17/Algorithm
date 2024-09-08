import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //배열 크기
        int m = Integer.parseInt(st.nextToken()); //질문 개수

        long[] numArr = new long[n+1]; //입력 받은 배열 크기에 +1을 하여 배열 생성

        st = new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++){
            numArr[i] = Long.parseLong(st.nextToken());
            numArr[i] += numArr[i-1]; //인덱스 마다 값을 입력받고 이전 인덱스와의 합으로 배열 값 변경
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            System.out.println(numArr[right] - numArr[left-1]); //right인덱스까지의 합에서 left-1까지의 합을 빼서 left~right까지의 구간합 출력
        }

    }
}