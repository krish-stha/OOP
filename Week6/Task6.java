package Week6;

public class Task6 {

    public static void main(String[] args){

    // 1. Write a java program to Add two 2x3 matrices

        int[][] matrix1={{1,2,3},{4,5,6}};
        int[][] matrix2={{1,2,3},{4,5,6}};

        int [][] result=new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int k=0;k<2;k++){
            for(int j=0;j<3;j++){
                System.out.print(result[k][j]+"  ");
            }

            System.out.println();
        }

        //Practice
     
            //         int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
            //         int[][] matrix2 = { {7, 8, 9}, {10, 11, 12} };
            //         int[][] result = new int[2][3];
            
            //         for (int i = 0; i < 2; i++) {
            //             for (int j = 0; j < 3; j++) {
            //                 result[i][j] = matrix1[i][j] + matrix2[i][j];
            //             }
            //         }
            
            //         System.out.println("Sum of the matrices:");
            //         for (int i = 0; i < 2; i++) {
            //             for (int j = 0; j < 3; j++) {
            //                 System.out.print(result[i][j] + " ");
            //             }
            //             System.out.println();
            //         }
            //     

// 2. Write a java program to print transpose 2X2 matrices

        int[][] matrix={{1,2},{3,4}};
        int[][] result1=new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result1[i][j]=matrix[j][i];
            }
        }

        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                System.out.print(result1[j][k]+" ");
            }
            System.out.println();
        }


// 3. Write a java program to print mirror 2X2 matrices

        int[][] matrix3={{1,2},{3,4}};
                int[][] result2=new int[2][2];
        
                for(int i=0;i<2;i++){
                    result2[i][0]=matrix3[i][1];
                    result2[i][1]=matrix3[i][0];
                }
        
                for(int j=0;j<2;j++){
                    for(int k=0;k<2;k++){
                        System.out.print(result2[j][k]+" ");
                    }
                    System.out.println();
                }

// 4. Write a java program to Multiply two 2x3 matrices
                int[][] mtx={{1,2,8},{3,4,7}};
                int[][] mtx1={{1,2,8},{3,4,7}};

                int[][] rsult=new int[2][3];

                for(int i=0;i<2;i++){
                    for(int j=0;j<3;j++){
                        rsult[i][j]=mtx[i][j]*mtx1[i][j];

                    }
                }

                for(int j=0;j<2;j++){
                    for(int k=0;k<3;k++){
                        System.out.print(rsult[j][k]+" ");
                    }
                    System.out.println();
                }

    }
    
    
}
