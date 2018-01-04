package developers.com.br.poc_maxmilhas.Helpers;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by AndreCoelho on 03/01/2018.
 */

public class MessageHelpers {

    public static void Alert(Context context, String title, String messagem){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(messagem);

        final AlertDialog dialog = builder.create();
        dialog.show();

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.cancel();
            }
        });
    }
}
