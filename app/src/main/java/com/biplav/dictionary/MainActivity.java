package com.biplav.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String word;
    private AutoCompleteTextView actv;
    private TextView tv;
    private Button btn;
    private ListView lv;
    private Map<String,String> wordMeaning;

    private String WordAndMeaning[] = {
            "mendicant", "a pauper who lives by begging",
            "meretricious", "tastelessly showy",
            "vitiate", "make imperfect",
            "vapid", "lacking significance or liveliness or spirit or zest",
            "ruddy", "inclined to a healthy reddish color",
            "augur", "predict from an omen",
            "prosaic", "lacking wit or imagination",
            "profligate", "unrestrained by convention or morality",
            "hoary", "having gray or white hair as with age",
            "blase", "nonchalantly unconcerned",
            "insular", "narrowly restricted in outlook or scope",
            "baleful", "threatening or foreshadowing evil or tragic developments",
            "ostensible", "appearing as such but not necessarily so",
            "odium", "hate coupled with disgust"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=findViewById(R.id.actv);
        btn=findViewById(R.id.btn);
        lv=findViewById(R.id.lv);
        tv=findViewById(R.id.tv);

        wordMeaning=new HashMap<>();
        for(int i=0; i<WordAndMeaning.length; i+=2)
        {
            wordMeaning.put(WordAndMeaning[i], WordAndMeaning[i+1]);
        }

        ArrayAdapter arrayAdapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new ArrayList(wordMeaning.keySet())
        );
       lv.setAdapter(arrayAdapter);


     //code for autocomplete texxtview
        ArrayAdapter arrayAdapter1=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new ArrayList(wordMeaning.keySet())
        );
        actv.setAdapter(arrayAdapter1);
        actv.setThreshold(1);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        word=actv.getText().toString();
        String meaning=wordMeaning.get(word);
        tv.setText("The meaning of" + word+ " is "+ meaning);
        //Toast.makeText(this, "The meaning of "+ word + " is " + meaning, Toast.LENGTH_SHORT).show();

    }
}
