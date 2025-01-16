public class Arraysearch{
    public static void main(String[]args){
        int a[]={5,4,3,2,1};
        for(int i=0; i<a.length; i++){
            if(a[i]==3){
                System.out.println(i);
            }
        }
        System.out.println("Not in array");
    }
}