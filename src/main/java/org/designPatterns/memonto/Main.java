package org.designPatterns.memonto;

public class Main {
    public static void main(String args[]){
        Article article = new Article(1,"testtitle","testdescription");
        ArticleMemento articleMemento = article.getMemonto();
        System.out.println("Inititial Article="+article);
        article.setContent("updateddescription");
        System.out.println("Updated Article="+article);
        article.restore(articleMemento);
        System.out.println("Resotred Article="+article);
    }
}
