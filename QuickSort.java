public class Quicksort {

 public static void main(String[] args) {
  int v[] = { 1,2,0,3,5,1,0};
  for (int i = 0; i < v.length; i++) {
   System.out.print(v[i]+ ",");
  }
  System.out.println("");
  quickSort(v, 0, v.length-1);
  for (int i = 0; i < v.length; i++) {
   System.out.print(v[i]+ ",");
  }
  System.out.println("");
 }

 //QuickSort
 public static void quickSort(int[] v, int esq, int dir) {
  if (esq < dir) {
   int pospivo = antiParticiona(v, esq, dir);
   quickSort(v, esq, pospivo - 1);
   quickSort(v, pospivo + 1, dir);
  }
 }


 // particiona
 public static int particiona(int[] v, int esq, int dir) {

  int pospivo = esq;
  int pivo = v[pospivo];

  for (int i = esq + 1; i <= dir; i++) {
   if (v[i] <= pivo) {
    int aux = v[pospivo + 1];
    int viaux = v[i];
    v[i] = aux;
    v[pospivo + 1] = pivo;
    v[pospivo] = viaux;
    
    pospivo++;
   }
  }
  return pospivo;
 }
 // Anti Particiona
 public static int antiParticiona(int[] v, int esq, int dir) {

  int pospivo = dir;
  int pivo = v[dir];

  for (int i = dir-1; i >= esq; i--) {
   if (v[i] >= pivo) {
    int aux = v[pospivo - 1];
    int viaux = v[i];
    v[i] = aux;
    v[pospivo - 1] = pivo;
    v[pospivo] = viaux;
    
    pospivo--;
   }
  }
  return pospivo;
 }
}
