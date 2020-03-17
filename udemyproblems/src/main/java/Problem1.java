public class Problem1 {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		String result = str;
		return result;
	}
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		Problem1Test.runTests();
	}

	public static class Problem1Test {
		public static void runTests(){

			String [] params1 = {"12345","apple","tiger","candy","add","ad","a","","del","denny","sfveaadelbb"};
			String  [] expected = {"234","ppl","ige","and","add","ad","a","","del","enn","aad"};

			for(int i=0; i < params1.length; i++){
				String result = middleThree(params1[i]);
				if(result.equals(expected[i])) {
					System.out.println(printPassResult(params1[i], expected[i], result));
				} else{
					System.out.println(printFailResult(params1[i], expected[i], result));
				}
			}
		}

		private static String printPassResult(Object params1, Object expected, Object result){
			return "PASS: middleThree("+ params1.toString()+ ") -> " + result.toString();
		}


		private static String printFailResult(Object params1, Object expected, Object result){
			String ret = "**********************" + "\n";
			ret += "FAIL: middleThree("+ params1.toString()+ ") -> " + result.toString()
			+ "      Expected: "+ expected.toString();
			ret += "\n" + "**********************";
			return ret;
		}
	}
}
