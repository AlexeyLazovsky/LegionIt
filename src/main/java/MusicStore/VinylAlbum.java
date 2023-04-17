package MusicStore;

public class VinylAlbum extends Album {


    int vinylSize;
    String vinylColor;

    int RPM;




    public int getVinylSize() {
        return vinylSize;
    }

    public void setVinylSize(int vinylSize) {
        this.vinylSize = vinylSize;
    }

    public String getVinylColor() {
        return vinylColor;
    }

    public void setVinylColor(String vinylColor) {
        this.vinylColor = vinylColor;
    }

    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }


    public VinylAlbum(String albumName, String artist, String genre, int price, int releaseYear, int vinylSize, String vinylColor, int RPM) {
        super(albumName, artist, genre, price, releaseYear);
        this.vinylSize = vinylSize;
        this.vinylColor = vinylColor;
        this.RPM = RPM;
    }

    public void printAlbumDetails(){
        super.printAlbumDetails();
        System.out.println(" The vinyl Size is :" + vinylSize);
        System.out.println(" The vinyl color is : " + vinylColor);
        System.out.println(" The RPM is : " + RPM);
    }

}
