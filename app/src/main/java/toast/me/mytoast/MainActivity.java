package toast.me.mytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import toast.me.customtoast.Toastmsg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toastmsg.showtoast(this,"msg");
    }
}
