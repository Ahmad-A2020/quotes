package quotes;


public class Quote  {
    private final String [] tags;
    private final String  author;
    private  final String  likes;
    private  final String  text;


    public Quote(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }


    public String getText() {
        return text;
    }


}
