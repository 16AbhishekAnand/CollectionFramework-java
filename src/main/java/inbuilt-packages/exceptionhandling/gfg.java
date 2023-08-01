package main.file.exceptionhandling;


class gfg {
    
    
    
    
    
    public static void main(String args[]) {
        int arr [] = {56,2,1,72,23};
        int key = 57 ; int count = 1;
        
        for(int i=0; i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==key) {
                    System.out.println();
                }
                else {
                    count++;
                }
            }
        }
        //System.out.println(count);
    }

}