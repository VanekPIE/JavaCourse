package Lesson_08.GHjmeWork_Produkt;

public class Category {
    String CategoryName;
    Tovar[] tovars = new Tovar[3];

    public Category(String categoryName, Tovar[] tovars){
        this.CategoryName = categoryName;
        this.tovars = tovars;
    }

    public Category() {
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Tovar[] getTovars() {
        return tovars;
    }

    public void setTovars(Tovar[] tovars) {
        this.tovars = tovars;
    }
}

