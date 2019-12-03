import java.util.ArrayList;

public class Database {
	
	private ArrayList<Member> members = new ArrayList<>();
	private ArrayList<Resource> resources = new ArrayList<>();
	
	public void addMember(Member m) {
		members.add(m);
	}
	public void addResource(Resource r) {
		resources.add(r);
	}
	
	public void printMembers() {
		for(Member m : members) {
			System.out.println(m.getDetails());
		}
	}
	public void printResources() {
		for(Resource r : resources) {
			System.out.println(r.getDetails());
		}
	}
}