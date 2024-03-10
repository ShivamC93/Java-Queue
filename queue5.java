public class queue5 {//circular queue using array
    public static class CircularArr{
        int front = -1;
        int rear = -1;
        int size = 0;
        private int n;
        int[] arr = new int[8];
        public void add(int n) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=n;
            }
            else if(rear<arr.length-1){
                arr[++rear] =  n;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=n;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size == 0)throw new Exception("Queue is empty");

            else{
                int val = arr[front];
                if(front==arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else return arr[front];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return  false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front<=rear){
                for(int i = front;i<=rear;i++){
                    System.out.println(arr[i]+ " ");
                }
            }
            else{
                for(int i =front;i<arr.length;i++){
                    System.out.println(arr[i]+ " ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.println(arr[i]+ " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception{
        CircularArr c = new CircularArr();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.display();
        c.remove();
        c.display();


    }
}
