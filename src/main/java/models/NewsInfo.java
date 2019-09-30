package models;
import java.util.Objects;

public class NewsInfo {
    private String header;
    private String content;
    private int id;

    public NewsInfo(String header, String content){
        this.content = content;
        this.header = header;
    }

    public String getHeader(){ return header; }

    public String getContent(){
        return content;
    }

    public int getId() {
        return id;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {  this.content = content; }

    public void setId(int id) {
        this.id = id;
    }

}
