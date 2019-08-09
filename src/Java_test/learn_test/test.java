package Java_test.learn_test;

public class test {
	/*值传递*/
	public void test1(int a) {
		a=a+1;
		System.out.println(a);
	}

	public static void main(String args[]){
	      int [] numbers = {10, 20, 30, 40, 50};
	      int i= 1;
	      /*增强版for循环*/
	      for(int x : numbers ){
	         System.out.print( x );
	         System.out.print(",");
	      }
	      System.out.print("\n");
	      String [] names ={"James", "Larry", "Tom", "Lacy"};
	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }
	      System.out.print("\n");
	     /*switch case 执行时，一定会先进行匹配，
	      * 匹配成功返回当前 case 的值，
	      * 再根据是否有 break，判断是否继续输出，
	      * 或是跳出判断*/
	      switch(i) {
	      case 0:
	    	  System.out.println("0");
	      case 1:
	    	  System.out.println("1");
	      case 2:
	    	  System.out.println("2");
	    	  break;
	      default:
	    	  System.out.println("-1");
	      }
	     /*Math中的floor、round、ceil */
	    double num= -1.4;
	    System.out.println("向下取整数:"+Math.floor(num));
	    System.out.println("四舍五入:"+Math.round(num));
	    System.out.println("向上取整数:"+Math.ceil(num));
	    /*值传递与引用传递*/
	    test T = new test();
	    T.test1(i);
	    System.out.println(i);
	    	     
	} 
}