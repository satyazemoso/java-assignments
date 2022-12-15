package org.designPatterns.memonto;

public class ArticleMemento {
    private long id;
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
    public ArticleMemento(long id,String title,String content){
        this.id = id;
        this.content = content;
        this.title = title;
    }

}
