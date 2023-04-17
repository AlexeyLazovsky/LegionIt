package MusicStore;

public class CDAlbum extends Album{

    int numberOfTracks;
    String cdCaseMaterial;




    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public String getCdCaseMaterial() {
        return cdCaseMaterial;
    }

    public void setCdCaseMaterial(String cdCaseMaterial) {
        this.cdCaseMaterial = cdCaseMaterial;
    }


    public CDAlbum(String albumName, String artist, String genre, int price, int releaseYear, int numberOfTracks, String cdCaseMaterial) {
        super(albumName, artist, genre, price, releaseYear);
        this.numberOfTracks = numberOfTracks;
        this.cdCaseMaterial = cdCaseMaterial;
    }

    public void printAlbumDetails(){
        super.printAlbumDetails();
        System.out.println(" The number of tracks is" + numberOfTracks);
        System.out.println(" The cdCaseMaterial is " + cdCaseMaterial);
    }


}
