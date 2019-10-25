package com.biplav.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView actv;
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
    }
}
