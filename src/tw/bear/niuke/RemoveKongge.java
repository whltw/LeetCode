package tw.bear.niuke;

public class RemoveKongge {
	public void removeKongge(String str) {
		String replace = str.replace(" ", "%20");
		System.out.println(replace);
	}
	public static void main(String[] args) {
		RemoveKongge removeKongge= new RemoveKongge();
		removeKongge.removeKongge(" abc ");
		
	}
}
