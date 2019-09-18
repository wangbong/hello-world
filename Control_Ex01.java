public class Control_Ex01 {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
				
		for ( int i=1 ; i < 50; i++ ) {
			
			if ( (i & 1) == 1 ){
				System.out.println("+++++++++++ ");
				System.out.println(i+"++ ");

			} else {
				System.out.println("-- ");
				System.out.println(i+"-- ");
			}
		}
}
