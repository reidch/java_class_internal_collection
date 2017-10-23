public class Library{
	private String name;
	private Book[] stock;
	public Library(String name){
		this.name = name;
		this.stock = new Book[100];
	}

	public String getName(){
		return this.name;
	}

	public int stockCount(){
		int count = 0;
		for (Book book : this.stock){
			if(book != null){
				count++;
			}
		}
		return count;
	}

	public void add(Book book){
		if(!isLibraryFull()){
			int stockCount = stockCount();
			this.stock[stockCount] = book;
		}
	}

	public boolean isLibraryFull(){
		return stockCount() == stock.length;
	}

	public void lend(Book book){
		if(stockCount() != 0) {
			int stockCount = stockCount();
			this.stock[stockCount-1] = null;
		}
	}
}
