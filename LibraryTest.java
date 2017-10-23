import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{
	Library library;
	Book book;
	// Borrower borrower;

	@Before
	public void before(){
		library = new Library("Mitchell Library");
		book = new Book();
	}

	@Test
	public void hasName(){
		assertEquals("Mitchell Library", library.getName());
	}

	@Test
	public void libraryHasNoBooks(){
		assertEquals(0, library.stockCount());
	}

	@Test
	public void libraryHasBooks(){
		library.add(book);
		library.add(book);
		assertEquals(2, library.stockCount());
	}

	@Test
	public void libraryCanAddBooks(){
		library.add(book);
		library.add(book);
		library.add(book);
		library.add(book);
		assertEquals(4, library.stockCount());
	}

	@Test
	public void libraryIsFull(){
		for(int i=0; i < 100; i++){
			library.add(book);
		}
		assertEquals(true, library.isLibraryFull());
	}

	@Test
	public void libraryCanLendBooks(){
		library.add(book);
		library.add(book);
		library.add(book);
		library.add(book);
		library.lend(book);
		assertEquals(3, library.stockCount());
	}

	// @Test
	// public void libraryAdjustsStock(){
	// 	borrower.borrow(book);
	// 	borrower.borrow(book);
	// 	library.add(book);
	// 	assertEquals(1, library.stockCount());
	// }
}
