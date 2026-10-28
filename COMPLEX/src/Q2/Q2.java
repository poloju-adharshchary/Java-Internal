package Q2;

class sharedbuff{
	private int value;
	private boolean avail=false;
	public synchronized void produce(int value) throws InterruptedException {
		while(avail) {
			wait();
		}
		this.value=value;
		System.out.println("Producer Produced: "+value);
		avail=true;
		notify();
	}
	public synchronized void consume() throws InterruptedException {
		while(!avail) {
			wait();
		}
		this.value=value;
		System.out.println("Consumer Consumed: "+value);
		avail=false;
		notify();
	}
}

public class Q2 {

	public static void main(String[] args) {
		sharedbuff s= new sharedbuff();
		Thread producer =new Thread(() -> {
			for(int i=0;i<5;i++) {
				try {
					s.produce(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread consumer = new Thread(() -> {
			for(int i=0;i<5;i++) {
				try {
					s.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		producer.start();
		consumer.start();
		
		
	}

}
