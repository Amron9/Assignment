package Program;

public class TeachersRBCA22117 {

	 protected String type;

	    // Constructor
	    public TeachersRBCA22117 (String type) {
	        this.type = type;
	    }

	    // Method to print what the teacher teaches
	    public void teaches() {
	        System.out.println("The teacher is teaching " + type);
	    }
	}

	// Subclass
	class TeacherTeaches extends TeachersRBCA22117 {
	    private String name;

	    // Constructor
	    public TeacherTeaches(String type, String name) {
	        super(type);
	        this.name = name;
	    }

	    // Method to print the subject
	    public void subjects() {
	  System.out.println("The teacher " + name + " is teaching " + type);
	    }
	}
