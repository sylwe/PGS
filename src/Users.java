public class Users{

    private String name;
    private String surename;
    protected String userName = "Jacek";
    protected String userSurename = "Placek";

    //Konstruktor klasy Users
    public Users()
    {
    }
    public Users(String name, String surename)
    {
        this.name = name;
        this.surename = surename;
    }
    public String getName()
    {
        return userName;
    }

    public String getSurename()
    {
        return userSurename;
    }

}
