package pascalsTriangle;

public class PascalsTriangleinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5; // 원하는 수 만큼 변경 가능
		int[][] triarr=new int[input][input1]; //원하는 수 +1 크기의 2차원 배열 생성

		for(int i=0;i<input;i++){ // 가장자리의 숫자가 1이므로 가장자리 숫자를 전부 1로 채워넣음
			triarr[0][i]=1;
			triarr[i][0]=1;
		}

		//가장자리 이외를 출력하는 코드
		for(int i=1;i<input;i++){
			for(int j=1;j<input;j++){
				triarr[j][i]=triarr[j][i-1]+triarr[j-1][i];
			}
		}

		//삼각형 형태로 출력하는 코드
		for(int i=0; i<=input; i++){ //총 회수: 6줄 여기서 i는 가로줄을 의미함
			int x=i;
			int y=0;

			//공백(처음에 공백이 있어야 삼각형 모양이 됨)
			for(int k-0; k<input-i; k++){
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++){
				System.out.print(triarr[x][y]+" ");
				x--;
				y++;
			}
			System.out.println();
		}
	} // end of main

} // end of class
