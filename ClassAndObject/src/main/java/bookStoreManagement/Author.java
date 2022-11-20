package bookStoreManagement;

public class Author {
    private String name;
    private Birthday date;
    public Author (){}

    public Author(String name, Birthday date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Birthday getDate() {
        return date;
    }

    public void setDate(Birthday date) {
        this.date = date;
    }
}
