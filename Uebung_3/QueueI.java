public interface QueueI<A> 
{
	void enqueue(A n);
	A dequeue();
}
