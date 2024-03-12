package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac,int cap)
	{
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getcapacity(){
		return capacity;
	}
	public int getBusNo() {
		return busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public void setcapacity(int cap) {
		capacity=cap;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo+" Ac: "+ac+" Total Capacity: " +capacity);
	}
}
