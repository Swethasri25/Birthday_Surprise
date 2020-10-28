package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String[] questions={"1.She is well known chef and lives in the place where you have done your Polytechnic.",
            "2.Basket ball player and reminds him,especially whenever we get health problems.",
            "3.Who gives knowledge to thousands of students.",
            "4.Whose 'name' means 'Graceful lady/Woman'",
            "5.I'm a person who is in the same profession as you are.Who am I?",
            "6.Kid who loves to play with pet animals and now studying in 5th grade.",
            "7.Superactive kid in our family and singer(sa re ga ma pa da ne sa...)",
            "8.He is a Tennis Player",
            "9.Actor,Artist,Singer,Dancer..and many more.Who is the person",
            "10.Someone who knows little bit of Urdu and once entered politics.",
            "11.The person who has more patience.",
            "12.Person whose favorite heroine is Sridevi",
            "13.Tallest person in our family",
            "14.Ravi+______. By filling the blank we get a tollywood hero name.",
            "15.Great dancer from tha's sisters",
            "16.Business man in our family",
            "17.Who is into the software field",
            "18.Who has long hair in our family",
            "19.Kid who always likes to play in our apartments(park).",
            "20.The youngest boy in our family"
    };
    String[] ops={"Chinakka","Pedhakka","Amma"," Vanitha","Ravi","Kiran","Naveen","Hemanth","Chinakka","Haritha","Vanitha","None",
    "Haritha","Sunitha","Vanitha","None","Chinna Bavagaru","Kiran","Ravi","Naveen","Hemanth","Raghu","Shyamu",
    "None","Hemanth","Raghu","Shyamu","Tharan","Raghu","Hemanth","Sai","None","Kiran","Koushik","Ravi","None","Vanitha",
    "Haritha","Swetha","Sunitha","Praveen","Pedha bavagaru","Nanna","Chinna bavagaru","Ravi","Ramu","Naveen","Kiran",
    "Kiran","Koushik","Ravi","Chinna bavagaru",
    "Sai","Hari","Teja","Shyamu",
            "Vanitha","Sunitha","Haritha","Swetha",
            "Kiran","Raja","Ravi","China Bavagaru",
            "Praveen","Naveen","China bavagaru","Pedha bavagaru",
            "Haritha","Varalakshmi","Sunitha","Vanitha",
            "Jeshu","Raghu","Hemu","Shyamu",
            "Hemu","Raghu","Tharan","Shyamu"
    };
    String[] ans={"Pedhakka","Naveen","Chinakka","Vanitha","Chinna Bavagaru","Raghu","Shyamu","Hemanth","Kiran","Sunitha","Pedha bavagaru",
    "Ramu","Ravi","Teja","Haritha","Raja","Praveen","Varalakshmi","Jeshu","Tharan"};
    TextView t;
    Button o1,o2,o3,o4;
    private static int i=0;
    int siz=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t=findViewById(R.id.textView2);
        t.setText(questions[i]);
        o1=findViewById(R.id.option1);
        o1.setText(ops[(4*i)+0]);
        o2=findViewById(R.id.option2);
        o2.setText(ops[(4*i)+1]);
        o3=findViewById(R.id.option3);
        o3.setText(ops[(4*i)+2]);
        o4=findViewById(R.id.option4);
        o4.setText(ops[(4*i)+3]);
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans[i]==o1.getText().toString())
                {
                    Toast.makeText(SecondActivity.this,"Correct..",Toast.LENGTH_SHORT).show();
                    if(i<siz-1) {
                        i = i + 1;
                    }
                    Intent intent=new Intent(SecondActivity.this,Aud.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SecondActivity.this,"Wrong answer..choose another option..",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans[i]==o2.getText().toString())
                {
                    Toast.makeText(SecondActivity.this,"Correct..",Toast.LENGTH_SHORT).show();
                    if(i<siz-1) {
                        i = i + 1;
                    }
                    Intent intent=new Intent(SecondActivity.this,Aud.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SecondActivity.this,"Wrong answer..choose another option..",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans[i]==o3.getText().toString())
                {
                    Toast.makeText(SecondActivity.this,"Correct..",Toast.LENGTH_SHORT).show();
                    if(i<siz-1) {
                        i = i + 1;
                    }
                    Intent intent=new Intent(SecondActivity.this,Aud.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SecondActivity.this,"Wrong answer..choose another option..",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans[i]==o4.getText().toString())
                {
                    Toast.makeText(SecondActivity.this,"Correct..",Toast.LENGTH_SHORT).show();
                    if(i<siz-1) {
                        i = i + 1;
                    }
                    Intent intent=new Intent(SecondActivity.this,Aud.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SecondActivity.this,"Wrong answer..choose another option..",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
