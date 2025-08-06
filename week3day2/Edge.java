package week3.day2;

public class Edge extends Browser {
	public Edge(String version) {
        super("Edge", version);
    }

    public void takeSnap() {
        System.out.println("Edge is taking a snapshot.");
    }

    public void clearCookies() {
        System.out.println("Edge cookies cleared.");
    }
}
