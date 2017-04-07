
public class MultiplicationMatrice {

	public static void main(String[] args) {
		 int[][] MA = {{2,3},{2,1}};
         int[][] MB= {{4,2},{3,1}};
         int[][]MC = null;
    
         try {
             
             afficher(MA);
             afficher(MB);
             MC = multiplier(MA, MB);
             System.out.println();
            afficher(MC);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    static int[][] multiplier(int[][] MA, int[][] MB) throws Exception{
        
        int[][] MC;
        
        int l,c;
        
        if(MA == null || MB == null){
            throw new Exception("L'une des deux matrices est à null");
        }

        
        if(MA[0].length != MB.length){
            throw new Exception("La multiplication de deux matrices n'est possible que si le nombre de colonne du premier est égal au nombre de ligne du second!!");
        }
         
         if(MA.length * MA[0].length < MB.length * MB[0].length){
            l= MB.length;
            c= MB[0].length;
         }else{
             l= MA.length;
             c= MA[0].length;
         }
         
         MC = new int[l][c];
         
         l = 0;
         for (int i = 0;i < MA.length;i++){ /// Ligne de MA
             c = 0;
            for (int n = 0;n < MB[0].length;n++){ /// colonne de  MB
                
                int calcul= 0;
                for (int m = 0;m < MB.length;m++){  /// colone de MA et ligne de MB
                    
                    System.out.printf("%4d    * %4d", MA[i][m],MB[m][n]);
                   
                    calcul += MA[i][m] * MB[m][n];
                    if (m == 0)
                       System.out.printf("    + ");
                }

                System.out.printf(" = %4d   ",calcul);
                MC[l][c] = calcul;
                c++;
            }
            System.out.printf("\n");
            l++;
         }
         
         
        return MC;
    }
    
    
    static void afficher(int [][]M) throws Exception{
        if(M == null){
            throw new Exception("La matrice est à null");
        }
            for (int i = 0;i < M.length;i++)
            {
                for (int j = 0;j < M[0].length ;j++)
                {
                    System.out.printf("%4d ",M[i][j] );
                }
               System.out.println();
            }
            System.out.println();
    }


}
