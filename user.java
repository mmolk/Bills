class user {	
	String userName;
	double userBalance;
 
	String racName;
	double racValue;
	
	void remove(double x) {		
		userBalance -=x;
		System.out.println(userName +" je zgubil "+ x);
				
	}
	
	void add(double x) {
		userBalance +=x;
		System.out.println(userName +" je dobil "+ x);
	}	

	
	double getS() {
		return userBalance;
	}

}
