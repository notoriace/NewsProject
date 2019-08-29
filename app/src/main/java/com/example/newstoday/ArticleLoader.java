package com.example.newstoday;

import android.content.Context;

import android.content.AsyncTaskLoader;

import java.util.List;

public class ArticleLoader  extends AsyncTaskLoader<List<Article>> {


    /** Tag for log messages */
    private static final String LOG_TAG = ArticleLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link ArticleLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Article> articles = QueryUtils.fetchArticleData(mUrl); //this is related to line 108 in QueryUtils in Quakereport
        return articles;
    }

}
