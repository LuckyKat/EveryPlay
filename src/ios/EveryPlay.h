#import <Cordova/CDV.h>
#import <Everyplay/Everyplay.h>

@interface EveryPlay : CDVPlugin<EveryplayDelegate>

- (void) loggedIn:(CDVInvokedUrlCommand*)command;

- (void)requestAccess:(CDVInvokedUrlCommand*)command;

- (void)removeAccess:(CDVInvokedUrlCommand*)command;

- (void)loadUser:(CDVInvokedUrlCommand*)command;

- (void)loadVideos:(CDVInvokedUrlCommand*)command;

- (void)playVideo:(CDVInvokedUrlCommand*)command;

- (void)showEveryplay:(CDVInvokedUrlCommand*)command;

- (void)showEveryplaySharingModal:(CDVInvokedUrlCommand*)command;

- (void)isRecording:(CDVInvokedUrlCommand*)command;

- (void)isRecordingSupported:(CDVInvokedUrlCommand*)command;

- (void)startRecording:(CDVInvokedUrlCommand*)command;

- (void)stopRecording:(CDVInvokedUrlCommand*)command;

- (void)playLastRecording:(CDVInvokedUrlCommand*)command;

- (void)snapshotRenderbuffer:(CDVInvokedUrlCommand*)command;

- (void)resumeRecording:(CDVInvokedUrlCommand*)command;

- (void)pauseRecording:(CDVInvokedUrlCommand*)command;

- (void)isPaused:(CDVInvokedUrlCommand*)command;

- (void)isDisableSingleCoreDevices:(CDVInvokedUrlCommand*)command;

- (void)setDisableSingleCoreDevices:(CDVInvokedUrlCommand*)command;

- (void)getLowMemoryDevice:(CDVInvokedUrlCommand*)command;

- (void)setLowMemoryDevice:(CDVInvokedUrlCommand*)command;

- (void)getMaxRecordingMinutesLength:(CDVInvokedUrlCommand*)command;

- (void)setMaxRecordingMinutesLength:(CDVInvokedUrlCommand*)command;

- (void)mergeSessionDeveloperData:(CDVInvokedUrlCommand*)command;

@end