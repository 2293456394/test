public class TestJava {
	
	public static void main(String[] args) throws InterruptedException {
		

     for (int i = 0; i <1000; i++) {
		
    	 Thread.sleep(2000L);
    	 
    	 System.out.println(i);
	     
	 System.out.println("这是服务器更新的，本地没有的");
	}
        
     

	}

}
