package comx.example.amithy.inclass03;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final int REQ_CODE =100;
public String img_name;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE) {
            Intent intent = getIntent();
            int name = Integer.parseInt(data.getStringExtra("im1"));
            img_name = data.getStringExtra("im1");
            ImageButton im = (ImageButton) findViewById(R.id.imageButton);
            im.setImageResource(0);
            if (name == 1) {
                findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.avatar_f_1));
            } else if (name == 2) {
                findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.avatar_f_2));

            } else if (name == 3) {
                findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.avatar_f_3));

            } else if (name == 4) {
                findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.avatar_m_1));

            } else if (name == 5) {
                findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.avatar_m_2));

            } else if (name == 6) {
                findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.avatar_m_3));

            }
        } else {
            Intent in = getIntent();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My Profile");

        findViewById(R.id.imageButton).setBackground(getResources().getDrawable(R.drawable.select_image));
        img_name="0";


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                EditText e3 = findViewById(R.id.editText3);
                EditText e2 = findViewById(R.id.editText2);
                EditText e = findViewById(R.id.editText);
                String Firstname= e.getText().toString();
                String Lastname = e2.getText().toString();
                String number = e3.getText().toString();

                RadioGroup rg=(RadioGroup)(findViewById(R.id.radioGroup)) ;
                RadioButton rb1=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String radio=rb1.getText().toString();

                if(Firstname.length()==0 && Lastname.length()==0 && number.length()==0){
                    Toast.makeText(MainActivity.this,"Enter missing Fileds",Toast.LENGTH_LONG).show();
                }else if(number.length()!=9 ){
                    Toast.makeText(MainActivity.this,"Enter 9 digits in Student ID",Toast.LENGTH_LONG).show();
                }
                else {
                   Intent intent = new Intent(MainActivity.this, DisplayProfile.class);
                    Student s=new Student(Firstname, Lastname,number,img_name,radio);
                    intent.putExtra("obj",s);
                    startActivityForResult(intent,10101);

                }
            }

        });
        findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SelectAvatar.class);
                startActivityForResult(i,REQ_CODE);
            }
        });


    }
}
