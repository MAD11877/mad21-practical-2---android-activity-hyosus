package sg.edu.np.mad.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    User u = new User("MAD","😎",0,false);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView header = findViewById(R.id.header);
        TextView desc = findViewById(R.id.description);

        User u = new User("MAD","😎",0,false);

        Button fllw = findViewById(R.id.followBtn);

        header.setText(u.name);
        desc.setText(u.description);

        fllw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(String.valueOf(u.isFollowed())) {
                    case "true":
                        u.followed = false;
                        fllw.setText("Unfollow");

                        break;
                    case "false":
                        u.followed = true;
                        fllw.setText("Follow");
                }
            }
        });
    }

//    public void follow(View view){
//        Button fllw = findViewById(R.id.followBtn);
//        switch(String.valueOf(u.isFollowed())) {
//        fllw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch(String.valueOf(u.isFollowed())) {
//                    case "true":
//                        u.followed = false;
//                        fllw.setText("Unfollow");
//
//                        break;
//                    case "false":
//                        u.followed = true;
//                        fllw.setText("Follow");
//                }
//            }
//        });
//    }
//}
}

