package br.edu.posgames.megaman;

import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import android.os.Environment;
import java.io.File;

public class NativeScreenshot
{
    public static void ShareScreenshot(Context context)
    {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("image/jpeg");
        share.putExtra(Intent.EXTRA_STREAM, Uri.parse(
                Environment.getExternalStorageDirectory() + File.separator +
                        "temporary_file.jpg"
        ));
        context.startActivity(Intent.createChooser(share, "Share image"));
    }
}