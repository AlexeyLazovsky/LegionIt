package MusicStore;

public class DigitalAlbum extends Album {



    String downloadURL;
    String fileFormat;

    int fileSize;

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    public DigitalAlbum(String albumName, String artist, String genre, int price, int releaseYear, String downloadURL, String fileFormat, int fileSize) {
        super(albumName, artist, genre, price, releaseYear);
        this.downloadURL = downloadURL;
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }


    public void printAlbumDetails(){
        super.printAlbumDetails();
        System.out.println(" The download URL is :" + downloadURL);
        System.out.println(" The file format is : " + fileFormat);
        System.out.println(" The file size is : " + fileSize);
    }



}
