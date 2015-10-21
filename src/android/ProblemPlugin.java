package com.yangcong345.android.phone.support.cordova.plugin;

import android.graphics.Bitmap;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.yangcong345.android.phone.YCMathApplication;
import com.yangcong345.android.phone.manager.VolleyManager;
import com.yangcong345.android.phone.utils.CommonUtils;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Copyright (c) 2014 Guanghe.tv All right reserved.
 * --------------------<-.->-----------------------
 * Author:      Nono(陈凯)
 * CreateDate:  15/10/20
 * Description: exp...
 * Version:     1.0.0
 */
public class ProblemPlugin extends CordovaPlugin {

    private static final String ACTION_LOAD_PROBLEM = "loadProblem";//加载题目
    private static final String ACTION_LOAD_IMAGE = "loadImage";// 加载图片

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
//        this.
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (ACTION_LOAD_PROBLEM.equals(action)) {
            loadProblem(args, callbackContext);
            return true;
        } else if (ACTION_LOAD_IMAGE.equals(action)) {
            loadImage(args, callbackContext);
            return true;
        } else {
            callbackContext.error(action + ":action not define!");
            return false;
        }
    }

    /**
     * 加载题目
     *
     * @param args
     * @param callbackContext
     */
    private void loadProblem(JSONArray args, CallbackContext callbackContext) {
        JSONObject reslutJO = new JSONObject();
        try {
            reslutJO.put("title", "title测试");
            reslutJO.put("content", "content测试");
            callbackContext.success(reslutJO);
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error(e.getMessage());
        }

    }

    /**
     * 加载图片
     *
     * @param args
     * @param callbackContext
     */
    private void loadImage(JSONArray args, final CallbackContext callbackContext) {
        if (args == null || args.length() < 1) {
            callbackContext.error(ACTION_LOAD_IMAGE + " args is null");
        } else {
            callbackContext.success("image test");

//            try {
//                JSONObject jo = args.getJSONObject(1);
//                String url = jo.getString("url");
//                VolleyManager.getInstance(YCMathApplication.getInstance().getApplicationContext()).getImageLoader().get(url, new ImageLoader.ImageListener() {
//                    @Override
//                    public void onResponse(ImageLoader.ImageContainer imageContainer, boolean b) {
//                        Bitmap bitmap = imageContainer.getBitmap();
//                        if (bitmap != null) {
//                            String result = CommonUtils.bitmapToBase64(bitmap);
//                            if (result != null){
//                                callbackContext.success(result);
//                            }else {
//                                callbackContext.error("bitmap2base64 failed");
//                            }
//                        }else {
//                            callbackContext.error("bitmap is null ");
//
//                        }
//                    }
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        callbackContext.error(volleyError.getMessage());
//
//                    }
//                });
//            } catch (JSONException e) {
//                callbackContext.error(e.getMessage());
//            }

        }
    }
}
