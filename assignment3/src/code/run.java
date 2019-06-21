package code;


public class run implements Runnable {

		private String name;
		public run(String name){
			this.name=name;
		}
		public void run(){
			for(int i=1;i<=100;i++)
			System.out.println(name+i);
		}

	}


