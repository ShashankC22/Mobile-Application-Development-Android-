package comx.example.amithy.inclass03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class DisplayProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_profile);
        setTitle("Diaplay My Profile");
        Intent data = getIntent();
        Bundle b=data.getExtras();
        Student student=(Student)b.getParcelable("obj");
        final String fname=student.fastname;
        final String lname = student.lastname;
        final String num = student.studentid;
       final String img1 = student.image;
       final String radio_value=student.radio;

        final int img = Integer.parseInt(student.image);
                      Log.d("demo","name is:"+ img);

        TextView fn=findViewById(R.id.textView7);
        String name=fname + " " + lname;
        fn.setText(name);
       TextView ln=findViewById(R.id.textView8);
        ln.setText(num);
        TextView num1=findViewById(R.id.textView9);
        num1.setText(radio_value);

        ImageButton im=(ImageButton)findViewById(R.id.imageButton8);
        im.setImageResource(0);

        if(img == 1){

            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.avatar_f_1));
        }
        else if( img == 2){
            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.avatar_f_2));

        }
        else if( img == 3){
            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.avatar_f_3));

        }
        else if( img == 4){
            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.avatar_m_1));

        }
        else if( img == 5){
            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.avatar_m_2));

        }
        else if( img == 6){
            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.avatar_m_3));

        }else{
            findViewById(R.id.imageButton8).setBackground(getResources().getDrawable(R.drawable.select_image));

        }

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent();
                finish();

            }
        });




    }
}
