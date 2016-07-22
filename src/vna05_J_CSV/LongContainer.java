package vna05_J_CSV;

class LongContainer {
	private volatile long i = 0;
	
	void assignValue(long j) { 
		i = j;
	}
	
	void printLong() { 
		System.out.println("i = " + i);
	} 
	
}