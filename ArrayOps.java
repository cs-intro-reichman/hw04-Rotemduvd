public class ArrayOps {
    public static void main(String[] args) {
        //System.out.println(findMissingInt(new int[] {0}));
        //System.out.println(secondMaxValue(new int[] {-202, 48, 13, 7, 8}));
        //System.out.println(containsTheSameElements(new int[]  {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5})); 
        System.out.println(isSorted(new int[] {3 ,-2 ,1}));
    }
    
    public static int findMissingInt (int [] array) {
        int missing = 0;
        for (int val = 1; val <= array.length + 1; val++) {
            boolean found = false;
    
            for (int i = 0; i < array.length; i++) {
                if (val == array[i]) {
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                missing = val;
                break;
            }
        }
    
        return missing;
    }

    

    public static int secondMaxValue(int [] array) {
        int secMax =0;
        for(int p=0; p < array.length; p++){
            if((array[p]>secMax) && array[p]<firstMaxValue(array) ){
                secMax = array[p];
            }
        }
        
        return secMax;
    }


     public static int firstMaxValue(int [] array) {
        int max = array[0];
        for(int p=0; p < array.length; p++){
            if(array[p]>max){
                max = array[p];
            }
        }
        return max;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean found = true;
        int index1 = 0;
        while (index1<array1.length && found) {
            int index2 = 0;
            while (index2<array2.length) {
                if ((array2[index2])!=(array1[index1])) {
                    found = false;   
                    index2++;      
                }else{
                    found = true;
                    break;
                }
                
            }
            index1++;
        }
        return found;
    }

     
    

    public static boolean isSorted(int[] array) {
        int p = 0;
        boolean sorted = true;
        
        while (p < array.length - 1) {
            if (array[p] == array[p + 1]) {
                p++;
            } else if (array[p] < array[p + 1]) {
                while (p < array.length - 1 && array[p] <= array[p + 1]) {
                    p++;
                }
                if (p < array.length - 1) {
                    sorted = false;
                    break;
                }
            } else {
                while (p < array.length - 1 && array[p] >= array[p + 1]) {
                    p++;
                }
                if (p < array.length - 1) {
                    sorted = false;
                    break;
                }
            }
        }
    
        return sorted;
    }
    
}
