public class Main {
    public static void main(String[] args) {
      int array[] = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7};
        //int array[] = {1,2,3,4,5};
       int max = 0;
       int max_count = 0;
       for(int i=0;i< array.length;i++){
           if(array[i]>max){
               max = array[i];
              // max_count +=1;
           }
       }
       for(int i = 0;i< array.length;i++){
           if(max == array[i]){
               max_count++;
           }
       }
       System.out.printf("The most frequent number in table is :\n"+max+" (%dx)",max_count);

    }
}