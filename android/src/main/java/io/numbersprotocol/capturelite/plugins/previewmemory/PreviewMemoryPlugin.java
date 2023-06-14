package io.numbersprotocol.capturelite.plugins.previewmemory;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PreviewMemory")
public class PreviewMemoryPlugin extends Plugin {

    private PreviewMemory implementation;

    @Override
    public void load() {
        super.load();

        implementation = new PreviewMemory(this);
    }

    @PluginMethod
    public void echo(PluginCall call) {

        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void getAvailableMemory(PluginCall call) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            JSObject ret = new JSObject();
            ret.put("value", implementation.getAvailableMemory());
            call.resolve(ret);
        } else {
            call.reject("Call requires API level 23");
        }
    }
}
