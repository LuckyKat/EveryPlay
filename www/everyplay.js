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
}
    
};