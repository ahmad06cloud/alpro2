public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 10};  
        sort(arr);
        int miss = missNumber(arr);
        if (miss == -1) {
            System.out.println("Tidak ada angka yang hilang");
        } else {
            System.out.println("Angka yang hilang adalah: " + miss);
        }
    }
    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {  // mulai dari index 1, karena index 0 sudah terurut
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // tambahkan titik koma
        }
    }
private static int missNumber(int[] arr){
         for (int i = 1; i< arr.length; i++){
             if (arr[i] ==arr[i - 1]){
                 return arr[i];
             }
         }
        return -1;
     }   
    }
