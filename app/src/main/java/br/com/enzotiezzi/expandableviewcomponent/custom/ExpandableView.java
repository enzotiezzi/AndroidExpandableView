package br.com.enzotiezzi.expandableviewcomponent.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.enzotiezzi.expandableviewcomponent.R;

/**
 * Created by enzo on 06/07/2016.
 */
public class ExpandableView extends LinearLayout
{
    private View view;
    private Context context;
    private LayoutInflater layoutInflater;

    private TextView mTextViewTitle;
    private LinearLayout mLinearLayout;

    public ExpandableView(Context context)
    {
        super(context);
        this.context = context;
        initialize();
    }

    public ExpandableView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.context = context;
        initialize();
    }

    private void initialize()
    {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.expandable_view_item, this, true);

        mTextViewTitle = (TextView) view.findViewById(R.id.textViewTitle);
        mLinearLayout = (LinearLayout) view.findViewById(R.id.appendPoint);
    }

    public void setTitle(String title)
    {
        mTextViewTitle.setText(title);
    }

    public void setContentView(View contentView)
    {
        mLinearLayout.addView(contentView, 0);

        mTextViewTitle.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                toggleContents(mLinearLayout);
            }
        });
    }

    private void toggleContents(View v)
    {
        if(v.isShown())
        {
            slideUp(v);
            v.setVisibility(View.GONE);
        }
        else{
            slideDown(v);
            v.setVisibility(View.VISIBLE);
        }
    }

    private void slideDown(View v)
    {
        Animation a = AnimationUtils.loadAnimation(context, R.anim.slide_down);
        if(a != null)
        {
            a.reset();
            if(v != null)
            {
                v.clearAnimation();
                v.startAnimation(a);
            }
        }
    }

    private void slideUp(View v)
    {
        Animation a = AnimationUtils.loadAnimation(context, R.anim.slide_up);
        if(a != null)
        {
            a.reset();
            if(v != null)
            {
                v.clearAnimation();
                v.startAnimation(a);
            }
        }
    }
}
