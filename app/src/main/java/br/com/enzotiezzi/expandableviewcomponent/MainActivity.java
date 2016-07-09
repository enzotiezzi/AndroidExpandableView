package br.com.enzotiezzi.expandableviewcomponent;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import br.com.enzotiezzi.expandableviewcomponent.custom.ExpandableItem;
import br.com.enzotiezzi.expandableviewcomponent.custom.ExpandableView;

public class MainActivity extends AppCompatActivity
{
    private Context context;

    private ExpandableView expandableView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        expandableView = (ExpandableView) findViewById(R.id.view);

        test();
    }

    private void test()
    {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        String title = "Show me the test";
        View viewTest = layoutInflater.inflate(R.layout.test, null);

        expandableView.setTitle(title);
        expandableView.setContentView(viewTest);
    }
}
