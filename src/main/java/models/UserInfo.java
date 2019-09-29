package models;

public class UserInfo {
    private String post;
    private String role;
    private int id;

    public UserInfo(String post, String role){
        this.role = role;
        this.post = post;
    }

    public String getPost(){
        return post;
    }

    public String getRole(){
        return role;
    }

    public int getId() {
        return id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setContent(String content) {
        this.post = post;
    }

    public void setId(int id) {
        this.id = id;
    }

}

