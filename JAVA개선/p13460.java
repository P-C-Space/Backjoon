import java.util.Scanner;

class Move{
    // 1 up
    // 2 down
    // 3 left
    // 4 right
    int count = 0;
    private int direction;
    Move(int direction){

    }    
}



public class p13460 {
    // 구슬 탈출 2
    // 세로 N 가로 M
    // 1x1 칸 바깥 행은 모두 막힘
    // O 구멍 한개
    // 파란 구슬 B 빨간 구슬 R 한개씩 제공
    // 최소 몇번에 안에 구슬을 빼낼지 검색, 없으면 출력 -1
    // 파란구슬이 들어가면 안됌
    // 왼쪽 오른쪽 위 아래 기울이기 중력으로 이동 한면 전체로 이동
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        try{
        int N = s.nextInt(); // 세로
        int M = s.nextInt(); // 가로
        String rx,ry; // 레드
        String bx,by; // 블루
        Srring ox,oy; // 구멍

        s.nextLine(); // 남아있던 값 삭제

        char board[][] = new char[N][M]; // 사이즈 설정

        for(int i =0;i<N;i++){
            String shape = s.nextLine();
            for(int j =0;j<shape.length();j++){
                board[i][j] = shape.charAt(j); // 모양 값 초기화
                
                // 각 위치 기록
                if(shape.charAt(j) == 'R'){
                    rx = j;
                    ry = i;
                }
                else if(shape.charAt(j) == 'B'){
                    bx = j;
                    by = i;
                }
                else if(shape.charAt(j) == 'O'){ 
                    ox = j;
                    oy = i;
                }
            } 
        }
        
        // 초기화 확인
        for(int i = 0;i<N;i++){
            for(int j =0;j<M;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        s.close();
    }
}