package Lesson_06_with_disks;

public class DiskVideo extends Disks{
    // Поля

       private  String name;
       private  int year;
       private String studio;
       private String director;
       private  int longtime;




    // Констукторы

    public DiskVideo(String name, int year, String studio, String director, int longtime) {
        super(name, year);
        this.studio = studio;
        this.director = director;
        this.longtime = longtime;
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

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLongtime() {
        return longtime;
    }

    public void setLongtime(int longtime) {
        this.longtime = longtime;
    }
}
