import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new ArrayList();
	}
	
	public void addBuddy(BuddyInfo buddy) {
		addressBook.add(buddy);
	}
	
	public BuddyInfo removeBuddy(BuddyInfo buddy) {
		BuddyInfo deletedBuddy = null;
		for(BuddyInfo b:addressBook ) {
			if(b.equals(buddy.getName()) && b.equals(buddy.getAddress()) && b.equals(buddy.getPhoneNumber())){
				deletedBuddy = b;
				addressBook.remove(b);
			}
		}
		return deletedBuddy;
	}
	
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		BuddyInfo buddy = new BuddyInfo("Josh", "abc", "456");
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
		
	}

}
