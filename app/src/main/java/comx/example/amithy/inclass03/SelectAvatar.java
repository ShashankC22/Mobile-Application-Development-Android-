package comx.example.amithy.inclass03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectAvatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_avatar);
        setTitle("Select Avatar");

        final Intent i= new Intent();
        findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("im1","1");
                setResult(RESULT_OK,i);
                finish();
            }
        });
        findViewById(R.id.imageButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("im1","2");
                setResult(RESULT_OK,i);
                finish();
            }
        });
        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("im1","3");
                setResult(RESULT_OK,i);
                finish();
            }
        });
        findViewById(R.id.imageButton5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("im1","4");
                setResult(RESULT_OK,i);
                finish();
            }
        });
        findViewById(R.id.imageButton6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("im1","5");
                setResult(RESULT_OK,i);
                finish();
            }
        });
        findViewById(R.id.imageButton7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("im1","6");
                setResult(RESULT_OK,i);
                finish();
            }
        });

    }
}
