package br.com.enzotiezzi.expandableviewcomponent.custom;

import android.view.View;

/**
 * Created by enzo on 06/07/2016.
 */
public class ExpandableItem
{
    private String mTitle;
    private View mContent;

    public ExpandableItem(String mTitle, View mContent)
    {
        this.setTitle(mTitle);
        this.setContent(mContent);
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void setTitle(String mTitle)
    {
        this.mTitle = mTitle;
    }

    public View getContent()
    {
        return mContent;
    }

    public void setContent(View mContent)
    {
        this.mContent = mContent;
    }
}
