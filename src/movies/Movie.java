package movies;

public class Movie {

    private String name;
    private String category;

    public Movie (String name, String category){
        setName(name);
        setCategory(category);
    }

    public void setName(String setname){this.name = setname;}
    public void setCategory(String setcategory){this.category = setcategory;}

    public static String getName(Movie element){return element.name;}
    public static String getCategory(Movie element){return element.category;}


}
