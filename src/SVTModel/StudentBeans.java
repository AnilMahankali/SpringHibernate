package SVTModel;

public class StudentBeans {
	private int id;
	private String fname;
	private String mname;

	public StudentBeans() {
	}

	public StudentBeans(int id, String fname, String mname) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
}
