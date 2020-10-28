package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class Aud extends AppCompatActivity {
    Button butt,butt1;
    ImageView imageView;
    private static int j;
    int si=20;
    String[] imgs={"https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/pedhathapic.jpeg?alt=media&token=1a9c9ad2-547a-494d-85d5-daedf74fdb04",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/naveenpic.jpeg?alt=media&token=692fe136-c6d0-45c2-9fd4-8bfe8d0019de",
    "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/chinathapic.jpeg?alt=media&token=39e1a402-29cf-40c8-a9d7-221268fc1965",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/vanithapic.jpeg?alt=media&token=daec5ab9-c8af-4f77-a794-940a12569570",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/mamayyaRpic.jpeg?alt=media&token=aaaa0f2b-ea88-448a-a242-68f1a7632699",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/raghupic.jpeg?alt=media&token=b51018e6-6127-4006-8a95-e52aff5c1f2c",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/shyamupic.jpeg?alt=media&token=258aa381-36fb-4441-8a73-b97288550434",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/hemupic.jpeg?alt=media&token=a71cf148-7c0a-49c5-96f7-b9646c35212f",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/kiranpic.jpeg?alt=media&token=e0fa40d4-1836-436e-ad3c-e18b0e576bb1",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/sunithapic.jpeg?alt=media&token=f9c65f82-4a24-4ef7-b0a6-ea34fcb6622a",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/mamyyaVpic.jpeg?alt=media&token=4cc42986-a7e1-4d29-bc7a-55ed5225a24a",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/ramupic.jpeg?alt=media&token=a9ef5917-2946-4dd1-826e-5799ba0a1b2d",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/ravipic.jpeg?alt=media&token=06f45f65-0964-43b2-a280-3bd17a034ec2",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/tejupic.jpeg?alt=media&token=f4f9e548-fb91-44a7-9c7a-1356db4493b7",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/harithapic.jpeg?alt=media&token=d71e3438-8e62-40cb-aa3a-93c7a05e10b6",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/rajapic.jpeg?alt=media&token=2d553e23-0fb6-47b5-845e-0899a168777d",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/praveenpic.jpeg?alt=media&token=25864476-87cb-41c6-8d46-943439c948f2",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/athapic.jpeg?alt=media&token=3063e913-628c-404b-b980-b0cf87ae9d2e",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/jeshupic.jpeg?alt=media&token=577fc7af-7e81-4266-8ae7-9041f0c5b2a3",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/tharanpic.jpeg?alt=media&token=cea1baee-67b8-4883-8651-3d965c7e76f0"

    };
    String[] Auds={"https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/Pedhatha.ogg?alt=media&token=58acf04c-3292-4277-99e4-242a683043dc",
    "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/naveenrec.ogg?alt=media&token=6e54f581-ace2-46ba-90f0-c554351bd651",
    "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/chinatharec.ogg?alt=media&token=73c0449b-43ab-44de-a875-d2c00c474aca",
    "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/vanitharec.ogg?alt=media&token=9f352ad8-43f6-4402-a098-5e1591357247",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/mamayyaRrec.ogg?alt=media&token=d6cf296a-5bbc-4028-84cf-d772ea5538a5",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/raghurec.ogg?alt=media&token=7925ed5f-004c-42bb-85bc-b79bbc822b7a",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/shyamurec.ogg?alt=media&token=904a4e70-4ccc-4324-923b-2124126423bc",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/hemurec.ogg?alt=media&token=bb278ab0-9f7c-4a9c-9169-b7a6c32d5934",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/kiranrec.ogg?alt=media&token=aed95a47-69a0-4dc2-9e39-8ce90df7fce4",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/sunitharec.ogg?alt=media&token=5493d71d-8289-44f1-b204-3b7651c0a639",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/mamayyaVrec.ogg?alt=media&token=41c6394a-33c7-474a-b561-41d957a94dfb",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/ramurec.ogg?alt=media&token=f0c65a04-7c0a-4f69-b62b-72d71baa76a9",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/ravirec.ogg?alt=media&token=38107051-c1d6-4987-8ae4-8690663eaa6a",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/tejurec.ogg?alt=media&token=639abc15-944b-4ec0-b14a-621d6680e050",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/haritharec.ogg?alt=media&token=69705def-390f-4834-a020-0f90749fb933",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/rajarec.ogg?alt=media&token=a069768e-3dc1-46f8-bfec-8ab45916cefd",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/praveenrec.ogg?alt=media&token=b723dc54-e2d9-426f-92f5-761010cea429",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/atharec.ogg?alt=media&token=e77094ae-190f-424c-94dd-73ba76de55d3",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/jeshurec.ogg?alt=media&token=edc19f0c-469b-4ec9-85ee-4fe5c246d730",
            "https://firebasestorage.googleapis.com/v0/b/birthday-d8215.appspot.com/o/tharanrec.ogg?alt=media&token=edd2bf6d-d5d9-4305-84ee-34c8885f2dd5"
    };
    private Handler mhand=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aud);
        butt=findViewById(R.id.nex);
        butt.setVisibility(View.GONE);
        butt1=findViewById(R.id.sur);
        imageView=findViewById(R.id.imageView);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(Aud.this).load(imgs[j]).into(imageView);
                MediaPlayer mediaPlayer=new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(Auds[j]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mediaPlayer.start();
                    }
                });
                try {
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Runnable m =new Runnable() {
                    @Override
                    public void run() {
                        butt.setVisibility(View.VISIBLE);
                    }
                };
                mhand.postDelayed(m,4000);
            }
        });
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                butt.setVisibility(View.GONE);
                Intent intent1=new Intent(Aud.this,SecondActivity.class);
                startActivity(intent1);
                if(j<si-1) {
                    j = j + 1;
                }else{
                    Intent i2=new Intent(Aud.this,Last.class);
                    startActivity(i2);
                }
            }
        });
    }
}
