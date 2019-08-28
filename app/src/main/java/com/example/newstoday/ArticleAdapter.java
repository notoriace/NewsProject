package com.example.newstoday;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ArticleAdapter extends ArrayAdapter<Article> {


    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateOfArticle) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateOfArticle);
    }

    public ArticleAdapter(Activity context, ArrayList<Article> words) {

        /**
         * This is where we initialize the ArrayAdapter's internal storage for the context
         * and the list.
         * The second argument is used when the ArrayAdapter is populating a single TextView.
         *Since this is a custom adapter for two TextView and an ImageView, the adapter is
         * not going use this second argument, so it can be any value, we used 0
         */

        super(context, 0, words);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    //Remember that the line below over rides the getView originally associated with ArrayAdapter
    //and replaces it with the code written below.
    //this method gets callled when a list view is trying to display a list of items in a list
    //view.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent,
                    false);
        }

        /**
         * Gets the object at this position within the list.
         */

        Article currentArticle = getItem(position);

        //Finds text view for Title of Article
        TextView articleTitle = (TextView) listItemView.findViewById(R.id.article_title);
        //Pulls the current title of the article
        String titleOfArticle = currentArticle.getArticleTitle();
       //Pulls the title of the article from the array into the text view
        articleTitle.setText(titleOfArticle);

        //Finds the text view for the author
        TextView articleAuthor = (TextView) listItemView.findViewById(R.id.article_author);
        String authorOfArticle = currentArticle.getArticleAuthor();
        //Pulls the location from the array list to the location text view
        articleAuthor.setText(authorOfArticle);

        // Find the TextView with date of the article
        TextView dateOfArticle = (TextView) listItemView.findViewById(R.id.date);
       // Sets the date of the article to the variable articleDate
        String articleDate = currentArticle.getArticleDate();
        // Display the date of the current article  in that TextView
        dateOfArticle.setText(articleDate);


        /**


        //Create a new Date object from the time in milliseconds
        Date dateOfQuake = new Date(currentArticle.getDate());
        //Format the date string to something readable (i.e. Mar 8, 1992)
        String formattedDateOfQuake = formatDate(dateOfQuake);
        //Finds the text view for the date
        TextView quakeDate = (TextView) listItemView.findViewById(R.id.date);
        //Pulls the date from the array list to the date text view
        quakeDate.setText(formattedDateOfQuake);
        //Pulls the time of the quake into a readable format (i.e. 3PM)
        String formattedTimeofQuake = formatTime(dateOfQuake);
        //Finds the text view for the time
        TextView timeOfQuake = (TextView) listItemView.findViewById(R.id.time);
        //Pulls the time of the quake from the array and placed it in the time text view
        timeOfQuake.setText(formattedTimeofQuake);

         */

        return listItemView;


    }
}