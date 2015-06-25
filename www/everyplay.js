module.exports = {
loggedIn: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "loggedIn", []);
},
    
requestAccess: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "requestAccess", []);
},
    
removeAccess: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "removeAccess", []);
},
    
loadUser: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "loadUser", []);
},
    
loadVideos: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "loadVideos", []);
},
    
playVideo: function (video, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "playVideo", [video]);
},
    
showEveryplay: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "showEveryplay", []);
},
    
showEveryplaySharingModal: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "showEveryplaySharingModal", []);
},
    
isRecording: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "isRecording", []);
},
    
isRecordingSupported: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "isRecordingSupported", []);
},
    
startRecording: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "startRecording", []);
},
    
stopRecording: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "stopRecording", []);
},
 
playLastRecording: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "playLastRecording", []);
},

snapshotRenderbuffer: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "snapshotRenderbuffer", []);
},

resumeRecording: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "resumeRecording", []);
},

pauseRecording: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "pauseRecording", []);
},

isPaused: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "isPaused", []);
},

isDisableSingleCoreDevices: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "isDisableSingleCoreDevices", []);
},

setDisableSingleCoreDevices: function (isDisable, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "setDisableSingleCoreDevices", [isDisable]);
},

getLowMemoryDevice: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "getLowMemoryDevice", []);
},

setLowMemoryDevice: function (isOptimize, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "setLowMemoryDevice", [isOptimize]);
},

getMaxRecordingMinutesLength: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "getMaxRecordingMinutesLength", []);
},

setMaxRecordingMinutesLength: function (minutes, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "setMaxRecordingMinutesLength", [minutes]);
},

mergeSessionDeveloperData: function (data, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "EveryPlay", "mergeSessionDeveloperData", [data]);
}

    
};