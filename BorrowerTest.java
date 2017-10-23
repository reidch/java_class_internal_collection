// import static org.junit.Assert.assertEquals;
// import org.junit.*;
//
// public class BorrowerTest{
// 	Borrower borrower;
// 	Book book;
//
// 	@Before
// 	public void before(){
// 		borrower = new Borrower("Elizabeth Miller");
// 		book = new Book();
// 	}
//
// 	@Test
// 	public void hasName(){
// 		assertEquals("Elizabeth Miller", borrower.getName());
// 	}
//
// 	@Test
// 	public void borrowerHasNoBooks(){
// 		assertEquals(0, borrower.rentalCount());
// 	}
//
// 	@Test
// 	public void borrowerCanBorrowBooks(){
// 		borrower.borrow(book);
// 		assertEquals(1, borrower.rentalCount());
// 	}
//
// 	@Test
// 	public void borrowerMaxRental(){
// 		for(int i=0; i < 7; i++){
// 			borrower.borrow(book);
// 		}
// 		assertEquals(true, borrower.isRentalMax());
// 	}
// }
