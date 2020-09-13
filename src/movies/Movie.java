package movies;

public class Movie {

    //    private fields for name and category
    private String name;
    private String category;

    //  constructor that sets name/category
    public Movie (String name, String category){
        setName(name);
        setCategory(category);
    }

    //    Create methods to access these properties and change them (getters and setters).
    public void setName(String setname){this.name = setname;}
    public void setCategory(String setcategory){this.category = setcategory;}

    public static String getName(Movie element){return element.name;}
    public static String getCategory(Movie element){return element.category;}

}
