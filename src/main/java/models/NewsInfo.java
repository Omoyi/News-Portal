package models;
import java.util.Objects;

public class NewsInfo {

    private String header;
    private String content;
    private int deptInfId;
    private int id;


    public NewsInfo(String header, String content){
        this.content = content;
        this.header = header;
        this.deptInfId = deptInfId;
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
