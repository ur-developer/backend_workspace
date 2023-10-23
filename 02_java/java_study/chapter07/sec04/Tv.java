package java_study.chapter07.sec04;

public class Tv {
	private int channel;
	private int volum;
	private boolean onOff;
	private int serial;

	static int count = 0;

	public Tv() {
		super();

		count++;
		serial = count;
	}

	public Tv(int channel, int volum, boolean onOff) {
		super();

		count++;
		serial = count;

		this.channel = channel;
		this.volum = volum;
		this.onOff = onOff;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volum=" + volum + ", onOff=" + onOff + "]";
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
