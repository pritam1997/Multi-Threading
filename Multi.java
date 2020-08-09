import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multi {
	
	public static void main(String[] args) {

		
		Shutdownhook s =new Shutdownhook();
		Runtime r = Runtime.getRuntime();
		
		r.addShutdownHook(s);
		
		System.out.println("Now main sleeping ... ctrl+c to exit");
		try {
				 Thread.sleep(1000) ;
		}
		
		
		catch(Exception e) {e.printStackTrace();}
		
		
		
//		ThreadGDemo t = new ThreadGDemo();
//		ThreadGroup tg = new ThreadGroup("parent group 1");
//		
//		Thread t1 = new Thread(tg , t, "thread101");
//		Thread t2 = new Thread(tg , t, "thread102");
//		Thread t3 = new Thread(tg , t, "thread103");
//		Thread t4 = new Thread(tg , t, "thread104");
//		Thread t5 = new Thread(tg , t, "thread105");
//		
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		
//		System.out.println("ThreadGroup name : "+ tg.getName());
//		tg.list();
//		
//		
//		A q[] = new A[15];
//	
//		ExecutorService pool = Executors.newFixedThreadPool(11);
//		for(int i=1; i<15; i++) {
//			
//			q[i] = new A();
//			
//			pool.execute(q[i]);
//		}
//		
//		
//		pool.shutdown();
//		while( !pool.isShutdown() ) {}
//	System.out.println("shutdown");
		
//		R o = new R();
//		R o2 = new R();
//		o.setPriority(Thread.MIN_PRIORITY);
//		o2.setPriority(Thread.MAX_PRIORITY);
//		o.start();
//		o2.start();
		
		/*
		A q = new A();
		A w = new A();
		q.start();
		w.start();
		*/
		
/*
 * 
 //join()		
		B o = new B();
		B o2 = new B();
		B o3 = new B();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o2);
		Thread t3 = new Thread(o3);
		
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e ) {
			e.printStackTrace();
		}	
	
	t2.start();
	t3.start();
	*/
		
		/*
		C o = new C();
		C o2 = new C();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o2);
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("pritam with first thread");
		System.out.println("After changing thread name : t1 ");
		
	*/
		
		
		
	}
}



class A extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	
}


// sleep()
class B implements Runnable {
	
	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}	
}


class C implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}	
}


// Set Priority to thread

class R  extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
