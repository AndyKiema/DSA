public class Arraysearch{
    public static void main(String[]args){
        int a[]={5,4,3,2,1};
        boolean found=false;
        for(int i=0; i<a.length; i++){
            if(a[i]==9){
                System.out.println(i);
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("Not in array");
        }
        
    }
}