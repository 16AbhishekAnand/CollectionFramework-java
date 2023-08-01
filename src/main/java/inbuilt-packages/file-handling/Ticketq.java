class Ticketq {
    public static void main (String args[]) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b = a.length;
        int temp[] = new int[b];
        int k = 3; int x,y;
        //for(int i=0;i<b;i++) {
            
            for(x=0;x<k;x++) {
                temp[x] = a[x];
            }
            for(y=a.length;y<6;y--) {
                temp[x] = a[y];
            }
            for(int z=0;z<temp.length;z++) {
                System.out.print(temp[z]+" ");
            }
            
            
    }     
}
