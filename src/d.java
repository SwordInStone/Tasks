import java.util.Scanner;
public class d {


    public static void main(String[] args) {
        // put your code here
        Scanner reader=new Scanner(System.in);
        int x=0,y=0,i=1,n=reader.nextInt(),x1=x,y1=y;
        boolean vektor=true,gorizontal=true,vertical=true;//направление движения чисел
        int[][] matrix=new int[n][n];
        while(i<=(n*n)){

            x=x1;y=y1;
            matrix[y][x]=i;


            if(vektor){
                if(gorizontal)x1++;
                else x1--;
            }
            else {
                if(vertical)y1++;
                else y1--;
            }

            if(x1>n-1||y1>n-1||x1<0||y1<0){
                if(vektor)gorizontal=!gorizontal;
                else vertical=!vertical;
                vektor=!vektor;
                x1=x;y1=y;continue;
            } else if(matrix[y1][x1]>0){
                if(vektor)gorizontal=!gorizontal;
                else vertical=!vertical;
                vektor=!vektor;
                x1=x;y1=y;
                if(i!=n*n)continue;
            }
            i++;

        }
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");}
            System.out.println();
        }

    }
}

