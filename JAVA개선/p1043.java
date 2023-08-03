import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p1043 {

    public static void main(String[] args) throws IOException {
        // 거짓말
        // N 사람수
        // M 파티수
        // 각 파티마다 오는 사람의 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        Set<Integer> know = new HashSet<>();

        for (int i = 0; i < number; i++) {
            know.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<ArrayList<Integer>> party = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            party.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) { // 파티 횟수 만큼
            st = new StringTokenizer(br.readLine()); // 한줄 받고
            int temp_party_numbers = Integer.parseInt(st.nextToken()); // 사람 수 만큼
            for (int j = 0; j < temp_party_numbers; j++) { // 실행하여 저장
                party.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }


        if (number == 0) {
            System.out.println(M);
        } else {
            for (int i = party.size()-1; i >= 0; i--) {
                Set<Integer> tmp = new HashSet<>(know); // 임시 Set
                tmp.retainAll(party.get(i)); // 교집합 생성
                if (!tmp.isEmpty()) { // 만약 교집합이 있다면
                    know.addAll(party.get(i)); // 전부 추가
                }
            }
            int count = 0;
            // System.out.println(know);
            for (int k = 0; k < M; k++) {
                Set<Integer> tmp = new HashSet<>(know); // 임시 Set
                tmp.retainAll(party.get(k)); // 교집합 생성
                if (tmp.isEmpty()) { 
                    count++; // 교집합 없으면 과장 할 수 있다
                }
            }
            System.out.println(count);
        }

    }
}
