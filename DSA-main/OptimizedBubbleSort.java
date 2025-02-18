import java.util.Arrays;
public class OptimizedBubbleSort {
    
    class BubbleSort {
        
        public void swap(Integer[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        public void bubbleSort(Integer[] array) {
            int n = array.length;
            
            for (int i = 0; i < n - 1; i++) {
				boolean flag = false; // Optimize code
                for (int j = 0; j < n - i - 1; j++) { // Corrected here
					
					
					
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
						
						flag = true;// Optimize code
                    }
					
					System.out.println(
						"i = "
						+(i+1)
						+"; j = "
						+ (j + 1)
		 				+ "; "
						+ Arrays.deepToString(array)
					);
                }
				if(!flag) // Optimize code
					break; // Optimize code
            }    
        }
    }

    public static void main(String[] args) {
		
        OptimizedBubbleSort lab = new OptimizedBubbleSort();
        BubbleSort object = lab.new BubbleSort();  
        
        //int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};
		Integer[] numbers = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
        //Integer[] numbers = {2,5,7,9,10};
		
        System.out.println("Array before Sorting:");
        for (int d = 0; d < numbers.length; d++){
			System.out.print(numbers[d] + ",");
		}
        
        object.bubbleSort(numbers);
        
        System.out.println("\nAfter sorting:");
        for (int d = 0; d < numbers.length; d++){
			System.out.print(numbers[d] + ",");
		}
    }
}