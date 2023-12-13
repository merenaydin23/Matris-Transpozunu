import java.util.Arrays;
/*Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur.*/
public class Main {
    public static void main(String[] args) {
        int[][] dizi=new int[2][3];
        int mat=1;
        for (int i=0;i< dizi.length;i++){
            for (int k=0;k< dizi[i].length;k++){
                dizi[i][k]=mat;
                mat++;
                if (k==2){
                    System.out.print(dizi[i][k]+" ");
                    System.out.println();
                }
                else {
                    System.out.print(dizi[i][k]+" ");
                }
            }
        }
         System.out.println("Yukarıda belirtilen dizinin Matris Tranpozunu aşağıdaki gibidir");
          int[][]yeni=new int[3][2];
       for (int m=0;m< yeni.length;m++){
           for (int k=0;k<yeni[m].length;k++) {
               yeni[m][k] = dizi[k][m];
               if (k == 1) {
                   System.out.print(yeni[m][k] + " ");
                   System.out.println();
               } else {
                   System.out.print(yeni[m][k] + " ");
               }
           }
       }
       System.out.println();
       System.out.println();
      System.out.println("İstenilen diğer dizinin Matris Transpozu durumunu inceleyelim.");
     int [][]dizi2=new int[2][3];
        dizi2[0][0]=2;
        dizi2[0][1]=3;
        dizi2[0][2]=4;
        dizi2[1][0]=5;
        dizi2[1][1]=6;
        dizi2[1][2]=4;
       for (int k=0;k< dizi2.length;k++){
           for (int l=0;l< dizi2[k].length;l++){
               if (l==2){
                   System.out.print(dizi2[k][l]+" ");
                   System.out.println();
               }
               else {
                   System.out.print(dizi2[k][l]+" ");
               }}}

        System.out.println("Yukarıda belirtilen dizinin Matris Tranpozunu aşağıdaki gibidir");
       int [][]matriks2=new int[3][2];
        for (int o=0;o< matriks2.length;o++){
            for (int i=0;i< matriks2[o].length;i++){
          matriks2[o][i]=dizi2[i][o];
          if (i==1){
              System.out.print(matriks2[o][i]+" ");
              System.out.println();
          }
          else {
              System.out.print(matriks2[o][i]+" ");
          }
            }
}
    }
}