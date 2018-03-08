package toast.me.customtoast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by sabari on 8/3/18.
 */

public class Toastmsg {
    public static void showtoast(Context cxt, String msg){
        Toast.makeText(cxt, "Yes,Success!!", Toast.LENGTH_LONG).show();
    }
}
