package Lesson_06_with_disks;

public class DiskAudio extends Disks {
    // Поля

        private  String name; // названия альбома
    private String singer;
    private int year;
    private int countOfTracks;// количество треков



    // Констукторы

    public DiskAudio(String name, int year, String singer, int countOfTracks) {
        super(name, year);
        this.singer = singer;
        this.countOfTracks = countOfTracks;
    }


    // Методы


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public int getCountOfTracks() {
        return countOfTracks;
    }

    public void setCountOfTracks(int countOfTracks) {
        this.countOfTracks = countOfTracks;
    }
}
