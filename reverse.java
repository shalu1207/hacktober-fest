public class reverseee {
    public static void reverse (int n[]){
        int start=0;
        int end=n.length-1;
        while(start<end){
            int temp=n[end];
            n[end]=n[start];
            n[start]=temp;
            start++;
            end--;

        }

    }


    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,7,8,9,10};
        reverse(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }

    }



}
