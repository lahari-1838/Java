package ABC;


	
	class car extends Thread{
		public void run() {
			for(int i=1;i<=3;i++) {
				System.out.println("BMW car is moving"+i);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
				}
			}
		}
	}
	class Bike extends Thread{
		public void run() {
			for(int i=1;i<=3;i++) {
				System.out.println("ninja bike is moving"+i);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
				}
			}
		}
	}
	public class simplerace {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new car().start();
			new Bike().start();

		}

	}



