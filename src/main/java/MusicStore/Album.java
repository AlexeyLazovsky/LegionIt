package MusicStore;

public class Album {

    String albumName;
    String artist;
    String genre;
    int price;
    int releaseYear;

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

public Album(String albumName, String artist, String genre, int price, int releaseYear){
        this.albumName=albumName;
        this.artist=artist;
        this.genre=genre;
        this.price=price;
        this.releaseYear=releaseYear;


}



public void printAlbumDetails(){
    System.out.println("The album name is : "+ albumName);
    System.out.println("The artist name is : "+ artist);
    System.out.println("The genre is : " + genre);
    System.out.println("The album price is : "+price);
    System.out.println("The album release year is : " + releaseYear);
}


}
