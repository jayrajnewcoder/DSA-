import java.util.*;
public class dsa {
    public static int first(int arr[],int first,int last,int target)
    {
        int fans=0;
        while (first<=last)
        {
            int mid=first+(last-first)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target){
                last=mid-1;
            }
            else{
                first=mid+1;
            }

        }
        return -1;
    }
    public static int sqrt(int number)
    {
        int first=0;
        int last=number;
        int ans=0;
        while (first<=last)
        {
            int mid =first+(last-first)/2;
            if (mid*mid<=number){
                ans=mid;
                first = mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return  ans;
    }
    
    public static void main(String[] args){
        //problem first
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array=");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array=");
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=0;
        int last = arr.length-1;
        System.out.print("Enter the element to be search in the array=");
        int target =sc.nextInt();
        int possition = first(arr,first,last,target);
        System.out.println(possition);
        //sqrtx problem in java
        System.out.print("Enter the number whoose square root is to be find=");
        int fnumber = sc.nextInt();
        int fans = sqrt(fnumber);
        System.out.println(fans);
        //Find the frequency of the elements in the array while duplicates are present
        System.out.print("Enter the size of the second array=");
        int asize =sc.nextInt();
        int sarr[] =new int[asize];
        for (int i=0;i<asize;i++)
        {
            sarr[i]=sc.nextInt();
        }
        int count=0;
        int freq = sc.nextInt();
        for (int i=0;i<sarr.length;i++){
            if (sarr[i]==freq){
                count++;
            }
        }
        System.out.println("Frequency of "+freq+" is "+count);
    }
    
}
