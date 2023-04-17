package MusicStore;

public class MusicStoreMain {
    public static void main(String[] args) {
        VinylAlbum album1= new VinylAlbum("Violator","Depeche Mode", "rock", 15, 1993, 20, "black",185);
        album1.printAlbumDetails();

        DigitalAlbum album2=new DigitalAlbum("Like a Prayer","Madonna", "pop", 10, 1989,"www.madonna.com","MP3",15);
        album2.printAlbumDetails();

        CDAlbum album3=new CDAlbum("Music", "Madonna", "pop",12,2000,9,"Plastic");

        album3.setCdCaseMaterial("metallic");
        album3.printAlbumDetails();



    }






}
