package io.numbersprotocol.capturelite.plugins.previewmemory;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

public class PreviewMemory {

    PreviewMemoryPlugin delegate;

    public PreviewMemory(PreviewMemoryPlugin delegate) {
        this.delegate = delegate;
    }

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public long getAvailableMemory() {
        ActivityManager activityManager = (ActivityManager) delegate
                .getActivity()
                .getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);

        return  memoryInfo.availMem;
    }
}
