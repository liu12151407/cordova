package org.apache.cordova.iboss;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * 原生和H5的桥梁
 * https://blog.csdn.net/u013491677/article/details/51985390
 */
public class DGGHtmlPlugin extends CordovaPlugin {
    private CallbackContext callback;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        this.callback = callbackContext;
        switch (action) {
            case "changeTitle":
//                changeTitle(action, args);
                callback.success();
                break;
            case "getLoginUserInfo":
                break;
            default:
                callback.error("未找到相应方法");
        }
        return true;
    }

//    /**
//     * 改变顶部Title
//     *
//     * @param action
//     * @param args
//     */
//    private void changeTitle(String action, JSONArray args) {
//        RxBus.getInstance().post(new HtmlEvent(action, args));
//    }
}
