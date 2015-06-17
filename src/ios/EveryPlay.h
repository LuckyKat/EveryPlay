#import <Cordova/CDV.h>

@interface EveryPlay : CDVPlugin

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

@end