###How to install plugin
1. Install Everyplay library as [integration document](https://developers.everyplay.com/documentation/iOS-Everyplay-Tutorial)
2. Run command:
`cordova plugin add path_to_plugin
`

###Available functions in plugin
1. Check user logged in
>everyplay.loggedIn(success_function(isSuccess){...}, error_function(){...})
2. Request Access (log in)
>everyplay.requestAccess(success_function(isSuccess){...}, null);
3. Remove Access (log out)
>everyplay.removeAccess(null, null);
4. Load user
> everyplay.loadUser(success_function(user_data){...}, error_function(){...})
5. Load videos
> everyplay.loadVideos(success_function(videos_data){...}, error_function(){...})
6. Play Video (object from load videos)
> everyplay.playVideo(video_object, null, null); 
7. Show Everyplay
> everyplay.showEveryplay(null, null);
8. Show Everyplay to Sharing Modal (after recording)
> everyplay.showEveryplaySharingModal(null, null);
9. Check device is Recording
> everyplay.isRecording(success_function(isRecording){...}, error_function(){...})
10. Start Recording
> everyplay.startRecording(null, null);
11. Stop Recording
> everyplay.stopRecording(null, null);
12. Play last recording
> everyplay.playLastRecording(null, null);
13. Snapshot Render Buffer
> everyplay.snapshotRenderbuffer(null, null);