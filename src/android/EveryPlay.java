package com.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.everyplay.Everyplay.Everyplay;
import com.everyplay.Everyplay.IEveryplayListener;
import com.everyplay.Everyplay.view.cb;

import android.util.Log;

public class EveryPlay extends CordovaPlugin implements IEveryplayListener {
    
    public static final String TAG = "EveryPlay";

    private static String CLIENT_ID = "95e54f06baa3c1048a602b1b0d154f0244160ded";
    private static String CLIENT_SECRET = "ec753a5c167d43918ca11096d870134bde537b7a";
    private static String REDIRECT_URI = "https://m.everyplay.com/auth";
    
    private CallbackContext callbackContext; 
    
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        // TODO Auto-generated method stub
        super.initialize(cordova, webView);
        Log.e(TAG, "initialize");
        Everyplay.configureEveryplay(CLIENT_ID, CLIENT_SECRET, REDIRECT_URI);
        Everyplay.initEveryplay(this, this.cordova.getActivity());
        
    }
    @Override
    public boolean execute(String action, JSONArray data, final CallbackContext cb) throws JSONException {

        if (action.equals(API_LOGGED_IN)) {
            Log.e(TAG, API_LOGGED_IN);
            cb.sendPluginResult(new PluginResult(Status.OK, Everyplay.getAccessToken() != null));
            return true;

        } else if (action.equals(API_REQUEST_ACCESS)) {
            
            Log.e(TAG, API_REQUEST_ACCESS);
            
            this.callbackContext = cb;
            Everyplay.authorizeUser();
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    PluginResult result = new PluginResult(PluginResult.Status.NO_RESULT, "");
                    result.setKeepCallback(true);
                    cb.sendPluginResult(result);
                }
            });
             
            return true;
            
        }  else if (action.equals(API_REMOVE_ACCESS)) {
            Log.e(TAG, API_REMOVE_ACCESS);

            this.callbackContext = cb;
            Everyplay.deauthorizeUser();
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    PluginResult result = new PluginResult(PluginResult.Status.NO_RESULT, "");
                    result.setKeepCallback(true);
                    cb.sendPluginResult(result);
                }
            });
            
            
            return true;
            
        }  else if (action.equals(API_LOAD_USER)) {
            
            Log.e(TAG, API_LOAD_USER);
            // NOT SUPPORTED THIS API
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cb.success();
                }
            });
            
            
            return true;
            
        }  else if (action.equals(API_LOAD_VIDEOS)) {
            
            Log.e(TAG, API_LOAD_VIDEOS);
            // NOT SUPPORTED THIS API
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cb.success(); 
                }
            });
            
            
            return true;
            
        }  else if (action.equals(API_PLAY_VIDEO)) {
            
            Log.e(TAG, API_PLAY_VIDEO + ": " + data.getString(0));
            final String link = data.getString(0);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.playVideo(link);
                    cb.success();
                }
            });
            
            return true;
            
        }  else if (action.equals(API_SHOW_EVERYPLAY)) {
            
            Log.e(TAG, API_SHOW_EVERYPLAY);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.showEveryplay();
                    cb.success();
                }
            });
            
            return true;
            
        }  else if (action.equals(API_SHOW_EVERYPLAY_SHARING_MODAL)) {
            
            Log.e(TAG, API_SHOW_EVERYPLAY_SHARING_MODAL);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.showEveryplaySharingModal();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_IS_RECORDING)) {
            
            Log.e(TAG, API_IS_RECORDING);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    PluginResult result = new PluginResult(PluginResult.Status.OK, Everyplay.isRecording());
                    cb.sendPluginResult(result);
                }
            });
            
            return true;
            
        } else if (action.equals(API_IS_RECORDING_SUPPORTED)) {
            
            Log.e(TAG, API_IS_RECORDING_SUPPORTED);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    PluginResult result = new PluginResult(PluginResult.Status.OK, Everyplay.isRecordingSupported());
                    cb.sendPluginResult(result);
                }
            });
            
            return true;
            
        } else if (action.equals(API_START_RECORDING)) {
            
            Log.e(TAG, API_START_RECORDING);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.startRecording();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_STOP_RECORDING)) {
            
            Log.e(TAG, API_STOP_RECORDING);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.stopRecording();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_PLAY_LAST_RECORDING)) {
            
            Log.e(TAG, API_STOP_RECORDING);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.playLastRecording();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_SNAPSHOT_RENDERBUFFER)) {
            
            Log.e(TAG, API_SNAPSHOT_RENDERBUFFER);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.snapshotRenderbuffer();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_PAUSE_RECORDING)) {
            
            Log.e(TAG, API_PAUSE_RECORDING);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.pauseRecording();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_IS_PAUSED)) {
            
            Log.e(TAG, API_IS_PAUSED);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    PluginResult result = new PluginResult(PluginResult.Status.OK, Everyplay.isPaused());
                    cb.sendPluginResult(result);
                }
            });
            
            return true;
            
        } else if (action.equals(API_RESUME_RECORDING)) {
            
            Log.e(TAG, API_RESUME_RECORDING);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.resumeRecording();
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_IS_DISABLE_SINGLE_CORE_DEVICES)) {
            
            Log.e(TAG, API_IS_DISABLE_SINGLE_CORE_DEVICES);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    PluginResult result = new PluginResult(PluginResult.Status.OK, Everyplay.isSingleCoreDevice());
                    cb.sendPluginResult(result);
                }
            });
            
            return true;
            
        } else if (action.equals(API_SET_DISABLE_SINGLE_CORE_DEVICES)) {
            
            Log.e(TAG, API_SET_DISABLE_SINGLE_CORE_DEVICES);
            final boolean isDisable = data.getBoolean(0);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.setDisableSingleCoreDevices(isDisable ? 1 : 0);
                    PluginResult result = new PluginResult(PluginResult.Status.OK, Everyplay.isSingleCoreDevice());
                    cb.sendPluginResult(result);
                }
            });
            
            return true;
            
        } else if (action.equals(API_GET_LOW_MEMORY_DEVICE)) {
            
            Log.e(TAG, API_GET_LOW_MEMORY_DEVICE);
            // NOT SUPPORTED THIS API
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
             
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_SET_LOW_MEMORY_DEVICE)) {
            
            Log.e(TAG, API_SET_LOW_MEMORY_DEVICE);
            final boolean low = data.getBoolean(0);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.setLowMemoryDevice(low ? 1 : 0);
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_GET_MAX_RECORDING_MINUTES_LENGTH)) {
            
            Log.e(TAG, API_GET_MAX_RECORDING_MINUTES_LENGTH);
            // NOT SUPPORTED THIS API
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_SET_MAX_RECORDING_MINUTES_LENGTH)) {
            
            Log.e(TAG, API_SET_MAX_RECORDING_MINUTES_LENGTH);
            final int mins = data.getInt(0);
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.setMaxRecordingMinutesLength(mins);
                    cb.success();
                }
            });
            
            return true;
            
        } else if (action.equals(API_MERGE_SESSION_DEVELOPER_DATA)) {
            
            Log.e(TAG, API_MERGE_SESSION_DEVELOPER_DATA);
            final JSONObject object = data.getJSONObject(0);
            Log.e(TAG, object.toString());
            
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Everyplay.mergeSessionDeveloperData(object);
                    cb.success();
                }
            });
            
            return true;
            
        } else {
            
            return false;

        }
    }
    
    private static final String API_LOGGED_IN = "loggedIn";
    private static final String API_REQUEST_ACCESS = "requestAccess";
    private static final String API_REMOVE_ACCESS = "removeAccess";
    private static final String API_LOAD_USER = "loadUser";
    private static final String API_LOAD_VIDEOS = "loadVideos";
    private static final String API_PLAY_VIDEO = "playVideo";
    private static final String API_SHOW_EVERYPLAY = "showEveryplay";
    private static final String API_SHOW_EVERYPLAY_SHARING_MODAL = "showEveryplaySharingModal";
    private static final String API_IS_RECORDING = "isRecording";
    private static final String API_IS_RECORDING_SUPPORTED = "isRecordingSupported";
    private static final String API_START_RECORDING = "startRecording";
    private static final String API_STOP_RECORDING = "stopRecording";
    private static final String API_PLAY_LAST_RECORDING = "playLastRecording";
    private static final String API_SNAPSHOT_RENDERBUFFER = "snapshotRenderbuffer";
    private static final String API_PAUSE_RECORDING = "pauseRecording";
    private static final String API_IS_PAUSED = "isPaused";
    private static final String API_IS_DISABLE_SINGLE_CORE_DEVICES = "isDisableSingleCoreDevices";
    private static final String API_SET_DISABLE_SINGLE_CORE_DEVICES = "setDisableSingleCoreDevices";
    private static final String API_GET_LOW_MEMORY_DEVICE = "getLowMemoryDevice";
    private static final String API_SET_LOW_MEMORY_DEVICE = "setLowMemoryDevice";
    private static final String API_GET_MAX_RECORDING_MINUTES_LENGTH = "getMaxRecordingMinutesLength";
    private static final String API_SET_MAX_RECORDING_MINUTES_LENGTH = "setMaxRecordingMinutesLength";
    private static final String API_RESUME_RECORDING = "resumeRecording";
    private static final String API_MERGE_SESSION_DEVELOPER_DATA = "mergeSessionDeveloperData";

    @Override
    public void onEveryplayAccountDidChange() {
        if (this.callbackContext != null) {
            this.cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    Log.e(TAG, "onEveryplayAccountDidChange: " + Everyplay.getAccessToken());
                    
                    PluginResult result = new PluginResult(PluginResult.Status.OK, Everyplay.getAccessToken() != null);
                    result.setKeepCallback(false); 
                    callbackContext.sendPluginResult(result);
                    callbackContext = null;
                }
            });
            
            
        }
        
    }
    @Override
    public void onEveryplayFaceCamRecordingPermission(int arg0) {
        // TODO Auto-generated method stub
        
    } 
    @Override
    public void onEveryplayFaceCamSessionStarted() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayFaceCamSessionStopped() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayHidden() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayReadyForRecording(int arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayRecordingStarted() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayRecordingStopped() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayShown() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayThumbnailReadyAtFilePath(String arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayThumbnailReadyAtTextureId(int arg0, int arg1) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayUploadDidComplete(int arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayUploadDidProgress(int arg0, double arg1) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onEveryplayUploadDidStart(int arg0) {
        // TODO Auto-generated method stub
        
    }
} 