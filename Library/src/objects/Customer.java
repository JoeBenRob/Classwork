package objects;

public class Customer implements Crudable {
	private int cid;
	private String joinDate;
	private boolean member;

	public Customer(int cid, String joinDate, boolean member) {
		super();
		this.cid = cid;
		this.joinDate = joinDate;
		this.member = member;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
