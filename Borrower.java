// public class Borrower{
// 	private String name;
// 	private Book[] rental;
// 	public Borrower(String name){
// 		this.name = name;
// 		this.rental = new Book[7];
// 	}
//
// 	public String getName(){
// 		return this.name;
// 	}
//
// 	public int rentalCount(){
// 		int count = 0;
// 		for (Book book : this.rental){
// 			if(book != null){
// 				count++;
// 			}
// 		}
// 		return count;
// 	}
//
// 	public void borrow(Book book){
// 		if(!isRentalMax()){
// 			int rentalCount = rentalCount();
// 			this.rental[rentalCount] = book;
// 		}
// 	}
//
// 	public boolean isRentalMax(){
// 		return rentalCount() == rental.length;
// 	}
// }
