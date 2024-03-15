public class Bubblesort {
 

 public static int[] bubbleSort(int[] vetor) {
  for(int fim = vetor.length - 1 ; fim >= 0 ; fim--) {
   for(int inicio = 0 ; inicio < fim ; inicio++) {

    if(vetor[inicio] > vetor[inicio + 1]) {
     int dataSwap = vetor[inicio + 1];

     vetor[inicio + 1] = vetor[inicio];
     vetor[inicio] = dataSwap;
    }
   }
  }
  return vetor;
 }

 public static int[] bubbleSortInvertida(int[] vetor) {
  for(int inicio = 0 ; inicio < vetor.length - 1 ; inicio++) {
   for(int fim = vetor.length - 1 ; fim > inicio ; fim--) {

    if(vetor[fim] < vetor[fim - 1]) {
     int dataSwap = vetor[fim - 1];

     vetor[fim - 1] = vetor[fim];
     vetor[fim] = dataSwap;
    }
   }
  }
  return vetor;
 }

 // nao funcional***
 public static int[] insertionSort(int[] vetor) {
  for(int fim = vetor.length - 1 ; fim >= 0 ; fim--) {
   for(int inicio = 0 ; inicio <= fim ; inicio++) {
    int idx = 0;
    if(vetor[idx] < vetor[inicio]) {
     idx = inicio;

     int dataSwap = vetor[fim];

     vetor[fim] = vetor[idx];
     vetor[idx] = dataSwap;
    }
   }
  }
  return vetor;
 }
 public static void main(String[] args) {
  int[] vetor = {10, 5, 3, 7, 1};

  //bubbleSort(vetor);
  for(int contador = 0 ; contador < vetor.length ; contador++) {
   System.out.print(vetor[contador] + ", ");
  }
  System.out.println("");

  //bubbleSortInvertida(vetor);
  for(int contador = 0 ; contador < vetor.length ; contador++) {
   System.out.print(vetor[contador] + ", ");
  }
 
  insertionSort(vetor);
  for(int contador = 0 ; contador < vetor.length ; contador++) {
   System.out.print(vetor[contador] + ", ");
  }
 }
}
