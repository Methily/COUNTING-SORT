package sorting;

public class countngsrt {
        public static void main(String[] args) {
            int arr[] = { 4, 56, 8, 2, 56, 14, 6, 5, 2, 56, 14, 5, 89, 1 };
            
            // printing the original array
             for (int x : arr) {
                 System.out.print(x + " ");
             }
             System.out.println();
             
            int len = arr.length;
            
            // Find the largest element of the array
            int max = arr[0];
            for (int i = 1; i <= len-1; i++) {
              if (arr[i] > max)
                max = arr[i];
            }
            int[] count = new int[max + 1];
    
            // Initialize count array with all zeros. (This is Optional in java)
            for (int i = 0; i <= count.length-1; ++i) {
              count[i] = 0;
            }
    
            // Store the count of each element
            for (int i = 0; i <= len-1; i++) {
              count[arr[i]]++;
            }
    
            // Store the cumulative count of each array
            for (int i = 1; i <= count.length-1; i++) {
                    count[i]=count[i]+count[i-1]; //or  //count[i] += count[i-1];
            }
    
            // Find the index of each element of the original array in count array, and
            // place the elements in output array
            int[] output = new int[len];
            for (int i = 0; i <=len-1; i++) {
              output[count[arr[i]]-1] = arr[i];
              count[arr[i]]--;
            }
    
            arr=output;
            output=null;
            
            // printing the sorted array
             for (int x : arr) {
                 System.out.print(x + " ");
             }
        }
    }
