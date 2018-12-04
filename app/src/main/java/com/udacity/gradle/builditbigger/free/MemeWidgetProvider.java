package com.udacity.gradle.builditbigger.free;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;

import android.widget.RemoteViews;

import com.example.android.jokelibrary.JokeLibrary;
import com.udacity.gradle.builditbigger.R;

/**
 * Implementation of App Widget functionality.
 */
public class MemeWidgetProvider extends AppWidgetProvider {

    void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                         int appWidgetId) {

        //CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.meme_widget_provider);
        JokeLibrary jokeLibrary = new JokeLibrary();
        String jokeText = jokeLibrary.getJoke();
        views.setImageViewResource(R.id.widget_meme_image, context.getResources()
                .getIdentifier(jokeText, "drawable", context.getPackageName()));

        //Create an intent to launch MainLibrary when clicked
        //Intent intent = new Intent(context, MainActivity.class);
        //PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
        //Widgets allow click handlers to only launch pending intents
        //views.setOnClickPendingIntent(R.id.widget_meme_image, pendingIntent);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

