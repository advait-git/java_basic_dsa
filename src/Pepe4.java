public class Pepe4 {
    public static void main(String []args){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int data = 51;
        int l=0;
        int h=arr.length-1;
        int ceil=0;
        int floor=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(data>arr[mid]){

                l=mid+1;
                ceil=arr[mid];
            }else if(data<arr[mid]){

                h=mid-1;
                floor=arr[mid];
            }else{
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
    }
        System.out.println("Ceil: "+ceil);
        System.out.println("Floor: "+floor);
    }
}
