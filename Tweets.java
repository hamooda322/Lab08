public class Tweets {
    private String text;
    private String datetime;
    private String author;

    public void setAuthor(Users author){
        this.author = author;

    }
    public Tweets(String text, String datetime, Users author){
        this.text = text;
        this.datetime = datetime;
        this.author = author;
    }

}
