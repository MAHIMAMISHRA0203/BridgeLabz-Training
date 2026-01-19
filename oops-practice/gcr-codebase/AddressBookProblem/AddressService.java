package gcr_codebase.AddressBook;

import jdk.javadoc.doclet.Reporter;

public class AddressService {
	 private AddressDAO repo = new AddressDAO();

	    // UC1: Add Contact
	    public void addContact( AddressModel c) {
	        repo.save(c);
	    }
}
