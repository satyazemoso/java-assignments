package org.designPatterns.memonto;

public class Article {
    private long id;
    private String title;
    private String content;
    public Article(long id,String title,String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public ArticleMemento getMemonto(){
        ArticleMemento articleMemento = new ArticleMemento(id,title,content);
        return articleMemento;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public void restore(ArticleMemento articleMemento){
        this.id = articleMemento.getId();
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
    }



}
