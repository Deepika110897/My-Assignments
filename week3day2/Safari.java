package week3.day2;

public class Safari extends Browser {
	public Safari(String version) {
        super("Safari", version);
    }

    public void readerMode() {
        System.out.println("Safari is in Reader Mode.");
    }

    public void fullScreenMode() {
        System.out.println("Safari is now in Full Screen Mode.");
    }
}
