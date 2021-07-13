public class Book extends Product{
    private String author, title;
    private int pages;

    @Override
    public String toString(){
        return "Title:          " + title + "\n" +
                "Author:         " + author + "\n" +
                "Pages:          " + pages + "\n" ;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }


    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }


    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return this.pages;
    }
}
