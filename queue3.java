public class queue3 {//array implementation
    public static class queueA{
        private int f = -1;
        private int r = -1;
        int size = 0;
        private int[] arr = new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println( "Queue is Full");
                return;
            }
            if(f==-1) f = r = 0;
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println( "Queue is Empty" );
                return -1;
            }
            f++;
            size--;
            int e = arr[f-1];
            return e;
        }
        public int peek(){
            if(size==0){
                System.out.println( "Queue is Empty" );
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.println(arr[i]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
