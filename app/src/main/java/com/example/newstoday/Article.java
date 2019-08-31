package com.example.newstoday;

public class Article {

    private String mArticleTitle;
    private String mArticleAuthor;
    private String mArticleDate;
    private String mUrl;
    private String mSection;

    public Article(String articleTitle, String articleAuthor, String articleDate, String url, String articleSection) {

        mArticleAuthor = articleAuthor;
        mArticleDate = articleDate;
        mArticleTitle = articleTitle;
        mUrl = url;
        mSection = articleSection;


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

    public String getUrl() {return mUrl;}

    public String getArticleSection() {return mSection;}

}