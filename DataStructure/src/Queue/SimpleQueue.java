package Queue;
	
public class SimpleQueue {
		
		private int maxSize;
	    private int[] queueArray;
	    private int front;
	    private int rear;
	    private int nitems;
	    
	    public SimpleQueue(int size) 
	    {
	        this.maxSize = size;
	        this.queueArray = new int[size];
	        this.front = 0;
	        this.rear = -1;
	        this.nitems = 0;
	    }
	    
	    public void insert(int i) 
	    {
	        if(isFull()) 
	        {
	            System.out.println("queue is Full");
	        }
	        else
	        {
	            rear++;
	            queueArray[rear] = i;
	            nitems++;
	        }
	    }
	    
	    public boolean isFull() 
	    {
	       return nitems == maxSize; 
	    }
	    
	    public long remove()
	    {
	        if(isEmpty()) 
	        {
	            System.out.println("queue is empty");
	            return -1;
	        }
	        else
	        {
	            int temp = queueArray[front];
	            front++;
	            nitems--;
	            return temp;
	        }
	    }
	    
	    public boolean isEmpty() 
	    {
	        return nitems==0;
	    }
	    
	    public void view() 
	    {
	        for(int i=0; i<queueArray.length; i++)
	        {
	            System.out.println(queueArray[i]);
	        }
	    }
	}  
		
	

