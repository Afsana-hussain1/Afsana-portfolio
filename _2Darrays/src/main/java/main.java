public class main {

    public static void main(String[] args) {
        //one method of creating and filling in a two dimensional array
        int[][] lotteryCard = {{100, 35, 16},
                               {12, 11, 10},
                                 {10, 9, 8}


        };
      //more in depth way which allows you to specify # of rows and columns but requires
        //you to manually fill in each spot of the 2d array
        //the structure is always [row] [column]
        int[][] lotteryCard2 = new int [3] [3];
        lotteryCard2[0][0] =100;
        lotteryCard2 [0][1]=35;
        lotteryCard2 [0][2]=16;
        lotteryCard2[1][0]=12;
        lotteryCard2 [1][1] =11;
        lotteryCard2 [1][2]=10;
        lotteryCard2 [2][0] =10;
        lotteryCard2 [2][1]=9;
        lotteryCard2 [2][2]=8;

        System.out.println(lotteryCard[0][0]);
        System.out.println("==================================");
        //prints out numbers which go across diagonally
        for(int i =0; i<3;i++){
            System.out.println(lotteryCard[i][i]);
        }
        System.out.println("====================================");

        //this piece of code prints out everything on the first row, second row and third row
        for (int i=0; i< 3; i++) {
            for (int j=0; j < 3; j ++){
                System.out.println(lotteryCard[i][j]);
            }
        }

    }



}
