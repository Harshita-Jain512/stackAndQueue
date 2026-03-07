public class QueueUsingArray {
int []queue;
int size;
int front;
int rear;
QueueUsingArray(int s){
    size = s;
    queue = new int[size];
    front = rear = -1;
}
void enqueue(int x){
    if(rear == size - 1){
        System.out.println("queue is overflow");
    } else {
         if(front == -1){
            front = 0;
         }
         rear++;
         queue[rear] = x;
            System.out.println(x + "enqueued into the queue");
    }
}
    void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("queue is empty");
        } else {
            int x = queue[front];
            front++;
            System.out.println(x + "dequeued from the queue");
        }
        }
        void peek(){
            System.out.println("front element is : " + queue[front]);
        }
        void display(){
            if(front == -1 || front > rear){
                System.out.println("queue is empty");
            } else {
                for(int i = front; i <= rear; i++){
                    System.out.println(queue[i]);
                }
            }
        }
        public static void main(String[] args) {
            QueueUsingArray q = new QueueUsingArray(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            q.dequeue();
            q.peek();
            q.display();
        }
    }


