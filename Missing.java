public class Missing {

    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,6,7,10};       
        int miss =missNumber(arr);
        if(miss == -1){
        System.out.println("Tidak ada angka yang hilang");
        }else{
        System.out.println("Angka yang hilang adalah: " + miss);
        }
    }
    
    public static int missNumber (int[] arr){
        int n = arr.length;
        int[] b = new int[arr[n-1]+1];
        for (int i=0; i<n; i++){
            b[arr[i]] = 1;
        }
        for (int i=arr[0]; i <= arr[n-1]; i++){
            if (b[i] == 0){
                return i;
                
            }
        }
        return -1;
    }
    
    }
