package com.example.newstoday;

public class Article {

    private String mArticleTitle;
    private String mArticleAuthor;
    private String mArticleDate;

    public Article(String articleTitle, String articleAuthor, String articleDate) {

        mArticleAuthor = articleAuthor;
        mArticleDate = articleDate;
        mArticleTitle = articleTitle;


    }

    //returns the title of the article
    public String getArticleTitle() {
        return mArticleTitle;
    }

    //returns the author of the article
    public String getArticleAuthor() {
        return mArticleAuthor;
    }

    //returns the date of the article
    public String getArticleDate() {
        return mArticleDate;
    }

}