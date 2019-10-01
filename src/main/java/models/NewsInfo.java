package models;

public class NewsInfo {

    private String header;
    private String content;
    private int deptInfId;
    private String author;
    private int id;

    public NewsInfo(String header, String content, String author){
        this.content = content;
        this.header = header;
        this.author = author;
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
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getDeptInfId() { return deptInfId; }
    public void setDeptInfId(int deptInfId) { this.deptInfId = deptInfId; }

}
